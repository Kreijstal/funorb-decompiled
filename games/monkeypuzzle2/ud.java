/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    private ad field_h;
    static int field_b;
    static int field_a;
    private ad field_c;
    static int field_d;
    private cg field_g;
    static String[] field_e;
    private cg field_f;

    final td a(int param0, int param1, int param2) {
        if (param0 != -18480) {
          ((ud) this).field_f = null;
          return this.a((byte) -108, param2, (int[]) null, param1);
        } else {
          return this.a((byte) -108, param2, (int[]) null, param1);
        }
    }

    public static void b(int param0) {
        if (param0 > -58) {
            return;
        }
        field_e = null;
    }

    private final td a(int param0, int[] param1, String param2) {
        Object var5 = null;
        if (((ud) this).field_c.b("", (byte) 8)) {
          return this.a(1620678500, "", param1, param2);
        } else {
          if (param0 != 24002) {
            var5 = null;
            td discarded$2 = this.a(-78, (int[]) null, (String) null);
            return this.a(1620678500, param2, param1, "");
          } else {
            return this.a(1620678500, param2, param1, "");
          }
        }
    }

    private final td a(byte param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        td var8 = null;
        td var8_ref = null;
        int var10 = 0;
        g var12 = null;
        td var13 = null;
        g var14 = null;
        td var15 = null;
        var5 = (param3 >>> 1610302188 | param3 << 1620678500 & 65528) ^ param1;
        var5 = var5 | param3 << 849676080;
        var6 = (long)var5;
        var8 = (td) (Object) ((ud) this).field_f.a((byte) 125, var6);
        if (var8 != null) {
          return var8;
        } else {
          if (param2 != null) {
            if (0 < param2[0]) {
              var14 = g.a(((ud) this).field_c, param3, param1);
              if (var14 != null) {
                var15 = var14.b();
                var8_ref = var15;
                ((ud) this).field_f.a((ug) (Object) var8_ref, var6, (byte) -36);
                if (param2 != null) {
                  param2[0] = param2[0] - var15.field_j.length;
                  var10 = 23 % ((-33 - param0) / 40);
                  return var8_ref;
                } else {
                  var10 = 23 % ((-33 - param0) / 40);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var12 = g.a(((ud) this).field_c, param3, param1);
            if (var12 != null) {
              var13 = var12.b();
              var8_ref = var13;
              ((ud) this).field_f.a((ug) (Object) var8_ref, var6, (byte) -36);
              if (param2 != null) {
                param2[0] = param2[0] - var13.field_j.length;
                var10 = 23 % ((-33 - param0) / 40);
                return var8_ref;
              } else {
                var10 = 23 % ((-33 - param0) / 40);
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        }
    }

    final td a(String param0, byte param1) {
        int var3 = 127 / ((param1 - 41) / 53);
        return this.a(24002, (int[]) null, param0);
    }

    final td a(int param0, int param1, boolean param2) {
        if (!param2) {
          td discarded$2 = ((ud) this).a(-109, -44, false);
          return this.a((int[]) null, 34, param0, param1);
        } else {
          return this.a((int[]) null, 34, param0, param1);
        }
    }

    final static void a(int param0) {
        ff.a(true, -125, ac.field_c, v.field_b);
        ja.field_F = true;
        if (param0 < 42) {
            field_a = 104;
        }
    }

    private final td a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        td var8 = null;
        td var8_ref = null;
        sf var9 = null;
        sf var9_ref = null;
        var5 = (param3 << 262288804 & 65526 | param3 >>> 2131861996) ^ param2;
        var5 = var5 | param3 << 199220784;
        var6 = 4294967296L ^ (long)var5;
        var8 = (td) (Object) ((ud) this).field_f.a((byte) 114, var6);
        if (var8 == null) {
          if (param0 != null) {
            if (0 < param0[0]) {
              if (param1 > 7) {
                L0: {
                  var9 = (sf) (Object) ((ud) this).field_g.a((byte) 127, var6);
                  if (var9 == null) {
                    var9_ref = sf.a(((ud) this).field_h, param3, param2);
                    if (var9_ref != null) {
                      ((ud) this).field_g.a((ug) (Object) var9_ref, var6, (byte) -36);
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
                  var9_ref.c(-19822);
                  ((ud) this).field_f.a((ug) (Object) var8_ref, var6, (byte) -36);
                  return var8_ref;
                }
              } else {
                L1: {
                  ((ud) this).field_c = null;
                  var9 = (sf) (Object) ((ud) this).field_g.a((byte) 127, var6);
                  if (var9 == null) {
                    var9_ref = sf.a(((ud) this).field_h, param3, param2);
                    if (var9_ref != null) {
                      ((ud) this).field_g.a((ug) (Object) var9_ref, var6, (byte) -36);
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
                  var9_ref.c(-19822);
                  ((ud) this).field_f.a((ug) (Object) var8_ref, var6, (byte) -36);
                  return var8_ref;
                }
              }
            } else {
              return null;
            }
          } else {
            if (param1 > 7) {
              L2: {
                var9 = (sf) (Object) ((ud) this).field_g.a((byte) 127, var6);
                if (var9 == null) {
                  var9_ref = sf.a(((ud) this).field_h, param3, param2);
                  if (var9_ref != null) {
                    ((ud) this).field_g.a((ug) (Object) var9_ref, var6, (byte) -36);
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              var8_ref = var9_ref.a(param0);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c(-19822);
                ((ud) this).field_f.a((ug) (Object) var8_ref, var6, (byte) -36);
                return var8_ref;
              }
            } else {
              L3: {
                ((ud) this).field_c = null;
                var9 = (sf) (Object) ((ud) this).field_g.a((byte) 127, var6);
                if (var9 == null) {
                  var9_ref = sf.a(((ud) this).field_h, param3, param2);
                  if (var9_ref != null) {
                    ((ud) this).field_g.a((ug) (Object) var9_ref, var6, (byte) -36);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8_ref = var9_ref.a(param0);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c(-19822);
                ((ud) this).field_f.a((ug) (Object) var8_ref, var6, (byte) -36);
                return var8_ref;
              }
            }
          }
        } else {
          return var8;
        }
    }

    private final td a(int param0, String param1, int[] param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((ud) this).field_c.c(param1, (byte) -105);
        if (-1 >= var5) {
          var6 = ((ud) this).field_c.a(param3, var5, -28459);
          if (-1 <= var6) {
            if (param0 != 1620678500) {
              ((ud) this).field_f = null;
              return this.a((byte) 13, var6, param2, var5);
            } else {
              return this.a((byte) 13, var6, param2, var5);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    ud(ad param0, ad param1) {
        ((ud) this).field_g = new cg(256);
        ((ud) this).field_f = new cg(256);
        ((ud) this).field_h = param1;
        ((ud) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 500;
    }
}
