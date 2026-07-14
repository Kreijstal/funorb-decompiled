/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static int[] field_d;
    static String[] field_c;
    static int field_a;
    static uf field_b;
    static int[][] field_f;
    static int[] field_e;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            try {
                var2 = param1.getDocumentBase().getFile();
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (!((var3 ^ -1) > -1)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(ah.a(var5, param1, (byte) 25), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param0 != -16666) {
                ae.a((byte) 11);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(CharSequence[] param0, byte param1, int param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = HoldTheLine.field_D;
        if (param2 == -1) {
          return "";
        } else {
          if (-2 == param2) {
            var10 = param0[param3];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          } else {
            var4 = param2 + param3;
            var5 = 0;
            var6_int = param3;
            L0: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                var7 = param3;
                L1: while (true) {
                  if (var7 >= var4) {
                    L2: {
                      if (param1 == -44) {
                        break L2;
                      } else {
                        field_e = null;
                        break L2;
                      }
                    }
                    return var6.toString();
                  } else {
                    var8 = param0[var7];
                    if (var8 == null) {
                      StringBuilder discarded$2 = var6.append("null");
                      var7++;
                      continue L1;
                    } else {
                      StringBuilder discarded$3 = var6.append(var8);
                      var7++;
                      continue L1;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param0[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != 96) {
            Object var2 = null;
            String discarded$0 = ae.a((CharSequence[]) null, (byte) -61, -127, 10);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Racing Veteran", "Racing Legend", "Performance Racer", "Alpine Racer", "Endurance Racer", "Night Racer", "Master Navigator", "Faultless Navigator", "Violent Tendencies", "Speed Demon", "Defensive Driver", "By Will Alone", "Divine Intervention", "Strangelove Award", "Pacesetter", "End Undead"};
        field_d = new int[8192];
        field_f = new int[][]{new int[1], new int[1], new int[1], new int[1], new int[2]};
        field_e = new int[256];
    }
}
