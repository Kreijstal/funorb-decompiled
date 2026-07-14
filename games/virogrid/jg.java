/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static il field_i;
    static boolean[] field_b;
    static String field_c;
    private ln field_h;
    static String[] field_g;
    private eh field_d;
    static int field_e;
    private eh field_f;
    private ln field_a;

    final ml a(byte param0, String param1, String param2) {
        Object var5 = null;
        if (param0 < 76) {
          var5 = null;
          ml discarded$2 = this.a((int[]) null, (String) null, (String) null, (byte) -47);
          return this.a((int[]) null, param1, param2, (byte) -123);
        } else {
          return this.a((int[]) null, param1, param2, (byte) -123);
        }
    }

    public static void a(int param0) {
        if (param0 != 28275) {
            return;
        }
        field_g = null;
        field_b = null;
        field_c = null;
        field_i = null;
    }

    private final ml a(int[] param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        ml var8 = null;
        ml var8_ref = null;
        Object var10 = null;
        ml var11 = null;
        vn var12 = null;
        ml var13 = null;
        ml var14 = null;
        vn var15 = null;
        ml var16 = null;
        ml var17 = null;
        var5 = (param3 >>> 461050508 | (param3 & -2147479553) << -2047145148) ^ param2;
        var5 = var5 | param3 << -1390597968;
        var6 = (long)var5;
        var8 = (ml) (Object) ((jg) this).field_a.a(var6, -14905);
        if (var8 == null) {
          if (param0 != null) {
            if ((param0[0] ^ -1) < -1) {
              var15 = vn.a(((jg) this).field_f, param3, param2);
              if (var15 != null) {
                if (param1) {
                  L0: {
                    var10 = null;
                    ml discarded$4 = ((jg) this).a((int[]) null, 119, 9);
                    var16 = var15.b();
                    var8_ref = var16;
                    ((jg) this).field_a.a((l) (Object) var8_ref, (byte) 2, var6);
                    if (param0 != null) {
                      param0[0] = param0[0] - var16.field_k.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8_ref;
                } else {
                  L1: {
                    var17 = var15.b();
                    var11 = var17;
                    var8_ref = var17;
                    ((jg) this).field_a.a((l) (Object) var8_ref, (byte) 2, var6);
                    if (param0 != null) {
                      param0[0] = param0[0] - var17.field_k.length;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var12 = vn.a(((jg) this).field_f, param3, param2);
            if (var12 != null) {
              if (param1) {
                L2: {
                  var10 = null;
                  ml discarded$5 = ((jg) this).a((int[]) null, 119, 9);
                  var13 = var12.b();
                  var8_ref = var13;
                  ((jg) this).field_a.a((l) (Object) var8_ref, (byte) 2, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var13.field_k.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return var8_ref;
              } else {
                L3: {
                  var14 = var12.b();
                  var8_ref = var14;
                  ((jg) this).field_a.a((l) (Object) var8_ref, (byte) 2, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var14.field_k.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          return var8;
        }
    }

    final static void b(int param0) {
        if (param0 != 461050508) {
          field_i = null;
          vi.field_g = di.c((byte) -6);
          tm.field_l = new je();
          vc.a(true, true, param0 + -461066621);
          return;
        } else {
          vi.field_g = di.c((byte) -6);
          tm.field_l = new je();
          vc.a(true, true, param0 + -461066621);
          return;
        }
    }

    final ml a(int[] param0, int param1, int param2) {
        if (param2 != 0) {
            return null;
        }
        if ((((jg) this).field_f.e(60) ^ -1) == -2) {
            return this.a(param0, false, param1, 0);
        }
        if (!(1 != ((jg) this).field_f.d((byte) 70, param1))) {
            return this.a(param0, false, 0, param1);
        }
        throw new RuntimeException();
    }

    final ml a(int[] param0, int param1, boolean param2) {
        if (!param2) {
            ((jg) this).field_f = null;
            if (((jg) this).field_d.e(46) == -2) {
                return this.a(param0, (byte) 90, param1, 0);
            }
            if (!(-2 != ((jg) this).field_d.d((byte) 50, param1))) {
                return this.a(param0, (byte) 90, 0, param1);
            }
            throw new RuntimeException();
        }
        if (((jg) this).field_d.e(46) == -2) {
            return this.a(param0, (byte) 90, param1, 0);
        }
        if (!(-2 != ((jg) this).field_d.d((byte) 50, param1))) {
            return this.a(param0, (byte) 90, 0, param1);
        }
        throw new RuntimeException();
    }

    final static void a(String[] args, String[] param1, String[][] param2, byte[] param3, eh param4, mg[][] param5, String[][] param6, byte[] param7, int param8, int param9, boolean param10, rm[] param11, int param12, eh param13, int[] param14, eh param15, byte param16, int[] param17, String[] param18, mg[][] param19) {
        jd.a(param15, (byte) 99, param17, param4, param11);
        oa.a((byte) -117, param4);
        tm.a(param19, 126, param12, param9, param14, param4, param5, param7, param2, param8, param6, param1, param18, param3, args);
        int var20 = -124 % ((param16 - -36) / 51);
        vj.a(param13, param4, param10, true);
        ak.c(-7597);
        ld.a(0);
        el.a(true);
    }

    private final ml a(int[] param0, byte param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        ml var8 = null;
        ml var8_ref = null;
        gj var9 = null;
        gj var9_ref = null;
        var5 = param2 ^ (param3 >>> -1854509044 | (-536866817 & param3) << 595749988);
        var5 = var5 | param3 << -1534116112;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (ml) (Object) ((jg) this).field_a.a(var6, -14905);
        if (var8 == null) {
          if (param0 != null) {
            if (param0[0] > 0) {
              if (param1 == 90) {
                L0: {
                  var9 = (gj) (Object) ((jg) this).field_h.a(var6, -14905);
                  if (var9 == null) {
                    var9_ref = gj.a(((jg) this).field_d, param3, param2);
                    if (var9_ref != null) {
                      ((jg) this).field_h.a((l) (Object) var9_ref, (byte) 21, var6);
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    break L0;
                  }
                }
                var8_ref = var9_ref.a(param0);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.a(false);
                  ((jg) this).field_a.a((l) (Object) var8_ref, (byte) 104, var6);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            if (param1 == 90) {
              L1: {
                var9 = (gj) (Object) ((jg) this).field_h.a(var6, -14905);
                if (var9 == null) {
                  var9_ref = gj.a(((jg) this).field_d, param3, param2);
                  if (var9_ref != null) {
                    ((jg) this).field_h.a((l) (Object) var9_ref, (byte) 21, var6);
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var8_ref = var9_ref.a(param0);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.a(false);
                ((jg) this).field_a.a((l) (Object) var8_ref, (byte) 104, var6);
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          return var8;
        }
    }

    final ml a(String param0, int param1, String param2) {
        if (param1 != 595749988) {
          jg.b(-106);
          return this.a(false, param0, (int[]) null, param2);
        } else {
          return this.a(false, param0, (int[]) null, param2);
        }
    }

    private final ml a(int[] param0, String param1, String param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((jg) this).field_f.a(-1, param1);
        if (param3 <= -63) {
          if (0 <= var5) {
            var6 = ((jg) this).field_f.a(-114, var5, param2);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(param0, false, var6, var5);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    jg(eh param0, eh param1) {
        ((jg) this).field_h = new ln(256);
        ((jg) this).field_a = new ln(256);
        ((jg) this).field_d = param1;
        ((jg) this).field_f = param0;
    }

    private final ml a(boolean param0, String param1, int[] param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        if (!param0) {
          var5 = ((jg) this).field_d.a(-1, param1);
          if (var5 >= 0) {
            var6 = ((jg) this).field_d.a(-108, var5, param3);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(param2, (byte) 90, var6, var5);
            }
          } else {
            return null;
          }
        } else {
          var7 = null;
          ml discarded$2 = this.a(false, (String) null, (int[]) null, (String) null);
          var5 = ((jg) this).field_d.a(-1, param1);
          if (var5 >= 0) {
            var6 = ((jg) this).field_d.a(-108, var5, param3);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(param2, (byte) 90, var6, var5);
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_c = "Honour";
    }
}
