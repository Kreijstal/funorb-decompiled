/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt extends rqa {
    static String field_o;

    qt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (ohb.field_o == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (pma.field_o == 9) {
          if (jeb.a(abb.field_a, wrb.field_p, itb.field_p, rea.field_d, (byte) -93)) {
            L1: {
              if (abb.field_a == 2) {
                break L1;
              } else {
                if (var3 == 0) {
                  break L1;
                } else {
                  return false;
                }
              }
            }
            return fia.a(wrb.field_p, abb.field_a, (byte) 123, itb.field_p, rea.field_d);
          } else {
            if (-11 == (pma.field_o ^ -1)) {
              if (var3 != 0) {
                return false;
              } else {
                or.a(0);
                return true;
              }
            } else {
              if (pma.field_o != 11) {
                if (param1 == 2) {
                  return false;
                } else {
                  return false;
                }
              } else {
                if (cha.field_o) {
                  if (2 == gi.field_a) {
                    if (!ira.a(hb.field_b, cwa.field_b, 41)) {
                      return false;
                    } else {
                      if ((gi.field_a ^ -1) == -3) {
                        if (!jpa.b(param1 + 5)) {
                          return true;
                        } else {
                          var4 = null;
                          va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                          return true;
                        }
                      } else {
                        if (var3 != 0) {
                          return false;
                        } else {
                          if (!jpa.b(param1 + 5)) {
                            return true;
                          } else {
                            var4 = null;
                            va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                            return true;
                          }
                        }
                      }
                    }
                  } else {
                    if ((gi.field_a ^ -1) == -3) {
                      if (!jpa.b(param1 + 5)) {
                        return true;
                      } else {
                        var4 = null;
                        va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                        return true;
                      }
                    } else {
                      if (var3 != 0) {
                        return false;
                      } else {
                        if (!jpa.b(param1 + 5)) {
                          return true;
                        } else {
                          var4 = null;
                          va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                          return true;
                        }
                      }
                    }
                  }
                } else {
                  if (param1 == 2) {
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
        } else {
          if (-11 == (pma.field_o ^ -1)) {
            if (var3 != 0) {
              return false;
            } else {
              or.a(0);
              return true;
            }
          } else {
            if (pma.field_o != 11) {
              if (param1 == 2) {
                return false;
              } else {
                return false;
              }
            } else {
              if (cha.field_o) {
                if (2 == gi.field_a) {
                  if (!ira.a(hb.field_b, cwa.field_b, 41)) {
                    return false;
                  } else {
                    if ((gi.field_a ^ -1) == -3) {
                      if (!jpa.b(param1 + 5)) {
                        return true;
                      } else {
                        var4 = null;
                        va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                        return true;
                      }
                    } else {
                      if (var3 != 0) {
                        return false;
                      } else {
                        if (!jpa.b(param1 + 5)) {
                          return true;
                        } else {
                          var4 = null;
                          va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                          return true;
                        }
                      }
                    }
                  }
                } else {
                  if ((gi.field_a ^ -1) == -3) {
                    if (jpa.b(param1 + 5)) {
                      var4 = null;
                      va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if (var3 == 0) {
                      if (jpa.b(param1 + 5)) {
                        var4 = null;
                        va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                        return true;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                if (param1 != 2) {
                  return false;
                } else {
                  return false;
                }
              }
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          qt.a((phb[]) null, 64, 92, -41, -29, false);
          si.a(50, 62, param0[0].a(48));
          return new nc((Object) (Object) "void");
        } else {
          si.a(50, 62, param0[0].a(48));
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 <= 119) {
            field_o = null;
        }
    }

    final static void a(phb[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = VoidHunters.field_G;
          if (param0 == null) {
            break L0;
          } else {
            if (param3 > 0) {
              var6 = param0[0].field_m;
              var7 = param0[2].field_m;
              var8 = param0[1].field_m;
              param0[0].e(param4, param2, param1);
              param0[2].e(param3 + param4 - var7, param2, param1);
              dma.a(ola.field_o);
              dma.g(var6 + param4, param2, param3 + (param4 - var7), param2 + param0[1].field_n);
              if (!param5) {
                boolean discarded$1 = qt.a(27, -59, -55);
                var9 = var6 + param4;
                var10 = -var7 + (param4 - -param3);
                param4 = var9;
                L1: while (true) {
                  if (param4 >= var10) {
                    dma.b(ola.field_o);
                    return;
                  } else {
                    param0[1].e(param4, param2, param1);
                    param4 = param4 + var8;
                    continue L1;
                  }
                }
              } else {
                var9 = var6 + param4;
                var10 = -var7 + (param4 - -param3);
                param4 = var9;
                L2: while (true) {
                  if (param4 >= var10) {
                    dma.b(ola.field_o);
                    return;
                  } else {
                    param0[1].e(param4, param2, param1);
                    param4 = param4 + var8;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Grappling hook";
    }
}
