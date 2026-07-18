/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
    }

    final static sg a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hj var8 = null;
        rk var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_24_0 = null;
        Object stackOut_23_0 = null;
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
          if (kd.field_a != 2) {
            jd.field_b = 0;
            u.field_d = 0;
            break L1;
          } else {
            u.field_d = var8.a((byte) -108);
            jd.field_b = var8.g((byte) 124);
            break L1;
          }
        }
        L2: {
          if (param1 == 9) {
            break L2;
          } else {
            sg discarded$5 = id.a(true, (byte) -86);
            break L2;
          }
        }
        L3: {
          if (var8.d((byte) 92) != 1) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_11_0;
          kb.field_o = var8.g(12248);
          if (var4 != 0) {
            fd.field_i = var8.g(param1 ^ 12241);
            break L4;
          } else {
            fd.field_i = kb.field_o;
            break L4;
          }
        }
        L5: {
          if (kd.field_a == 1) {
            int discarded$6 = var8.a((byte) -90);
            String discarded$7 = var8.g(12248);
            break L5;
          } else {
            if (kd.field_a != 4) {
              break L5;
            } else {
              int discarded$8 = var8.a((byte) -90);
              String discarded$9 = var8.g(12248);
              break L5;
            }
          }
        }
        if (param0) {
          var5 = var8.a((byte) -110);
          try {
            L6: {
              L7: {
                var9 = vl.field_C.b(1, var5);
                l.field_c = var9.d((byte) -127);
                if (!fd.field_i.equals((Object) (Object) w.field_a)) {
                  stackOut_24_0 = var9.field_m;
                  stackIn_25_0 = stackOut_24_0;
                  break L7;
                } else {
                  stackOut_23_0 = null;
                  stackIn_25_0 = (int[]) (Object) stackOut_23_0;
                  break L7;
                }
              }
              a.field_T = stackIn_25_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            d.a((Throwable) (Object) var6, -120, "CC1");
            a.field_T = null;
            l.field_c = null;
            return new sg(param0);
          }
          return new sg(param0);
        } else {
          l.field_c = u.a(false, 80, (oa) (Object) var8);
          a.field_T = null;
          return new sg(param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
