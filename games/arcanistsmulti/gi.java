/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private eg field_g;
    static qb field_k;
    static int field_a;
    private di field_b;
    static String field_h;
    static String field_l;
    private eg field_e;
    static int field_c;
    static String field_i;
    static String field_f;
    static ll[] field_m;
    private di field_d;
    static String field_j;

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_f = null;
        field_l = null;
        if (param0 != 59) {
          return;
        } else {
          field_h = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    final static void a(boolean param0, String param1, float param2, byte param3) {
        Object var5 = null;
        if (ci.field_c != null) {
          ci.field_c.a(param1, param2, param0, (byte) -105);
          de.b();
          if (param3 != -100) {
            var5 = null;
            gi.a(true, (String) null, -0.9587674736976624f, (byte) 42);
            lm.a((byte) -120, true);
            return;
          } else {
            lm.a((byte) -120, true);
            return;
          }
        } else {
          ci.field_c = new gd(p.field_b, fg.field_o);
          p.field_b.b((qm) (Object) ci.field_c, 15637);
          ci.field_c.a(param1, param2, param0, (byte) -105);
          de.b();
          if (param3 == -100) {
            lm.a((byte) -120, true);
            return;
          } else {
            var5 = null;
            gi.a(true, (String) null, -0.9587674736976624f, (byte) 42);
            lm.a((byte) -120, true);
            return;
          }
        }
    }

    private final wf a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        wf var8 = null;
        wf var8_ref = null;
        ai var9 = null;
        ai var9_ref = null;
        Object var10 = null;
        var5 = (param1 >>> -1346143476 | (-268431361 & param1) << -1796735484) ^ param3;
        var5 = var5 | param1 << 706066576;
        var6 = 4294967296L ^ (long)var5;
        if (param0 <= -121) {
          var8 = (wf) (Object) ((gi) this).field_d.a(var6, -48);
          if (var8 == null) {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                L0: {
                  var9 = (ai) (Object) ((gi) this).field_b.a(var6, -82);
                  if (var9 != null) {
                    break L0;
                  } else {
                    var9_ref = ai.a(((gi) this).field_g, param1, param3);
                    if (var9_ref != null) {
                      ((gi) this).field_b.a((pg) (Object) var9_ref, true, var6);
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
                var8_ref = var9_ref.a(param2);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.a(true);
                  ((gi) this).field_d.a((pg) (Object) var8_ref, true, var6);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (ai) (Object) ((gi) this).field_b.a(var6, -82);
                if (var9 != null) {
                  break L1;
                } else {
                  var9_ref = ai.a(((gi) this).field_g, param1, param3);
                  if (var9_ref != null) {
                    ((gi) this).field_b.a((pg) (Object) var9_ref, true, var6);
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param2);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.a(true);
                ((gi) this).field_d.a((pg) (Object) var8_ref, true, var6);
                return var8_ref;
              }
            }
          } else {
            return var8;
          }
        } else {
          var10 = null;
          wf discarded$1 = ((gi) this).a(-17, (int[]) null, 83);
          var8 = (wf) (Object) ((gi) this).field_d.a(var6, -48);
          if (var8 == null) {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                L2: {
                  var9 = (ai) (Object) ((gi) this).field_b.a(var6, -82);
                  if (var9 != null) {
                    break L2;
                  } else {
                    var9_ref = ai.a(((gi) this).field_g, param1, param3);
                    if (var9_ref != null) {
                      ((gi) this).field_b.a((pg) (Object) var9_ref, true, var6);
                      break L2;
                    } else {
                      return null;
                    }
                  }
                }
                var8_ref = var9_ref.a(param2);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.a(true);
                  ((gi) this).field_d.a((pg) (Object) var8_ref, true, var6);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L3: {
                var9 = (ai) (Object) ((gi) this).field_b.a(var6, -82);
                if (var9 != null) {
                  break L3;
                } else {
                  var9_ref = ai.a(((gi) this).field_g, param1, param3);
                  if (var9_ref != null) {
                    ((gi) this).field_b.a((pg) (Object) var9_ref, true, var6);
                    break L3;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param2);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.a(true);
                ((gi) this).field_d.a((pg) (Object) var8_ref, true, var6);
                return var8_ref;
              }
            }
          } else {
            return var8;
          }
        }
    }

    private final wf a(int param0, int param1, int[] param2, boolean param3) {
        int var5 = 0;
        long var6 = 0L;
        wf var8 = null;
        wf var8_ref = null;
        pl var11 = null;
        wf var12 = null;
        pl var13 = null;
        wf var14 = null;
        var5 = ((-805302273 & param0) << -1327339868 | param0 >>> 482837484) ^ param1;
        var5 = var5 | param0 << 1822575152;
        var6 = (long)var5;
        var8 = (wf) (Object) ((gi) this).field_d.a(var6, -109);
        if (var8 == null) {
          if (param2 != null) {
            if (0 < param2[0]) {
              var13 = pl.a(((gi) this).field_e, param0, param1);
              if (var13 != null) {
                var14 = var13.a();
                var8_ref = var14;
                ((gi) this).field_d.a((pg) (Object) var8_ref, param3, var6);
                if (param2 != null) {
                  param2[0] = param2[0] - var14.field_i.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var11 = pl.a(((gi) this).field_e, param0, param1);
            if (var11 != null) {
              var12 = var11.a();
              var8_ref = var12;
              ((gi) this).field_d.a((pg) (Object) var8_ref, param3, var6);
              if (param2 != null) {
                param2[0] = param2[0] - var12.field_i.length;
                return var8_ref;
              } else {
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

    final wf a(int[] param0, int param1, int param2) {
        if (-2 == ((gi) this).field_g.b((byte) -79)) {
          return this.a(-126, 0, param0, param1);
        } else {
          if (param2 == ((gi) this).field_g.a(param1, (byte) -60)) {
            return this.a(-127, param1, param0, 0);
          } else {
            throw new RuntimeException();
          }
        }
    }

    final wf a(int param0, int[] param1, int param2) {
        if (((gi) this).field_e.b((byte) -99) == -2) {
          return this.a(0, param0, param1, true);
        } else {
          if (param2 == ((gi) this).field_e.a(param0, (byte) -60)) {
            return this.a(param0, 0, param1, true);
          } else {
            throw new RuntimeException();
          }
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            gi.a(true, (String) null, 0.18466001749038696f, (byte) 40);
            if (!(null != ah.field_b)) {
                return "";
            }
            return ah.field_b;
        }
        if (!(null != ah.field_b)) {
            return "";
        }
        return ah.field_b;
    }

    gi(eg param0, eg param1) {
        ((gi) this).field_b = new di(256);
        ((gi) this).field_d = new di(256);
        ((gi) this).field_g = param1;
        ((gi) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Lesson 4 of 7<br><br>Use of a powerful spell in a safe and secure environment.<br><br>Use the Rain of Fire spell to destroy all three targets.<br><br><br>* Using the focus point for a locational spell *<br>* Having fun with heavy firepower *";
        field_l = "Click to buy this spell for 2 wands.";
        field_c = 640;
        field_i = "MOST CRUEL - ";
        field_f = "Overlight spells focus on healing and the defence of your forces.";
        field_j = "Your rating is <%0>";
        field_k = new qb(270, 70);
    }
}
