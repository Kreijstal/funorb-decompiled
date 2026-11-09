/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    int field_a;
    static String field_i;
    static int[] field_d;
    static String[] field_g;
    int field_e;
    static String field_k;
    static gq field_c;
    static String field_b;
    int field_h;
    int field_f;
    int field_j;

    final static sq a(byte param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        sq var1;
        int var2;
        StringBuilder var3;
        int var4;
        String var5;
        Object var6;
        int var7;
        sq var8;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
          if (Territory.field_t == null) {
            return null;
          }
          if (Territory.field_t.charAt(0) != 91) {
            SliderPainter.b((byte) 34);
            continue;
          }
          break;
        }
        var2 = -25 % ((0 - param0) / 59);
        var8 = new sq();
        var1 = var8;
        Territory.field_t.substring(1, Territory.field_t.indexOf(']'));
        var3 = new StringBuilder();
        SliderPainter.b((byte) 56);
        while (null != Territory.field_t) {
          if (Territory.field_t.charAt(0) == 91) {
            var8.field_c = var3.toString();
            return var8;
          }
          if (Territory.field_t.charAt(0) == 64) {
            var4 = Territory.field_t.indexOf(' ');
            if (-1 == var4) {
              var5 = Territory.field_t.substring(1);
              var6 = null;
            } else {
              var5 = Territory.field_t.substring(1, var4);
              var6 = GameApplet.a(Territory.field_t.substring(var4), (byte) 125, ',');
            }
            if (!var5.equalsIgnoreCase("topleft")) {
              var8 = var1;
              if (var5.equalsIgnoreCase("topright")) {
                var8 = var1;
                Dialog.a((String[]) (var6), 1, var8, -75);
              } else {
                if (var5.equalsIgnoreCase("bottomleft")) {
                  var8 = var1;
                  Dialog.a((String[]) (var6), 2, var8, -92);
                } else {
                  if (var5.equalsIgnoreCase("bottomright")) {
                    var8 = var1;
                    Dialog.a((String[]) (var6), 3, var8, -40);
                  } else {
                    if (!var5.equalsIgnoreCase("tag")) {
                      var8 = var1;
                      if (var5.equalsIgnoreCase("next")) {
                        var8.field_d = (String) (((Object[]) (var6))[0]);
                      } else {
                        if (var5.equalsIgnoreCase("objective")) {
                          id.a((String[]) (var6), 0, var8);
                        } else {
                          if (var5.equalsIgnoreCase("action")) {
                            ReflectionCheck.a((String[]) (var6), var8, 0);
                          } else {
                            if (!var5.equalsIgnoreCase("flag")) {
                              if (!var5.equalsIgnoreCase("endthread")) {
                                if (var5.equalsIgnoreCase("nostack")) {
                                  var8.field_k = true;
                                } else {
                                  if (var5.equalsIgnoreCase("clearstack")) {
                                    var8.field_h = true;
                                  }
                                }
                              } else {
                                var8.field_r = true;
                              }
                            } else {
                              ProxySocketConnector.a((String[]) (var6), var8, (byte) -127);
                            }
                          }
                        }
                      }
                    } else {
                      var8.field_g = (String) (((Object[]) (var6))[0]);
                    }
                  }
                }
              }
            } else {
              Dialog.a((String[]) (var6), 0, var8, -117);
            }
          } else {
            discarded$0 = var3.append(Territory.field_t);
            discarded$1 = var3.append(' ');
          }
          SliderPainter.b((byte) -118);
        }
        var8.field_c = var3.toString();
        return var8;
    }

    public static void clearStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_i = null;
        field_d = null;
        field_c = null;
        field_k = null;
        field_g = null;
        field_b = null;
    }

    nd(int param0, int param1, int param2) {
        this.field_j = param1;
        this.field_f = param2;
        this.field_e = param0;
    }

    static {
        field_i = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
        field_d = new int[]{1, 1, 2, 2, 3, 1, 3, 2, 2, 2, 3, 3, 1, 3, 5, 5, 5, 5, 3, 5, 3, 5, 1, 1, 5};
        field_g = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_b = "Battles won in friendly space.";
        field_c = new gq(1, 2, 2, 0);
    }
}
