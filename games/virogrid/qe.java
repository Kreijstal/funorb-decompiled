/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qe extends mi implements bo {
    private wa field_g;
    static String field_j;
    static boolean field_k;
    static int[] field_h;
    static int[] field_i;
    static int field_m;
    static String field_l;

    public static void b(byte param0) {
        field_i = null;
        field_l = null;
        if (param0 != -36) {
          qe.b((byte) 64);
          field_h = null;
          field_j = null;
          return;
        } else {
          field_h = null;
          field_j = null;
          return;
        }
    }

    qe(wa param0) {
        ((qe) this).field_g = param0;
    }

    final static void a(byte param0, int param1) {
        Object var2 = null;
        pe var2_ref = null;
        int var3 = 0;
        var2 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        ag.field_c = param1;
        if (param0 >= 34) {
          var2_ref = (pe) (Object) co.field_a.a((byte) -105);
          L0: while (true) {
            if (var2_ref == null) {
              if (null != gk.field_f) {
                var2_ref = (pe) (Object) gk.field_f.a((byte) -124);
                L1: while (true) {
                  if (var2_ref != null) {
                    L2: {
                      if (!var2_ref.field_h.b(false)) {
                        var2_ref.a(false);
                        break L2;
                      } else {
                        var2_ref.field_g.f(128 + var2_ref.field_i * ag.field_c >> -362887576);
                        break L2;
                      }
                    }
                    var2_ref = (pe) (Object) gk.field_f.a(16213);
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L3: {
                if (var2_ref.field_h.b(false)) {
                  var2_ref.field_g.f(ag.field_c * var2_ref.field_i + 128 >> -319970392);
                  break L3;
                } else {
                  var2_ref.a(false);
                  break L3;
                }
              }
              var2_ref = (pe) (Object) co.field_a.a(16213);
              continue L0;
            }
          }
        } else {
          field_i = null;
          var2_ref = (pe) (Object) co.field_a.a((byte) -105);
          L4: while (true) {
            if (var2_ref == null) {
              L5: {
                if (null == gk.field_f) {
                  break L5;
                } else {
                  var2_ref = (pe) (Object) gk.field_f.a((byte) -124);
                  L6: while (true) {
                    if (var2_ref == null) {
                      break L5;
                    } else {
                      L7: {
                        if (!var2_ref.field_h.b(false)) {
                          var2_ref.a(false);
                          break L7;
                        } else {
                          var2_ref.field_g.f(128 + var2_ref.field_i * ag.field_c >> -362887576);
                          break L7;
                        }
                      }
                      var2_ref = (pe) (Object) gk.field_f.a(16213);
                      continue L6;
                    }
                  }
                }
              }
              return;
            } else {
              L8: {
                if (var2_ref.field_h.b(false)) {
                  var2_ref.field_g.f(ag.field_c * var2_ref.field_i + 128 >> -319970392);
                  break L8;
                } else {
                  var2_ref.a(false);
                  break L8;
                }
              }
              var2_ref = (pe) (Object) co.field_a.a(16213);
              continue L4;
            }
          }
        }
    }

    abstract String a(int param0, String param1);

    public final void a(boolean param0, wa param1) {
        if (param0) {
            boolean discarded$0 = ((qe) this).a(true);
        }
    }

    final wl f(int param0) {
        if (param0 != -843083384) {
            return null;
        }
        return ((qe) this).a(((qe) this).field_g.field_n, true);
    }

    final static int g(int param0) {
        if (dj.field_n >= 2) {
          if (param0 == 11108) {
            if (ih.field_c != 0) {
              if (sj.field_l != null) {
                if (!sj.field_l.c(param0 ^ 11108)) {
                  return 14;
                } else {
                  if (!sj.field_l.a("", true)) {
                    return 29;
                  } else {
                    if (sj.field_l.a((byte) -102, "")) {
                      if (td.field_a.c(0)) {
                        if (td.field_a.a((byte) -102, "commonui")) {
                          if (!jf.field_j.c(0)) {
                            return 71;
                          } else {
                            if (!jf.field_j.a((byte) -102, "commonui")) {
                              return 80;
                            } else {
                              if (qn.field_I.c(0)) {
                                if (qn.field_I.b(25867)) {
                                  return 100;
                                } else {
                                  return 86;
                                }
                              } else {
                                return 82;
                              }
                            }
                          }
                        } else {
                          return 57;
                        }
                      } else {
                        return 43;
                      }
                    } else {
                      return 29;
                    }
                  }
                }
              } else {
                if (td.field_a.c(0)) {
                  if (td.field_a.a((byte) -102, "commonui")) {
                    if (!jf.field_j.c(0)) {
                      return 71;
                    } else {
                      if (!jf.field_j.a((byte) -102, "commonui")) {
                        return 80;
                      } else {
                        if (qn.field_I.c(0)) {
                          if (!qn.field_I.b(25867)) {
                            return 86;
                          } else {
                            return 100;
                          }
                        } else {
                          return 82;
                        }
                      }
                    }
                  } else {
                    return 57;
                  }
                } else {
                  return 43;
                }
              }
            } else {
              if (td.field_a.c(0)) {
                if (td.field_a.a((byte) -102, "commonui")) {
                  if (!jf.field_j.c(param0 ^ 11108)) {
                    return 50;
                  } else {
                    if (jf.field_j.a((byte) -102, "commonui")) {
                      if (qn.field_I.c(param0 + -11108)) {
                        if (qn.field_I.b(25867)) {
                          return 100;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  }
                } else {
                  return 40;
                }
              } else {
                return 20;
              }
            }
          } else {
            return -58;
          }
        } else {
          return 0;
        }
    }

    public final void a(wa param0, int param1) {
        if (param1 != 13) {
            return;
        }
        ((qe) this).b(false);
    }

    final String c(int param0) {
        if (param0 >= -86) {
            return null;
        }
        return ((qe) this).a(-26358, ((qe) this).field_g.field_n);
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        var2 = param1 >>> 1743078753;
        var2 = var2 | var2 >>> -728240159;
        var2 = var2 | var2 >>> -1224113630;
        var2 = var2 | var2 >>> 1651648292;
        if (param0 != -728240159) {
          field_m = -87;
          var2 = var2 | var2 >>> -843083384;
          var2 = var2 | var2 >>> 319273104;
          return (var2 ^ -1) & param1;
        } else {
          var2 = var2 | var2 >>> -843083384;
          var2 = var2 | var2 >>> 319273104;
          return (var2 ^ -1) & param1;
        }
    }

    public final boolean a(boolean param0) {
        Object var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          if (null != ((qe) this).field_g.field_n) {
            if (0 == ((qe) this).field_g.field_n.length()) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var3 = null;
          wl discarded$5 = ((qe) this).a((String) null, false);
          if (null == ((qe) this).field_g.field_n) {
            return true;
          } else {
            L0: {
              if (0 != ((qe) this).field_g.field_n.length()) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    abstract wl a(String param0, boolean param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Rating";
        field_l = "Please log in to access this feature.";
        field_h = new int[4];
        field_i = new int[8192];
    }
}
