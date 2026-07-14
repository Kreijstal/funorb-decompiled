/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends tfa implements lv {
    private int field_k;
    private int field_l;
    static String field_m;
    private int field_n;

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param1 != null) {
          L0: {
            var2 = 0;
            var3 = param1.length();
            if (param0 == 1) {
              break L0;
            } else {
              field_m = null;
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              if (var2 >= var3) {
                break L2;
              } else {
                if (!hf.a(param0 ^ 114, param1.charAt(var2))) {
                  break L2;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
            L3: while (true) {
              L4: {
                if (var2 >= var3) {
                  break L4;
                } else {
                  if (!hf.a(param0 ^ 116, param1.charAt(var3 - 1))) {
                    break L4;
                  } else {
                    var3--;
                    continue L3;
                  }
                }
              }
              var4 = var3 + -var2;
              if (-2 >= (var4 ^ -1)) {
                if ((var4 ^ -1) >= -13) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L5: while (true) {
                    if (var3 <= var6) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param1.charAt(var6);
                      if (ov.a(param0 + 16, (char) var7)) {
                        var8 = cp.a((byte) 0, (char) var7);
                        if (0 != var8) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static Class a(Object param0, int param1) {
        if (param1 != 0) {
            field_m = null;
        }
        if (!(!Integer.class.isInstance(param0))) {
            return Integer.TYPE;
        }
        if (Byte.class.isInstance(param0)) {
            return Byte.TYPE;
        }
        if (Short.class.isInstance(param0)) {
            return Short.TYPE;
        }
        if (Long.class.isInstance(param0)) {
            return Long.TYPE;
        }
        if (Boolean.class.isInstance(param0)) {
            return Boolean.TYPE;
        }
        if (Float.class.isInstance(param0)) {
            return Float.TYPE;
        }
        if (Double.class.isInstance(param0)) {
            return Double.TYPE;
        }
        if (!Character.class.isInstance(param0)) {
            return null;
        }
        return Character.TYPE;
    }

    jd(kda param0, ft param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, 32879, param1, una.field_g, param4 * param2 * param3, false);
        ((jd) this).field_n = param4;
        ((jd) this).field_l = param3;
        ((jd) this).field_k = param2;
        ((jd) this).field_j.a(true, (iva) this);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glTexImage3Dub(((jd) this).field_i, 0, ((jd) this).d(120), ((jd) this).field_k, ((jd) this).field_l, ((jd) this).field_n, 0, waa.a(((jd) this).field_f, 1383), 5121, param5, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
    }

    public final void a(int param0, hs param1) {
        if (param0 != 7672) {
            ((jd) this).field_k = 12;
        }
        super.a(param0 + 0, param1);
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != 32242) {
            field_m = null;
        }
    }

    final static String a(boolean param0) {
        String var1 = null;
        String[] var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var1 = "";
        var2 = dra.field_b;
        if (!param0) {
          var3 = 0;
          L0: while (true) {
            if (var2.length <= var3) {
              return var1;
            } else {
              var4 = var2[var3];
              if (!var4.startsWith("Unused")) {
                var1 = var1 + var4 + "\n";
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    public final void b(byte param0) {
        if (param0 < 32) {
            Object var3 = null;
            String discarded$0 = jd.a(-106, (CharSequence) null);
        }
        super.b((byte) 56);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Mobile mirrors";
    }
}
