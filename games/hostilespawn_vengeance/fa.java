/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    private String field_b;
    static int field_a;
    static bd field_e;
    static int field_c;
    static bd[] field_d;

    final boolean a(int param0, String param1) {
        if (param0 != 0) {
            Object var4 = null;
            boolean discarded$0 = ((fa) this).a(87, (String) null);
        }
        return ((fa) this).field_b.equals((Object) (Object) param1);
    }

    final static int a(String[] args, int param1, int param2, vm param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = HostileSpawn.field_I ? 1 : 0;
          if (param2 > 48) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          var5 = param3.a(param4);
          if (param1 < var5) {
            break L1;
          } else {
            if (-1 != param4.indexOf("<br>")) {
              break L1;
            } else {
              args[0] = (String) (Object) args;
              return 1;
            }
          }
        }
        var6 = (-1 + (var5 + param1)) / param1;
        param1 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param4.length();
        var9 = 0;
        L2: while (true) {
          if (var9 >= var8) {
            L3: {
              if (var8 > var7) {
                var6++;
                args[var6] = param4.substring(var7, var8).trim();
                break L3;
              } else {
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param4.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 != 45) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11 = param4.substring(var7, var9 + 1).trim();
              var12 = param3.a(var11);
              if (var12 >= param1) {
                var7 = var9 + 1;
                var6++;
                args[var6] = var11;
                break L4;
              } else {
                break L4;
              }
            }
            if (62 == var10) {
              if (param4.regionMatches(-3 + var9, "<br>", 0, 4)) {
                var6++;
                args[var6] = param4.substring(var7, var9 + -3).trim();
                var7 = 1 + var9;
                var9++;
                continue L2;
              } else {
                var9++;
                continue L2;
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
    }

    final void a(byte param0, java.applet.Applet param1) {
        if (param0 > -94) {
            field_e = null;
        }
        pc.a(((fa) this).field_b, "jagex-last-login-method", true, 31536000L, param1);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    fa(String param0) {
        ((fa) this).field_b = param0;
    }

    public static void a(boolean param0) {
        if (param0) {
            field_c = 65;
        }
        field_d = null;
        field_e = null;
    }

    final static void a(int param0) {
        Object var2 = null;
        ak.a(false, (String) null, "");
        if (param0 != 5109) {
            field_e = null;
        }
    }

    static {
    }
}
