/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static int[] field_d;
    private bc field_c;
    private bc field_e;
    static qr[] field_g;
    static int field_b;
    private ol field_f;
    static qr field_h;
    static int field_a;

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 0) {
            Object var6 = null;
            String discarded$0 = re.a((String) null, -43, (String[]) null);
        }
        return (int)((double)(-param0 + param3) * wm.a(param2, (byte) 114, param1)) + param0;
    }

    final static void a(java.awt.Canvas param0, boolean param1) {
        pr.a((java.awt.Component) (Object) param0, -9194);
        if (param1) {
            return;
        }
        wk.a((byte) -58, (java.awt.Component) (Object) param0);
        if (aj.field_b != null) {
            aj.field_b.a((java.awt.Component) (Object) param0, !param1 ? true : false);
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if ((var6_int ^ -1) > -1) {
            L1: {
              if (param1 == 4371) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var6 = new StringBuilder(var4);
            var5 = 0;
            var7 = 0;
            L2: while (true) {
              var8 = param0.indexOf("<%", var5);
              if (-1 >= (var8 ^ -1)) {
                var5 = 2 + var8;
                L3: while (true) {
                  L4: {
                    if (var3 <= var5) {
                      break L4;
                    } else {
                      if (!dk.a((byte) 115, param0.charAt(var5))) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param0.substring(var8 - -2, var5);
                  if (go.a(0, (CharSequence) (Object) var9)) {
                    if (var5 >= var3) {
                      continue L2;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var10 = ma.a((CharSequence) (Object) var9, 2);
                        StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                        StringBuilder discarded$4 = var6.append(param2[var10]);
                        var7 = var5;
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  } else {
                    continue L2;
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param0.substring(var7));
                return var6.toString();
              }
            }
          } else {
            var5 = var6_int + 2;
            L5: while (true) {
              L6: {
                if (var5 >= var3) {
                  break L6;
                } else {
                  if (!dk.a((byte) -83, param0.charAt(var5))) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref = param0.substring(2 + var6_int, var5);
              if (!go.a(0, (CharSequence) (Object) var7_ref)) {
                continue L0;
              } else {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (param0.charAt(var5) == 62) {
                    var5++;
                    var8 = ma.a((CharSequence) (Object) var7_ref, 2);
                    var4 = var4 + (param2[var8].length() - var5 + var6_int);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            }
          }
        }
    }

    final dp a(byte param0, int param1) {
        byte[] var4 = null;
        dp var3 = (dp) ((re) this).field_f.a((long)param1, 0);
        if (param0 != 47) {
            return null;
        }
        if (!(var3 == null)) {
            return var3;
        }
        if (-32769 >= (param1 ^ -1)) {
            var4 = ((re) this).field_c.a(1, -1, 32767 & param1);
        } else {
            var4 = ((re) this).field_e.a(1, param0 + -48, param1);
        }
        dp var3_ref = new dp();
        if (!(var4 == null)) {
            var3_ref.a(new ob(var4), 0);
        }
        if (!(32768 > param1)) {
            var3_ref.e((byte) -117);
        }
        ((re) this).field_f.a((long)param1, (Object) (Object) var3_ref, (byte) -108);
        return var3_ref;
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 <= 105) {
            return;
        }
        field_h = null;
    }

    re(int param0, bc param1, bc param2, wr param3) {
        ((re) this).field_f = new ol(64);
        ((re) this).field_e = param1;
        ((re) this).field_c = param2;
        if (null != ((re) this).field_e) {
            int discarded$0 = ((re) this).field_e.a(1, -26268);
        }
        if (((re) this).field_c != null) {
            int discarded$1 = ((re) this).field_c.a(1, -26268);
        }
    }

    final static bi[] a(bi[] param0, int param1) {
        int var2 = 0;
        bi var3 = null;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var2 = 0; param0.length > var2; var2++) {
            var3 = param0[var2];
            param0[var2].field_x = 0;
            var3.field_t = 0;
            param0[var2].field_o = param0[var2].field_z;
            param0[var2].field_p = param0[var2].field_w;
        }
        if (param1 <= 32) {
            re.a((byte) 21);
        }
        return param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 64;
    }
}
