/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu extends me {
    private int field_j;
    private int field_m;
    static Object field_l;
    static String field_k;
    private int field_n;

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = TombRacer.field_G ? 1 : 0;
        var2 = ((gu) this).field_i.l(106);
        if (param0 < -13) {
          var3 = 16776960;
          var4 = 11184810;
          var5 = 20;
          var6 = 50 + ((gu) this).field_g.field_P * var5;
          var7 = ((gu) this).field_j;
          var8 = var7 - -40;
          rba.a(192, var6, 3145728, ((gu) this).field_n, (byte) 47, var7 - 16, ((gu) this).field_m + -(((gu) this).field_n / 2));
          tp.a(-(((gu) this).field_n / 2) + ((gu) this).field_m, (byte) -85, var7 - 16, 5242880, 2, var6, ((gu) this).field_n);
          oka.a(wj.field_b, 16777215, kn.field_p, -1, var7 - -4, ((gu) this).field_m, 0);
          var9 = 0;
          L0: while (true) {
            if (var9 >= ((gu) this).field_g.field_H.length) {
              return;
            } else {
              var10 = ((gu) this).field_g.field_e.field_b[var9];
              if (var10 != -1) {
                L1: {
                  if (var10 == var2) {
                    var11 = var3;
                    break L1;
                  } else {
                    var11 = var4;
                    break L1;
                  }
                }
                var12 = ((gu) this).field_g.field_H[var10].e(false);
                var13 = ((gu) this).field_g.field_H[var10].j(false);
                var14 = var13 + var12;
                oka.a(rka.a(1 + var9, 114) + "  " + ((gu) this).field_i.a(var10, false) + "  " + rja.field_c + ": " + var14 + " (" + var12 + "+" + var13 + ")", var11, kn.field_p, -1, var8 + var9 * var5, ((gu) this).field_m, 0);
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_l = null;
    }

    final static ci a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = param1;
        if (var2 != 0) {
          if (var2 != 1) {
            if (var2 == 2) {
              return (ci) (Object) new qga();
            } else {
              if (var2 != 3) {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 == 7) {
                        return (ci) (Object) new eka();
                      } else {
                        if (var2 != 8) {
                          if (var2 != 9) {
                            if (var2 == 10) {
                              return (ci) (Object) new wna();
                            } else {
                              if (var2 == 11) {
                                return (ci) (Object) new vda();
                              } else {
                                if (var2 != 12) {
                                  if (var2 != 13) {
                                    if (var2 != 14) {
                                      if (var2 != 15) {
                                        if (var2 == 16) {
                                          return (ci) (Object) new vc();
                                        } else {
                                          if (var2 != 17) {
                                            if (var2 == 18) {
                                              return (ci) (Object) new hb();
                                            } else {
                                              if (var2 == 19) {
                                                return (ci) (Object) new vla();
                                              } else {
                                                if (var2 == 20) {
                                                  return (ci) (Object) new nfa();
                                                } else {
                                                  if (var2 != 21) {
                                                    if (var2 == 22) {
                                                      return (ci) (Object) new sba();
                                                    } else {
                                                      if (var2 != 23) {
                                                        if (24 != var2) {
                                                          if (var2 == 25) {
                                                            return (ci) (Object) new cma();
                                                          } else {
                                                            if (var2 != 26) {
                                                              if (var2 == 27) {
                                                                return (ci) (Object) new bj();
                                                              } else {
                                                                if (28 != var2) {
                                                                  if (29 == var2) {
                                                                    return (ci) (Object) new rda();
                                                                  } else {
                                                                    if (var2 == 30) {
                                                                      return (ci) (Object) new ksa();
                                                                    } else {
                                                                      if (var2 == 31) {
                                                                        return (ci) (Object) new qv();
                                                                      } else {
                                                                        if (32 == var2) {
                                                                          return (ci) (Object) new un();
                                                                        } else {
                                                                          if (var2 == 33) {
                                                                            return (ci) (Object) new jv();
                                                                          } else {
                                                                            if (var2 != 34) {
                                                                              if (var2 == 35) {
                                                                                return (ci) (Object) new go();
                                                                              } else {
                                                                                if (var2 != 36) {
                                                                                  if (var2 == 37) {
                                                                                    return (ci) (Object) new voa();
                                                                                  } else {
                                                                                    if (38 != var2) {
                                                                                      if (39 == var2) {
                                                                                        return (ci) (Object) new coa();
                                                                                      } else {
                                                                                        return null;
                                                                                      }
                                                                                    } else {
                                                                                      return (ci) (Object) new bk();
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  return (ci) (Object) new gia();
                                                                                }
                                                                              }
                                                                            } else {
                                                                              return (ci) (Object) new lva();
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  return (ci) (Object) new iia();
                                                                }
                                                              }
                                                            } else {
                                                              return (ci) (Object) new hv();
                                                            }
                                                          }
                                                        } else {
                                                          return (ci) (Object) new jda();
                                                        }
                                                      } else {
                                                        return (ci) (Object) new fl();
                                                      }
                                                    }
                                                  } else {
                                                    return (ci) (Object) new nia();
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            return (ci) (Object) new wsa();
                                          }
                                        }
                                      } else {
                                        return (ci) (Object) new nw();
                                      }
                                    } else {
                                      return (ci) (Object) new gla();
                                    }
                                  } else {
                                    return (ci) (Object) new bda();
                                  }
                                } else {
                                  return (ci) (Object) new ifa();
                                }
                              }
                            }
                          } else {
                            return (ci) (Object) new pv();
                          }
                        } else {
                          return (ci) (Object) new fs();
                        }
                      }
                    } else {
                      return (ci) (Object) new wja();
                    }
                  } else {
                    return (ci) (Object) new cl();
                  }
                } else {
                  return (ci) (Object) new bma();
                }
              } else {
                return (ci) (Object) new gm();
              }
            }
          } else {
            return (ci) (Object) new lm();
          }
        } else {
          return (ci) (Object) new nga();
        }
    }

    final static void a(int param0, boolean param1, String param2, String param3, String param4, int param5) {
        gqa var6 = null;
        try {
            var6 = new gqa(2, param2, 0, param4, param3);
            tna.a(16599, var6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gu.D(" + 0 + ',' + true + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + 2 + ')');
        }
    }

    gu(qh param0) {
        super(param0);
        ((gu) this).field_j = 350;
        ((gu) this).field_m = 320;
        ((gu) this).field_n = 300;
    }

    final void a(byte param0) {
        if (param0 > -107) {
            ((gu) this).a((byte) -84);
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = -43 % ((29 - param2) / 57);
        return false;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Hold <img=8><img=9> while walking into a moveable block to grab it, then push or pull it around the room. Release <img=8><img=9> to let go.";
    }
}
