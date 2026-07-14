/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class db {
    static boolean field_d;
    static int field_b;
    String field_e;
    static String[] field_g;
    static dk field_h;
    static String field_f;
    static tg field_a;
    int field_c;

    final java.net.Socket a(byte param0) throws IOException {
        int var2 = -128 / ((param0 - 3) / 40);
        return new java.net.Socket(((db) this).field_e, ((db) this).field_c);
    }

    final static de a(byte param0, java.applet.Applet param1) {
        int var4 = 0;
        de var5 = null;
        int var6 = SteelSentinels.field_G;
        String var2 = ha.a(param1, "jagex-last-login-method", -15645);
        if (!(var2 != null)) {
            return h.field_Y;
        }
        if (param0 > -41) {
            field_a = null;
        }
        de[] var3 = sh.b(-26);
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (!(!var5.a(var2, 8))) {
                return var5;
            }
        }
        return h.field_Y;
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
        Object var12 = null;
        var11 = SteelSentinels.field_G;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (-1 < (var6_int ^ -1)) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L1: while (true) {
              var8 = param0.indexOf("<%", var5);
              if ((var8 ^ -1) <= -1) {
                var5 = var8 + 2;
                L2: while (true) {
                  L3: {
                    if (var3 <= var5) {
                      break L3;
                    } else {
                      if (!oa.a(-4278, param0.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var9 = param0.substring(2 + var8, var5);
                  if (fg.a((CharSequence) (Object) var9, -114)) {
                    if (var5 >= var3) {
                      continue L1;
                    } else {
                      if (62 != param0.charAt(var5)) {
                        continue L1;
                      } else {
                        var5++;
                        var10 = dj.a((CharSequence) (Object) var9, -115);
                        StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                        StringBuilder discarded$4 = var6.append(param2[var10]);
                        var7 = var5;
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                L4: {
                  StringBuilder discarded$5 = var6.append(param0.substring(var7));
                  if (param1 <= -11) {
                    break L4;
                  } else {
                    var12 = null;
                    db.a(-107, (java.awt.Component) null);
                    break L4;
                  }
                }
                return var6.toString();
              }
            }
          } else {
            var5 = var6_int - -2;
            L5: while (true) {
              L6: {
                if (var5 >= var3) {
                  break L6;
                } else {
                  if (!oa.a(-4278, param0.charAt(var5))) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref = param0.substring(2 + var6_int, var5);
              if (fg.a((CharSequence) (Object) var7_ref, -110)) {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (param0.charAt(var5) == 62) {
                    var5++;
                    var8 = dj.a((CharSequence) (Object) var7_ref, -109);
                    var4 = var4 + (param2[var8].length() + (var6_int + -var5));
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_g = null;
        field_h = null;
        if (!param0) {
            field_d = false;
        }
    }

    final static String b(int param0) {
        if (param0 != 0) {
            field_b = 40;
        }
        return d.field_U;
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = SteelSentinels.field_G;
        for (var1 = 0; var1 < 10000; var1++) {
            k.field_Cb[var1].i(-15809);
        }
        if (param0 != 10000) {
            field_f = null;
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) wc.field_i);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) wc.field_i);
        if (param0 != -1) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Anti-rocket weapon. Works with AMARDS.", "Can be targeted. Works with AMARDS.", "", "", "Can be targeted. Works with AMARDS.", "", "Recommended for use with targeter.", "", "", "Anti-rocket weapon.", "", "Anti-rocket weapon. Works with AMARDS.", "Can be targeted. Works with AMARDS.", "", "", "", "", "Can be targeted. Works with AMARDS.", "", "", "", "", "", "", "", "", "Can be targeted. Works with AMARDS.", "", "", "", "Can be targeted.", "", "Can only be fitted onto the Golem chassis.", "", "Recommended for use with targeter.", "Can be targeted."};
        field_f = "Training drone";
    }
}
