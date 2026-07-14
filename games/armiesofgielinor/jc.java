/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends mn {
    private int field_y;
    static String[] field_v;
    static String field_x;
    static um field_B;
    private int field_A;
    static String field_w;
    private int field_z;

    final static String a(String param0, byte param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param0.length();
        var3 = new char[var2];
        if (param1 != 42) {
          field_w = null;
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return new String(var3);
            } else {
              L1: {
                var5 = param0.charAt(var4);
                if (-1 == (var4 ^ -1)) {
                  var5 = hc.a(98, (char) var5);
                  break L1;
                } else {
                  var5 = Character.toLowerCase((char) var5);
                  break L1;
                }
              }
              var3[var4] = (char)var5;
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L2: while (true) {
            if (var2 <= var4) {
              return new String(var3);
            } else {
              L3: {
                var5 = param0.charAt(var4);
                if (-1 == (var4 ^ -1)) {
                  var5 = hc.a(98, (char) var5);
                  break L3;
                } else {
                  var5 = Character.toLowerCase((char) var5);
                  break L3;
                }
              }
              var3[var4] = (char)var5;
              var4++;
              continue L2;
            }
          }
        }
    }

    final static b b(int param0, int param1) {
        b var2 = null;
        if (param0 != -1) {
          field_w = null;
          var2 = new b();
          ta.field_O.a((byte) -119, (tc) (Object) var2);
          a.a(param1, (byte) -32);
          return var2;
        } else {
          var2 = new b();
          ta.field_O.a((byte) -119, (tc) (Object) var2);
          a.a(param1, (byte) -32);
          return var2;
        }
    }

    private final String a(String[] param0, boolean param1) {
        if (param1) {
            return null;
        }
        return ((jc) this).a(125, param0, "deploy");
    }

    public static void a(byte param0) {
        field_x = null;
        field_B = null;
        int var1 = 117 % ((-27 - param0) / 51);
        field_v = null;
        field_w = null;
    }

    jc(int param0, int param1, int param2, int param3) {
        ((jc) this).field_p = param0;
        ((jc) this).field_A = param1;
        ((jc) this).field_y = param3;
        ((jc) this).field_z = param2;
    }

    final bd a(int param0, ha param1) {
        ne var4 = null;
        jd var5 = null;
        jd var6 = null;
        ((jc) this).d(96);
        var5 = param1.c(((jc) this).field_z, true, ((jc) this).field_A);
        var6 = var5;
        if (var6 != null) {
          if (((jc) this).field_p == var6.field_O) {
            if (!var6.field_s) {
              if (0 < (bw.field_m[var5.field_N][10] & 1024)) {
                var4 = param1.field_Eb[var6.field_J - -(var6.field_w * param1.field_v)];
                if (34 == var6.field_N) {
                  if (var4.f(19725)) {
                    if ((var6.field_N ^ -1) == -8) {
                      if (var4.field_h == 0) {
                        if (param0 <= 31) {
                          return null;
                        } else {
                          return (bd) (Object) new pl(((jc) this).field_p, var6, ((jc) this).field_y);
                        }
                      } else {
                        String discarded$7 = this.a(new String[2], false);
                        return null;
                      }
                    } else {
                      if (param0 <= 31) {
                        return null;
                      } else {
                        return (bd) (Object) new pl(((jc) this).field_p, var6, ((jc) this).field_y);
                      }
                    }
                  } else {
                    String discarded$8 = this.a(new String[2], false);
                    return null;
                  }
                } else {
                  if ((var6.field_N ^ -1) == -8) {
                    if (var4.field_h == 0) {
                      if (param0 <= 31) {
                        return null;
                      } else {
                        return (bd) (Object) new pl(((jc) this).field_p, var6, ((jc) this).field_y);
                      }
                    } else {
                      String discarded$9 = this.a(new String[2], false);
                      return null;
                    }
                  } else {
                    if (param0 <= 31) {
                      return null;
                    } else {
                      return (bd) (Object) new pl(((jc) this).field_p, var6, ((jc) this).field_y);
                    }
                  }
                }
              } else {
                String discarded$10 = this.a(new String[3], false);
                return null;
              }
            } else {
              String discarded$11 = this.a(new String[3], false);
              return null;
            }
          } else {
            String discarded$12 = this.a(new String[4], false);
            return null;
          }
        } else {
          String discarded$13 = this.a(new String[2], false);
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Send private Quick Chat to <%0>";
        field_x = "Warning! All your portals are blocked and you haven't moved a unit recently. You have <%0> turns until you fail the mission.";
    }
}
