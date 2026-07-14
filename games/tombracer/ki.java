/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends dg {
    static jua field_n;
    static int field_o;
    static String field_p;
    private int field_m;

    final void a(int param0, la param1, kh param2) {
        super.a(127, param1, param2);
        if (param0 <= 119) {
          ((ki) this).field_m = 120;
          ((ki) this).field_m = param2.b((byte) 44, 4);
          return;
        } else {
          ((ki) this).field_m = param2.b((byte) 44, 4);
          return;
        }
    }

    final void a(byte param0, kh param1) {
        super.a((byte) 115, param1);
        int var3 = 44 / ((param0 - -8) / 40);
        param1.a((byte) -125, ((ki) this).field_m, 4);
    }

    ki(int param0) {
        super(param0);
    }

    final static void a(int param0, java.awt.Component param1) {
        Object var3 = null;
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) nfa.field_n);
        if (param0 != -18520) {
          var3 = null;
          ki.a(-126, (java.awt.Component) null);
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) nfa.field_n);
          ita.field_f = -1;
          return;
        } else {
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) nfa.field_n);
          ita.field_f = -1;
          return;
        }
    }

    final static wda a(kh param0, byte param1, la param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if ((param2.field_E ^ -1) < -8) {
            var4 = param0.b((byte) 44, 6);
            break L0;
          } else {
            var4 = param0.b((byte) 44, 4);
            break L0;
          }
        }
        var5 = 37 / ((-67 - param1) / 45);
        var6 = var4;
        if (var6 != 0) {
          if (var6 != 1) {
            if ((var6 ^ -1) != -3) {
              if (3 != var6) {
                if (4 != var6) {
                  if (5 != var6) {
                    if (var6 != 6) {
                      if (var6 != 7) {
                        if (var6 != -9) {
                          if (-10 != var6) {
                            if (10 != var6) {
                              if (11 != var6) {
                                if (var6 != 12) {
                                  if (var6 != -14) {
                                    if (-15 != var6) {
                                      if (15 != var6) {
                                        if (-17 == (var6 ^ -1)) {
                                          return (wda) (Object) new ri(param2, param0, param3);
                                        } else {
                                          throw new IllegalStateException("Unrecognised locomotor type: " + var4);
                                        }
                                      } else {
                                        return (wda) (Object) new lo(param2, param0, param3);
                                      }
                                    } else {
                                      return (wda) (Object) new hia(param2, param0, param3);
                                    }
                                  } else {
                                    return (wda) (Object) new oqa(param2, param0, param3);
                                  }
                                } else {
                                  return (wda) (Object) new rsa(param2, param0, param3);
                                }
                              } else {
                                return (wda) (Object) new ira(param2, param0, param3);
                              }
                            } else {
                              return (wda) (Object) new sa(param2, param0, param3);
                            }
                          } else {
                            return (wda) (Object) new uha(param2, param0, param3);
                          }
                        } else {
                          return (wda) (Object) new uqa(param2, param0, param3);
                        }
                      } else {
                        return (wda) (Object) new pt(param2, param0, param3);
                      }
                    } else {
                      return (wda) (Object) new spa(param2, param0, param3);
                    }
                  } else {
                    return (wda) (Object) new ro(param2, param0, param3);
                  }
                } else {
                  return (wda) (Object) new ws(param2, param0, param3);
                }
              } else {
                return (wda) (Object) new bha(param2, param0, param3);
              }
            } else {
              return (wda) (Object) new nj(param2, param0, param3);
            }
          } else {
            return (wda) (Object) new bg(param2, param0, param3);
          }
        } else {
          return (wda) (Object) new wi(param2, param0, param3);
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
    }

    ki(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void a(boolean param0, int param1) {
        ((ki) this).field_m = param1;
        if (!param0) {
            field_p = null;
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        if (param0) {
            field_n = null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static void b(boolean param0, int param1) {
        int var3 = 0;
        kb var4 = null;
        Object var5 = null;
        bb var5_ref = null;
        var5 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var4 = (kb) (Object) nn.field_a.f(-80);
        L0: while (true) {
          if (var4 == null) {
            if (!param0) {
              var5_ref = (bb) (Object) mg.field_b.f(-80);
              L1: while (true) {
                if (var5_ref == null) {
                  return;
                } else {
                  pc.a(param0, param1, var5_ref);
                  var5_ref = (bb) (Object) mg.field_b.e(122);
                  continue L1;
                }
              }
            } else {
              ki.b(true, -117);
              var5_ref = (bb) (Object) mg.field_b.f(-80);
              L2: while (true) {
                if (var5_ref == null) {
                  return;
                } else {
                  pc.a(param0, param1, var5_ref);
                  var5_ref = (bb) (Object) mg.field_b.e(122);
                  continue L2;
                }
              }
            }
          } else {
            mca.a(var4, 0, param1);
            var4 = (kb) (Object) nn.field_a.e(111);
            continue L0;
          }
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        ka var6 = null;
        ka var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ka var10 = null;
        ka var11 = null;
        ka var11_ref = null;
        ka var12 = null;
        ka var12_ref = null;
        ka var13 = null;
        ka var13_ref = null;
        var9 = TombRacer.field_G ? 1 : 0;
        var7 = 31 / ((param4 - -38) / 47);
        var6 = null;
        var8 = ((ki) this).field_m;
        if (var8 == -1) {
          var10 = jna.field_j[0];
          var11 = var10;
          var12 = var11;
          var13 = var12;
          var6 = var13;
          var11 = var10;
          if (var10 == null) {
            return;
          } else {
            var8 = dfa.a(-((ki) this).field_h.g(-25787) + 4096 >> -1939587294, 2048, -111);
            gqa.a(var8, -83584144, param1, param2, var10, param3);
            return;
          }
        } else {
          if (-2 != var8) {
            if (var8 == 2) {
              var12_ref = jna.field_j[2];
              var13 = var12_ref;
              var6 = var13;
              var13 = var12_ref;
              if (var12_ref == null) {
                return;
              } else {
                var8 = dfa.a(-((ki) this).field_h.g(-25787) + 4096 >> -1939587294, 2048, -111);
                gqa.a(var8, -83584144, param1, param2, var12_ref, param3);
                return;
              }
            } else {
              if (3 == var8) {
                var13_ref = jna.field_j[3];
                var6 = var13_ref;
                var6 = var13_ref;
                if (var13_ref == null) {
                  return;
                } else {
                  var8 = dfa.a(-((ki) this).field_h.g(-25787) + 4096 >> -1939587294, 2048, -111);
                  gqa.a(var8, -83584144, param1, param2, var13_ref, param3);
                  return;
                }
              } else {
                L0: {
                  if ((var8 ^ -1) != -5) {
                    break L0;
                  } else {
                    var6_ref = jna.field_j[4];
                    break L0;
                  }
                }
                if (var6_ref == null) {
                  return;
                } else {
                  var8 = dfa.a(-((ki) this).field_h.g(-25787) + 4096 >> -1939587294, 2048, -111);
                  gqa.a(var8, -83584144, param1, param2, var6_ref, param3);
                  return;
                }
              }
            }
          } else {
            var11_ref = jna.field_j[1];
            var12 = var11_ref;
            var13 = var12;
            var6 = var13;
            var12 = var11_ref;
            if (var11_ref == null) {
              return;
            } else {
              var8 = dfa.a(-((ki) this).field_h.g(-25787) + 4096 >> -1939587294, 2048, -111);
              gqa.a(var8, -83584144, param1, param2, var11_ref, param3);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 82;
        field_p = "Start Game";
    }
}
