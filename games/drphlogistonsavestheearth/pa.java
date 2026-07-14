/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int field_a;
    static int field_f;
    static wi field_e;
    static int field_d;
    static int field_b;
    static int field_c;

    final static hg a(String param0, byte param1) {
        String var2 = null;
        hg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (gf.field_r != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              if (param1 == 67) {
                var6 = (CharSequence) (Object) param0;
                var2 = rh.a(-8, var6);
                if (var2 != null) {
                  var3 = (hg) (Object) gf.field_r.a((long)var2.hashCode(), param1 ^ 24);
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_V;
                      var4 = rh.a(6, var7);
                      if (var4.equals((Object) (Object) var2)) {
                        return var3;
                      } else {
                        var3 = (hg) (Object) gf.field_r.b(-1);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_d = -78;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static boolean a(byte param0, vj param1) {
        if (param0 != 64) {
            Object var3 = null;
            boolean discarded$0 = pa.a((byte) -21, (vj) null);
            return param1.c((byte) 18);
        }
        return param1.c((byte) 18);
    }

    final static boolean a(byte param0, char param1) {
        Object var3 = null;
        if (param0 > 35) {
          if (Character.isISOControl(param1)) {
            return false;
          } else {
            if (!de.a(param1, -17321)) {
              L0: {
                if (param1 == 45) {
                  break L0;
                } else {
                  if (param1 == 160) {
                    break L0;
                  } else {
                    if (32 == param1) {
                      break L0;
                    } else {
                      if (param1 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          }
        } else {
          var3 = null;
          boolean discarded$1 = pa.a((byte) -44, (vj) null);
          if (Character.isISOControl(param1)) {
            return false;
          } else {
            if (!de.a(param1, -17321)) {
              if (param1 != 45) {
                if (param1 != 160) {
                  L1: {
                    if (32 == param1) {
                      break L1;
                    } else {
                      if (param1 == 95) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                  return true;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (pf.a(1, param1, param0)) {
          var3 = param2;
          L0: while (true) {
            if (param0.length() > var3) {
              if (!pa.a((byte) 83, param0.charAt(var3))) {
                return false;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 2;
        field_c = -100;
    }
}
