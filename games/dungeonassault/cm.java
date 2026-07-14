/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ii implements pf, vg {
    private ck field_N;
    static int field_P;
    private bh field_L;
    private jb field_O;
    static ad field_T;
    static boolean field_Q;
    static String field_S;
    static String field_K;
    static int[] field_M;
    static ek field_R;

    private final String i(int param0) {
        if (param0 <= 109) {
            field_P = -123;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        if (param1 == 98) {
          if (((cm) this).field_N == param0) {
            up.b(-80);
            ((cm) this).field_O.j((byte) 98);
            return;
          } else {
            return;
          }
        } else {
          field_S = null;
          if (((cm) this).field_N != param0) {
            return;
          } else {
            up.b(-80);
            ((cm) this).field_O.j((byte) 98);
            return;
          }
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        if (param2 != null) {
          var3 = param2.length();
          if ((var3 ^ -1) <= -2) {
            if (var3 <= 12) {
              L0: {
                var4 = jm.a((byte) 59, param2);
                if (var4 == null) {
                  break L0;
                } else {
                  if ((var4.length() ^ -1) > -2) {
                    break L0;
                  } else {
                    L1: {
                      if (jc.a(var4.charAt(0), -128)) {
                        break L1;
                      } else {
                        if (jc.a(var4.charAt(var4.length() - 1), -114)) {
                          break L1;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L2: while (true) {
                            if (param2.length() <= var6) {
                              if (param1 < -73) {
                                if (0 < var5) {
                                  return jm.field_e;
                                } else {
                                  return null;
                                }
                              } else {
                                field_S = null;
                                if (0 < var5) {
                                  return jm.field_e;
                                } else {
                                  return null;
                                }
                              }
                            } else {
                              L3: {
                                var7 = param2.charAt(var6);
                                if (jc.a((char) var7, 64)) {
                                  var5++;
                                  break L3;
                                } else {
                                  var5 = 0;
                                  break L3;
                                }
                              }
                              if (-3 < (var5 ^ -1)) {
                                var6++;
                                var6++;
                                continue L2;
                              } else {
                                if (!param0) {
                                  return id.field_c;
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return jm.field_e;
                  }
                }
              }
              return hf.field_zb;
            } else {
              return hf.field_zb;
            }
          } else {
            return hf.field_zb;
          }
        } else {
          return hf.field_zb;
        }
    }

    public static void j(int param0) {
        field_M = null;
        field_S = null;
        if (param0 > -117) {
            return;
        }
        field_K = null;
        field_R = null;
        field_T = null;
    }

    final static void a(float param0, float param1, int param2, float param3, float param4) {
        if (param2 != -7788) {
          field_S = null;
          md.a(1.0f, param1, 1.0f, param0, param3, 0, param4);
          return;
        } else {
          md.a(1.0f, param1, 1.0f, param0, param3, 0, param4);
          return;
        }
    }

    private final String a(int param0) {
        if (param0 < 82) {
            field_R = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, bh param1, int param2, int param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = DungeonAssault.field_K;
        if (param2 == 126) {
          if (param0 != 0) {
            if (param0 != -2) {
              if (-3 != param0) {
                return;
              } else {
                lk.a("conduct.ws", (byte) 58);
                return;
              }
            } else {
              lk.a("privacy.ws", (byte) 58);
              return;
            }
          } else {
            lk.a("terms.ws", (byte) 58);
            return;
          }
        } else {
          var7 = null;
          ((cm) this).a(113, (bh) null, 9, -25);
          if (param0 != 0) {
            if (param0 != -2) {
              if (-3 != param0) {
                return;
              } else {
                lk.a("conduct.ws", (byte) 58);
                return;
              }
            } else {
              lk.a("privacy.ws", (byte) 58);
              return;
            }
          } else {
            lk.a("terms.ws", (byte) 58);
            return;
          }
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        Object var6 = null;
        if (!super.a(param0, param1, param2, (byte) 61)) {
          if (-99 == (param2 ^ -1)) {
            return ((cm) this).a(param0, (byte) 71);
          } else {
            if (99 != param2) {
              if (param3 < 55) {
                var6 = null;
                ((cm) this).a((ck) null, (byte) 8, 78, 7, -119);
                return false;
              } else {
                return false;
              }
            } else {
              return ((cm) this).a((byte) -5, param0);
            }
          }
        } else {
          return true;
        }
    }

    cm(jb param0) {
        super(0, 0, 288, 0, (ca) null);
        ((cm) this).field_O = param0;
        ((cm) this).field_N = new ck(gl.field_Jb, (pg) null);
        ((cm) this).field_N.field_o = (ca) (Object) new na();
        String var7 = jk.a(new String[2], nj.field_a, 30496);
        int var3 = 20;
        hh var4 = new hh(lp.field_C, 0, 0, 0, 0, 16777215, -1, 3, 0, lp.field_C.field_H, -1, 2147483647, true);
        ((cm) this).field_L = new bh(var7, (ca) (Object) var4);
        ((cm) this).field_L.field_i = "";
        ((cm) this).field_L.a(8, 0, kn.field_d);
        ((cm) this).field_L.a(8, 1, kn.field_d);
        ((cm) this).field_L.field_n = (pg) this;
        ((cm) this).field_L.field_x = ((cm) this).field_x - 40;
        ((cm) this).field_L.a(26, (byte) -71, -40 + ((cm) this).field_x, var3);
        var3 = var3 + (15 + ((cm) this).field_L.field_s);
        ((cm) this).b((byte) -119, (lm) (Object) ((cm) this).field_L);
        int var5 = 4;
        int var6 = 200;
        ((cm) this).field_N.b(0, var6, var3, -var6 + 300 >> -2002340479, 40);
        ((cm) this).field_N.field_n = (pg) this;
        ((cm) this).b((byte) -95, (lm) (Object) ((cm) this).field_N);
        ((cm) this).b(0, 300, 0, 0, var5 + 55 + var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new ad(10, 2, 2, 0);
        field_K = "Raider escapes!";
        field_S = "Hoard";
        field_M = rb.b(12632256, 8421504, 64);
    }
}
