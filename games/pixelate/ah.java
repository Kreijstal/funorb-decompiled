/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ah extends lm {
    int field_t;
    static String field_u;

    final static aa a(byte param0, int param1, int param2, int param3) {
        Object var4;
        int var5;
        int var6;
        int var7;
        aa var8_ref_aa;
        int var9;
        int var10_int;
        int var13;
        boolean stackIn_44_0 = false;
        boolean stackIn_48_0 = false;
        boolean stackIn_69_0 = false;
        boolean stackIn_73_0 = false;
        boolean stackIn_81_0 = false;
        boolean stackIn_86_0 = false;
        boolean stackIn_90_0 = false;
        boolean stackIn_101_0 = false;
        boolean stackIn_105_0 = false;
        boolean stackIn_111_0 = false;
        boolean stackIn_115_0 = false;
        int var8;
        String var10;
        String var11;
        int var12;
        aa var14;
        aa var16;
        int var7Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime2Lifetime1;
        var13 = Pixelate.field_H ? 1 : 0;
        l.field_p.field_Fb.field_L.e(33);
        var4 = null;
        var5 = 0;
        var6 = 0;
        for (var7 = -1 + sd.field_L; var7 >= 0; var7--) {
          var8_ref_aa = de.field_e[var7];
          var9 = 0;
          if (!ln.field_q &&
            var5 < ee.field_d) {
            var10_int = kl.a(var8_ref_aa.field_j, 0);
            if (var8_ref_aa.a((byte) -54) >= var10_int && (var8_ref_aa.field_a ||
              !i.a(-640, var8_ref_aa.field_n))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_aa.field_q = null;
          } else {
            var5++;
            if (null == var8_ref_aa.field_q ||
              si.field_P) {
              if (var8_ref_aa.field_q != null) {
              }
              var10 = uc.a(var8_ref_aa, -77);
              var11 = var10 + jl.b(var8_ref_aa.field_g);
              var12 = lc.a(var8_ref_aa, false);
              var8_ref_aa.field_q = new ak(0L, oi.field_e, var11);
              var8_ref_aa.field_q.field_y = ((16711423 & oi.field_e.field_y) >> 1) + (var12 - (var12 >> 1 & 8355711));
              var8_ref_aa.field_q.field_N = var12;
              var6 = var6 + param1;
              var8_ref_aa.field_q.field_pb = ((oi.field_e.field_pb & 16711422) >> 1) - ((var12 & 16711422) >> 1) + var12;
              var8_ref_aa.field_q.field_Db = vl.field_Q;
            }
          }
        }
        var7Lifetime1 = 0;
        if (param0 >= -90) {
          ah.g(-107);
          for (var8 = 0; sd.field_L > var8; var8++) {
            var14 = de.field_e[var8];
            if (var14.field_q != null) {
              l.field_p.field_Fb.a(var14.field_q, (byte) 26);
              var14.field_q.a(var7Lifetime1, param1, param3, 256, var14.field_q.g(0));
              if (var14.field_q.field_P != 0) {
                var4 = var14;
              }
              var7Lifetime1 = var7Lifetime1 + param1;
            }
          }
          var8Lifetime3 = l.field_p.field_Fb.field_nb + l.field_p.field_Fb.field_Z + (-var7Lifetime1 + var6);
          l.field_p.field_Fb.field_nb = l.field_p.field_Fb.field_nb - var8Lifetime3;
          l.field_p.field_Fb.field_S = l.field_p.field_Fb.field_S + var8Lifetime3;
          if (si.field_P) {
            l.field_p.field_Fb.field_nb = var7Lifetime1;
          }
          l.field_p.field_Fb.field_Z = var7Lifetime1 - l.field_p.field_Fb.field_nb;
          if (si.field_P) {
            l.field_p.field_Fb.field_wb = 0;
            l.field_p.field_Fb.field_S = -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
            qo.field_z = true;
            si.field_P = false;
          }
          if (oo.field_d &&
            ko.field_eb != null) {
            qo.field_z = true;
          }
          var9Lifetime1 = -l.field_p.field_Fb.field_Z - l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
          if (!qo.field_z) {
            l.field_p.a(-100, param1, true, param2 * 2 * param1);
            stackIn_48_0 = (var9Lifetime1 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
            qo.field_z = stackIn_48_0;
          } else {
            l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9Lifetime1;
            l.field_p.a(-100, param1, true, param2 * 2 * param1);
            stackIn_44_0 = (var9Lifetime1 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
            qo.field_z = stackIn_44_0;
          }
          return (aa) (var4);
        }
        for (var8Lifetime1 = 0; sd.field_L > var8Lifetime1; var8Lifetime1++) {
          var16 = de.field_e[var8Lifetime1];
          if (var16.field_q != null) {
            l.field_p.field_Fb.a(var16.field_q, (byte) 26);
            var16.field_q.a(var7Lifetime1, param1, param3, 256, var16.field_q.g(0));
            if (var16.field_q.field_P != 0) {
              var4 = var16;
            }
            var7Lifetime1 = var7Lifetime1 + param1;
          }
        }
        var8Lifetime2 = l.field_p.field_Fb.field_nb + l.field_p.field_Fb.field_Z + (-var7Lifetime1 + var6);
        l.field_p.field_Fb.field_nb = l.field_p.field_Fb.field_nb - var8Lifetime2;
        l.field_p.field_Fb.field_S = l.field_p.field_Fb.field_S + var8Lifetime2;
        if (!si.field_P) {
          l.field_p.field_Fb.field_Z = var7Lifetime1 - l.field_p.field_Fb.field_nb;
          if (si.field_P) {
            l.field_p.field_Fb.field_wb = 0;
            l.field_p.field_Fb.field_S = -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
            qo.field_z = true;
            si.field_P = false;
          }
          if (oo.field_d &&
            ko.field_eb != null) {
            qo.field_z = true;
            var9Lifetime2 = -l.field_p.field_Fb.field_Z - l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
            if (!qo.field_z) {
              l.field_p.a(-100, param1, true, param2 * 2 * param1);
              stackIn_101_0 = (var9Lifetime2 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
              qo.field_z = stackIn_101_0;
            } else {
              l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9Lifetime2;
              l.field_p.a(-100, param1, true, param2 * 2 * param1);
              stackIn_105_0 = (var9Lifetime2 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
              qo.field_z = stackIn_105_0;
            }
            return (aa) (var4);
          }
          var9Lifetime2Lifetime1 = -l.field_p.field_Fb.field_Z - l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
          if (!qo.field_z) {
            l.field_p.a(-100, param1, true, param2 * 2 * param1);
            stackIn_111_0 = (var9Lifetime2Lifetime1 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
            qo.field_z = stackIn_111_0;
          } else {
            l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9Lifetime2Lifetime1;
            l.field_p.a(-100, param1, true, param2 * 2 * param1);
            stackIn_115_0 = (var9Lifetime2Lifetime1 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
            qo.field_z = stackIn_115_0;
          }
          return (aa) (var4);
        }
        l.field_p.field_Fb.field_nb = var7Lifetime1;
        l.field_p.field_Fb.field_Z = var7Lifetime1 - l.field_p.field_Fb.field_nb;
        if (si.field_P) {
          l.field_p.field_Fb.field_wb = 0;
          l.field_p.field_Fb.field_S = -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
          qo.field_z = true;
          si.field_P = false;
        }
        if (!oo.field_d) {
          var9Lifetime3 = -l.field_p.field_Fb.field_Z - l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
          if (!qo.field_z) {
            l.field_p.a(-100, param1, true, param2 * 2 * param1);
            stackIn_69_0 = (var9Lifetime3 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
            qo.field_z = stackIn_69_0;
          } else {
            l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9Lifetime3;
            l.field_p.a(-100, param1, true, param2 * 2 * param1);
            stackIn_73_0 = (var9Lifetime3 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
            qo.field_z = stackIn_73_0;
          }
        } else {
          if (ko.field_eb != null) {
            qo.field_z = true;
            var9Lifetime3 = -l.field_p.field_Fb.field_Z - l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
            if (qo.field_z) {
              l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9Lifetime3;
            }
            l.field_p.a(-100, param1, true, param2 * 2 * param1);
            stackIn_81_0 = (var9Lifetime3 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
            qo.field_z = stackIn_81_0;
          } else {
            var9Lifetime3 = -l.field_p.field_Fb.field_Z - l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
            if (!qo.field_z) {
              l.field_p.a(-100, param1, true, param2 * 2 * param1);
              stackIn_86_0 = (var9Lifetime3 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
              qo.field_z = stackIn_86_0;
            } else {
              l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9Lifetime3;
              l.field_p.a(-100, param1, true, param2 * 2 * param1);
              stackIn_90_0 = (var9Lifetime3 == l.field_p.field_Fb.field_S + l.field_p.field_Fb.field_wb);
              qo.field_z = stackIn_90_0;
            }
          }
        }
        return (aa) (var4);
    }

    final static void a(int param0, byte param1) {
        try {
          try {
            cq.a(ao.a(13867), (byte) -64, new Object[]{new Integer(param0)}, "resizing");
          } catch (Throwable throwable) {
          }
          if (param1 > 69) {
            return;
          }
          field_u = (String) null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract Object a(byte param0);

    public static void g(int param0) {
        if (param0 != -520925311) {
          ah.g(-22);
          field_u = null;
          return;
        }
        field_u = null;
    }

    ah(int param0) {
        this.field_t = param0;
    }

    abstract boolean b(boolean param0);

    static {
        field_u = "Highscores";
    }
}
