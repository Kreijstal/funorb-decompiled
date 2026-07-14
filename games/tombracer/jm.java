/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends kca {
    static int field_m;
    static int field_n;
    private tra field_j;
    static int field_l;
    private tra field_o;
    static String[] field_k;

    final static void b(byte param0) {
        if (!(tga.field_a != null)) {
            return;
        }
        tga.field_a.a(true);
        if (param0 < 91) {
            return;
        }
        tga.field_a = null;
    }

    final static qca a(pr[] param0, kda param1, int param2) {
        int var3_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= param0.length) {
            var3 = jaggl.OpenGL.glCreateProgramObjectARB();
            var5 = 0;
            L1: while (true) {
              if (var5 >= param0.length) {
                L2: {
                  if (param2 == 1) {
                    break L2;
                  } else {
                    field_l = 12;
                    break L2;
                  }
                }
                L3: {
                  jaggl.OpenGL.glLinkProgramARB(var3);
                  jaggl.OpenGL.glGetObjectParameterivARB(var3, 35714, gba.field_f, 0);
                  if (0 != gba.field_f[0]) {
                    break L3;
                  } else {
                    L4: {
                      if (0 != gba.field_f[0]) {
                        break L4;
                      } else {
                        System.out.println("Shader linking failed:");
                        break L4;
                      }
                    }
                    L5: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, gba.field_f, 1);
                      if ((gba.field_f[1] ^ -1) < -2) {
                        var11 = new byte[gba.field_f[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var3, gba.field_f[1], gba.field_f, 0, var11, 0);
                        System.out.println(new String(var11));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (0 != gba.field_f[0]) {
                      break L3;
                    } else {
                      var7 = 0;
                      var5 = var7;
                      L6: while (true) {
                        if (var7 >= param0.length) {
                          jaggl.OpenGL.glDeleteObjectARB(var3);
                          return null;
                        } else {
                          jaggl.OpenGL.glDetachObjectARB(var3, param0[var7].field_c);
                          var7++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
                return new qca(param1, var3, param0);
              } else {
                jaggl.OpenGL.glAttachObjectARB(var3, param0[var5].field_c);
                var5++;
                continue L1;
              }
            }
          } else {
            if (param0[var3_int] != null) {
              if (0L < param0[var3_int].field_c) {
                var3_int++;
                continue L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var4 = 82 / ((-66 - param1) / 51);
        var2 = 0L;
        var5 = param0.length();
        var6 = 0;
        L0: while (true) {
          L1: {
            if (var6 >= var5) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var7 = param0.charAt(var6);
                  if (var7 < 65) {
                    break L3;
                  } else {
                    if (var7 <= 90) {
                      var2 = var2 + (long)(-65 + (var7 + 1));
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (97 > var7) {
                    break L4;
                  } else {
                    if (var7 <= 122) {
                      var2 = var2 + (long)(-97 + var7 + 1);
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var7 < 48) {
                  break L2;
                } else {
                  if (57 < var7) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(var7 + -21);
                    break L2;
                  }
                }
              }
              if (var2 >= 177917621779460413L) {
                break L1;
              } else {
                var6++;
                continue L0;
              }
            }
          }
          L5: while (true) {
            L6: {
              if ((var2 % 37L ^ -1L) != -1L) {
                break L6;
              } else {
                if (0L == var2) {
                  break L6;
                } else {
                  var2 = var2 / 37L;
                  continue L5;
                }
              }
            }
            return var2;
          }
        }
    }

    private final boolean b(int param0, String param1) {
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        if (param0 > -33) {
            ((jm) this).field_j = null;
        }
        String var3 = ((jm) this).field_j.field_o.toLowerCase();
        String var4 = param1.toLowerCase();
        if (var3.length() < -1) {
            if (-1 >= var4.length()) {
                return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5) {
                if (-1 + var3.length() > var5) {
                    var6 = var3.substring(0, var5);
                    var7 = var3.substring(1 + var5);
                    if (!((var4.indexOf(var6) ^ -1) > -1)) {
                        return true;
                    }
                    return 0 > var4.indexOf(var7) ? false : true;
                }
            }
        }
        return false;
    }

    final String a(int param0, String param1) {
        String var6 = ((jm) this).field_o.field_o.toLowerCase();
        String var4 = param1.toLowerCase();
        if (param0 == (var4.length() ^ -1)) {
            return null;
        }
        String var5 = var4;
        if (ld.a(false, var5)) {
            return dva.field_a;
        }
        if (qda.a((byte) -72, var5)) {
            return qqa.field_o;
        }
        if (eba.a(var5, 6912)) {
            return hf.field_e;
        }
        if (!(!this.b(-37, param1))) {
            return waa.field_e;
        }
        if ((var6.length() ^ -1) >= -1) {
            return pv.field_m;
        }
        if (ne.a(true, var5, var6)) {
            return kl.field_j;
        }
        if (!(!kv.a((byte) 55, var5, var6))) {
            return wl.field_h;
        }
        if (!(!jea.a(true, var5, var6))) {
            return kl.field_j;
        }
        return dva.field_a;
    }

    jm(tra param0, tra param1, tra param2) {
        super(param0);
        ((jm) this).field_o = param1;
        ((jm) this).field_j = param2;
    }

    public static void b(boolean param0) {
        field_k = null;
        if (param0) {
            jm.b(false);
        }
    }

    final it a(byte param0, String param1) {
        if (param0 != 14) {
            return null;
        }
        String var3 = ((jm) this).field_o.field_o.toLowerCase();
        String var4 = param1.toLowerCase();
        if (!(0 != var4.length())) {
            return fp.field_c;
        }
        if (!(jg.a(-102, var3, var4))) {
            return fp.field_c;
        }
        if (!(!this.b(param0 + -123, param1))) {
            return fp.field_c;
        }
        return uh.field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 2147483647;
        field_m = 0;
        field_l = 2097152;
        field_k = new String[]{"88b346", "4879b4", "b64848", "9e47b4"};
    }
}
