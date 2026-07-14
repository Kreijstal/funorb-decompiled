/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mi implements le {
    static String field_e;
    static String field_f;
    static int field_c;
    private long field_b;
    static String field_a;
    static String field_d;

    final static boolean a(byte param0) {
        if (param0 >= -103) {
            field_f = null;
            return ih.field_b == null ? fe.field_Gb : true;
        }
        return ih.field_b == null ? fe.field_Gb : true;
    }

    public final String b(int param0) {
        if (!((mi) this).a(true)) {
          if ((hc.a(-9986) ^ -1L) <= (((mi) this).field_b - -350L ^ -1L)) {
            if (param0 != 28433) {
              field_e = null;
              return ((mi) this).c(-103);
            } else {
              return ((mi) this).c(-103);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(String param0, boolean param1, boolean param2, boolean param3) {
        vi.b((byte) -126);
        tm.field_l.a((byte) 76);
        aa.field_a = new ca(pm.field_g, (String) null, kb.field_c, param1, param2);
        fi.field_t = new de(tm.field_l, (fi) (Object) aa.field_a);
        tm.field_l.a(0, (fi) (Object) fi.field_t);
        if (!param3) {
            field_c = 59;
        }
    }

    final static void a(boolean param0, int param1) {
        L0: {
          if (ag.c(-110)) {
            param0 = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == -8241) {
          hn.a(-1781, param0);
          if (en.field_Fb) {
            df.g(he.field_pc.field_c.field_tb, he.field_pc.field_c.field_F, he.field_pc.field_c.field_K, he.field_pc.field_c.field_ub);
            he.field_pc.field_c.a(param0, 24960);
            la.a(param1 ^ 8271, param0);
            return;
          } else {
            la.a(param1 ^ 8271, param0);
            return;
          }
        } else {
          mi.e(-16);
          hn.a(-1781, param0);
          if (!en.field_Fb) {
            la.a(param1 ^ 8271, param0);
            return;
          } else {
            df.g(he.field_pc.field_c.field_tb, he.field_pc.field_c.field_F, he.field_pc.field_c.field_K, he.field_pc.field_c.field_ub);
            he.field_pc.field_c.a(param0, 24960);
            la.a(param1 ^ 8271, param0);
            return;
          }
        }
    }

    final static void d(int param0) {
        if (!(null == tm.field_l)) {
            tm.field_l.g(-115);
        }
        if (!(null == md.field_i)) {
            md.field_i.k(18);
        }
        int var1 = 7 / ((param0 - -74) / 41);
        qd.a(-44);
    }

    public static void e(int param0) {
        field_f = null;
        if (param0 != 12) {
            return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        la var4 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        var4 = (la) (Object) vi.field_h.a((byte) -58);
        L0: while (true) {
          if (var4 == null) {
            if (param1 != 12) {
              field_e = null;
              return;
            } else {
              return;
            }
          } else {
            oa.a(param0, var4, 97);
            var4 = (la) (Object) vi.field_h.a(16213);
            continue L0;
          }
        }
    }

    public final void b(boolean param0) {
        if (param0) {
            mi.a(true, 21);
            ((mi) this).field_b = hc.a(-9986);
            return;
        }
        ((mi) this).field_b = hc.a(-9986);
    }

    public final wl a(int param0) {
        if (!((mi) this).a(true)) {
          if (hc.a(param0 + 12257) < 350L + ((mi) this).field_b) {
            return gd.field_r;
          } else {
            if (param0 != -22243) {
              wl discarded$2 = ((mi) this).a(7);
              return ((mi) this).f(-843083384);
            } else {
              return ((mi) this).f(-843083384);
            }
          }
        } else {
          return wm.field_v;
        }
    }

    abstract String c(int param0);

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        if (param2 == null) {
          return false;
        } else {
          if (param0 == 1203) {
            L0: {
              var3 = param2.length();
              if (var3 < 1) {
                break L0;
              } else {
                if (12 < var3) {
                  break L0;
                } else {
                  var10 = c.a(param2, true);
                  if (var10 == null) {
                    return false;
                  } else {
                    if (var10.length() >= 1) {
                      L1: {
                        if (ck.a(var10.charAt(0), -46)) {
                          break L1;
                        } else {
                          if (ck.a(var10.charAt(-1 + var10.length()), param0 + -1249)) {
                            break L1;
                          } else {
                            var5 = 0;
                            var6 = 0;
                            L2: while (true) {
                              if (param2.length() <= var6) {
                                if (var5 <= 0) {
                                  return true;
                                } else {
                                  return false;
                                }
                              } else {
                                L3: {
                                  var7 = param2.charAt(var6);
                                  if (ck.a((char) var7, -46)) {
                                    var5++;
                                    break L3;
                                  } else {
                                    var5 = 0;
                                    break L3;
                                  }
                                }
                                if ((var5 ^ -1) > -3) {
                                  var6++;
                                  var6++;
                                  continue L2;
                                } else {
                                  if (!param1) {
                                    return false;
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
                      return false;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            return false;
          } else {
            mi.a(-52, -85);
            var3 = param2.length();
            if (var3 >= 1) {
              if (12 >= var3) {
                var9 = c.a(param2, true);
                if (var9 == null) {
                  return false;
                } else {
                  if (var9.length() >= 1) {
                    L4: {
                      if (ck.a(var9.charAt(0), -46)) {
                        break L4;
                      } else {
                        if (ck.a(var9.charAt(-1 + var9.length()), param0 + -1249)) {
                          break L4;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L5: while (true) {
                            if (param2.length() <= var6) {
                              if (var5 <= 0) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L6: {
                                var7 = param2.charAt(var6);
                                if (ck.a((char) var7, -46)) {
                                  var5++;
                                  break L6;
                                } else {
                                  var5 = 0;
                                  break L6;
                                }
                              }
                              if ((var5 ^ -1) > -3) {
                                var6++;
                                var6++;
                                continue L5;
                              } else {
                                if (!param1) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    abstract wl f(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Sorry, you were removed from the game you were playing. This happened either because you were disconnected for too long, or because the server was updated.";
        field_e = "Unpacking music";
        field_a = "Hide private chat and appear offline to friends";
    }
}
