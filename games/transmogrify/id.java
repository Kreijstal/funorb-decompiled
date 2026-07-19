/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static String[] field_a;

    public static void a(byte param0) {
        sg discarded$0 = null;
        field_a = null;
        if (param0 < 11) {
            discarded$0 = id.a(true, (byte) -35);
        }
    }

    final static sg a(boolean param0, byte param1) {
        sg discarded$5 = null;
        int discarded$6 = 0;
        String discarded$7 = null;
        int discarded$8 = 0;
        String discarded$9 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hj var8 = null;
        rk var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int[] stackIn_29_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_28_0 = null;
        Object stackOut_27_0 = null;
        L0: {
          var7 = Transmogrify.field_A ? 1 : 0;
          var8 = nf.field_l;
          var3 = var8.d((byte) 95);
          kd.field_a = 127 & var3;
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          a.field_bb = stackIn_3_0 != 0;
          sh.field_b = var8.d((byte) 106);
          sj.field_m = var8.e((byte) -51);
          if ((kd.field_a ^ -1) != -3) {
            jd.field_b = 0;
            u.field_d = 0;
            break L1;
          } else {
            u.field_d = var8.a((byte) -108);
            jd.field_b = var8.g((byte) 124);
            if (var7 == 0) {
              break L1;
            } else {
              jd.field_b = 0;
              u.field_d = 0;
              break L1;
            }
          }
        }
        L2: {
          if (param1 == 9) {
            break L2;
          } else {
            discarded$5 = id.a(true, (byte) -86);
            break L2;
          }
        }
        L3: {
          if ((var8.d((byte) 92) ^ -1) != -2) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        L4: {
          L5: {
            var4 = stackIn_13_0;
            kb.field_o = var8.g(12248);
            if (var4 != 0) {
              break L5;
            } else {
              fd.field_i = kb.field_o;
              if (var7 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          fd.field_i = var8.g(param1 ^ 12241);
          break L4;
        }
        L6: {
          if (-2 == (kd.field_a ^ -1)) {
            discarded$6 = var8.a((byte) -90);
            discarded$7 = var8.g(12248);
            break L6;
          } else {
            if (-5 != (kd.field_a ^ -1)) {
              break L6;
            } else {
              discarded$8 = var8.a((byte) -90);
              discarded$9 = var8.g(12248);
              break L6;
            }
          }
        }
        L7: {
          L8: {
            if (param0) {
              break L8;
            } else {
              l.field_c = u.a(false, 80, var8);
              a.field_T = null;
              if (var7 == 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          var5 = var8.a((byte) -110);
          try {
            L9: {
              L10: {
                var9 = vl.field_C.b(1, var5);
                l.field_c = var9.d((byte) -127);
                if (!fd.field_i.equals(w.field_a)) {
                  stackOut_28_0 = var9.field_m;
                  stackIn_29_0 = stackOut_28_0;
                  break L10;
                } else {
                  stackOut_27_0 = null;
                  stackIn_29_0 = (int[]) ((Object) stackOut_27_0);
                  break L10;
                }
              }
              a.field_T = stackIn_29_0;
              decompiledRegionSelector0 = 0;
              break L9;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L11: {
              var6 = (Exception) (Object) decompiledCaughtException;
              d.a((Throwable) ((Object) var6), -120, "CC1");
              a.field_T = null;
              l.field_c = null;
              decompiledRegionSelector0 = 1;
              break L11;
            }
          }
          if (decompiledRegionSelector0 == 0) {
            return new sg(param0);
          } else {
            break L7;
          }
        }
        return new sg(param0);
    }

    static {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
