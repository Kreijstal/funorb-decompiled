/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so extends tra implements mk {
    static String field_J;
    private nua field_N;
    private int field_M;
    static int field_K;
    static String field_L;

    public static void m(int param0) {
        if (param0 != 200) {
            boolean discarded$0 = so.a(-98, (byte) 40, -89);
            field_J = null;
            field_L = null;
            return;
        }
        field_J = null;
        field_L = null;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((so) this).field_M = -param0 + jba.field_j + -((so) this).field_i;
    }

    final void a(int param0, nua param1) {
        ((so) this).field_N = param1;
        if (param0 != -13861) {
            field_K = -19;
        }
    }

    final static void n(int param0) {
        vb var1 = null;
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        ipa.field_P.c();
        if (param0 == -16310) {
          gg.field_b.c();
          bga.field_b = bga.field_b - 1;
          if (0 == bga.field_b) {
            bga.field_b = 200;
            var1 = (vb) (Object) tna.field_e.f(-80);
            L0: while (true) {
              if (var1 == null) {
                if (db.field_f != null) {
                  var1 = (vb) (Object) db.field_f.f(param0 ^ 16378);
                  L1: while (true) {
                    if (var1 != null) {
                      L2: {
                        if (var1.field_h.l((byte) -91)) {
                          break L2;
                        } else {
                          var1.p(param0 + 16389);
                          break L2;
                        }
                      }
                      var1 = (vb) (Object) db.field_f.e(118);
                      continue L1;
                    } else {
                      L3: {
                        if (null == fq.field_e) {
                          break L3;
                        } else {
                          if (fq.field_e.a((byte) -114)) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L4: {
                    if (null == fq.field_e) {
                      break L4;
                    } else {
                      if (fq.field_e.a((byte) -114)) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  return;
                }
              } else {
                L5: {
                  if (var1.field_h.l((byte) -101)) {
                    break L5;
                  } else {
                    var1.p(21);
                    break L5;
                  }
                }
                var1 = (vb) (Object) tna.field_e.e(110);
                continue L0;
              }
            }
          } else {
            L6: {
              if (null == fq.field_e) {
                break L6;
              } else {
                if (fq.field_e.a((byte) -114)) {
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } else {
          so.n(117);
          gg.field_b.c();
          bga.field_b = bga.field_b - 1;
          if (0 == bga.field_b) {
            bga.field_b = 200;
            var1 = (vb) (Object) tna.field_e.f(-80);
            L7: while (true) {
              if (var1 == null) {
                if (db.field_f != null) {
                  var1 = (vb) (Object) db.field_f.f(param0 ^ 16378);
                  L8: while (true) {
                    if (var1 != null) {
                      L9: {
                        if (var1.field_h.l((byte) -91)) {
                          break L9;
                        } else {
                          var1.p(param0 + 16389);
                          break L9;
                        }
                      }
                      var1 = (vb) (Object) db.field_f.e(118);
                      continue L8;
                    } else {
                      L10: {
                        if (null == fq.field_e) {
                          break L10;
                        } else {
                          if (fq.field_e.a((byte) -114)) {
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L11: {
                    if (null == fq.field_e) {
                      break L11;
                    } else {
                      if (fq.field_e.a((byte) -114)) {
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  return;
                }
              } else {
                L12: {
                  if (var1.field_h.l((byte) -101)) {
                    break L12;
                  } else {
                    var1.p(21);
                    break L12;
                  }
                }
                var1 = (vb) (Object) tna.field_e.e(110);
                continue L7;
              }
            }
          } else {
            L13: {
              if (null == fq.field_e) {
                break L13;
              } else {
                if (fq.field_e.a((byte) -114)) {
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            return;
          }
        }
    }

    public final nua a(byte param0) {
        if (param0 < 44) {
            return null;
        }
        return ((so) this).field_N;
    }

    final void i(int param0) {
        super.i(param0);
        if (null != ((so) this).field_N) {
            ((so) this).field_N.c(-74);
        }
    }

    so(String param0, qc param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = 118 / ((-39 - param1) / 53);
        return (jj.a(param2, param0, -32842) | mg.a((byte) -53, param2, param0) | gha.a(param2, param0, 86)) & hha.a(param2, 0, param0);
    }

    final String d(byte param0) {
        int var2 = 0;
        if (((so) this).field_f) {
          if (((so) this).field_q == null) {
            return null;
          } else {
            var2 = -81 % ((param0 - -58) / 60);
            gca.a(2533, jba.field_j - (((so) this).field_M + -((so) this).field_m), sta.field_B);
            return ((so) this).field_q;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "+5 Coins";
        field_L = "Error";
    }
}
