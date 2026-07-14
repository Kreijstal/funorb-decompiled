/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dfa {
    static java.applet.Applet field_e;
    static String field_a;
    static gb field_b;
    int field_d;
    int field_c;

    final static boolean a(int param0, boolean param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null == ifa.field_n) {
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
        if (fna.field_h != 9) {
          if ((fna.field_h ^ -1) != -11) {
            if (!param1) {
              if (fna.field_h != 11) {
                return false;
              } else {
                if (ns.field_f) {
                  L1: {
                    if (-3 != (gm.field_n ^ -1)) {
                      break L1;
                    } else {
                      if (ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                  L2: {
                    if (2 == gm.field_n) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        break L2;
                      } else {
                        return false;
                      }
                    }
                  }
                  L3: {
                    if (oj.i(-1)) {
                      var4 = null;
                      opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              field_e = null;
              if (fna.field_h != 11) {
                return false;
              } else {
                if (ns.field_f) {
                  L4: {
                    if (-3 != (gm.field_n ^ -1)) {
                      break L4;
                    } else {
                      if (ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  L5: {
                    if (2 == gm.field_n) {
                      break L5;
                    } else {
                      if (var3 == 0) {
                        break L5;
                      } else {
                        return false;
                      }
                    }
                  }
                  L6: {
                    if (oj.i(-1)) {
                      var4 = null;
                      opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (var3 != 0) {
              return false;
            } else {
              ola.e((byte) 113);
              return true;
            }
          }
        } else {
          if (sqa.a(uba.field_f, 110, fp.field_d, tba.field_g, bla.field_I)) {
            L7: {
              if (-3 == (uba.field_f ^ -1)) {
                break L7;
              } else {
                if (var3 == 0) {
                  break L7;
                } else {
                  return false;
                }
              }
            }
            return eca.a((byte) -121, uba.field_f, bla.field_I, fp.field_d, tba.field_g);
          } else {
            if ((fna.field_h ^ -1) != -11) {
              if (param1) {
                field_e = null;
                if (fna.field_h == 11) {
                  if (ns.field_f) {
                    L8: {
                      if (-3 != (gm.field_n ^ -1)) {
                        break L8;
                      } else {
                        if (ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                          break L8;
                        } else {
                          return false;
                        }
                      }
                    }
                    L9: {
                      if (2 == gm.field_n) {
                        break L9;
                      } else {
                        if (var3 == 0) {
                          break L9;
                        } else {
                          return false;
                        }
                      }
                    }
                    L10: {
                      if (oj.i(-1)) {
                        var4 = null;
                        opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (fna.field_h == 11) {
                  if (ns.field_f) {
                    if (-3 == (gm.field_n ^ -1)) {
                      if (!ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                        return false;
                      } else {
                        L11: {
                          if (2 == gm.field_n) {
                            break L11;
                          } else {
                            if (var3 == 0) {
                              break L11;
                            } else {
                              return false;
                            }
                          }
                        }
                        L12: {
                          if (oj.i(-1)) {
                            var4 = null;
                            opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (2 != gm.field_n) {
                        if (var3 != 0) {
                          return false;
                        } else {
                          L13: {
                            if (oj.i(-1)) {
                              var4 = null;
                              opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          return true;
                        }
                      } else {
                        L14: {
                          if (oj.i(-1)) {
                            var4 = null;
                            opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              if (var3 != 0) {
                return false;
              } else {
                ola.e((byte) 113);
                return true;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        L0: {
          var3 = 118 % ((24 - param2) / 41);
          if (-1 >= (param0 ^ -1)) {
            break L0;
          } else {
            param0 = param1 + param0 % param1;
            break L0;
          }
        }
        if (param0 >= param1) {
          return param0 % param1;
        } else {
          return param0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param1 >= param2) {
          var8 = param2;
          var5 = var8;
          L0: while (true) {
            if (param1 <= var8) {
              if (param4 != 0) {
                var7 = null;
                String discarded$6 = dfa.a('N', (String) null, (String) null, 30);
                return;
              } else {
                return;
              }
            } else {
              vaa.field_a[var8][param0] = param3;
              var8++;
              continue L0;
            }
          }
        } else {
          var5 = param1;
          L1: while (true) {
            if (param2 > var5) {
              vaa.field_a[var5][param0] = param3;
              var5++;
              continue L1;
            } else {
              if (param4 != 0) {
                var7 = null;
                String discarded$7 = dfa.a('N', (String) null, (String) null, 30);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        L0: {
          og.b(0);
          if (null != nma.field_l) {
            pq.a(nma.field_l, false);
            break L0;
          } else {
            break L0;
          }
        }
        ola.f((byte) 101);
        pc.a(5);
        if (param0 != 62) {
          L1: {
            boolean discarded$12 = dfa.a(-50, false, 79);
            rda.e(0);
            if (bl.b(param0 + -62)) {
              ql.field_k.k(1, -2988);
              bl.a(0, -1);
              break L1;
            } else {
              break L1;
            }
          }
          dea.a(60);
          return;
        } else {
          L2: {
            rda.e(0);
            if (bl.b(param0 + -62)) {
              ql.field_k.k(1, -2988);
              bl.a(0, -1);
              break L2;
            } else {
              break L2;
            }
          }
          dea.a(60);
          return;
        }
    }

    abstract boolean b(int param0);

    abstract void a(byte param0, boolean param1);

    abstract void a(boolean param0, boolean param1, int param2);

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -104) {
            field_b = null;
            field_e = null;
            field_a = null;
            return;
        }
        field_e = null;
        field_a = null;
    }

    abstract void a(int param0);

    final static String a(char param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        var4 = param2.length();
        var5 = param1.length();
        var6 = var4;
        var7 = var5 + -1;
        if (param3 != var7) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param2.indexOf((int) param0, var8_int);
            if (-1 >= (var8_int ^ -1)) {
              var8_int++;
              var6 = var6 + var7;
              continue L0;
            } else {
              var13 = new StringBuilder(var6);
              var8 = var13;
              var9 = 0;
              L1: while (true) {
                var10 = param2.indexOf((int) param0, var9);
                if (var10 < 0) {
                  StringBuilder discarded$6 = var13.append(param2.substring(var9));
                  return var13.toString();
                } else {
                  StringBuilder discarded$7 = var13.append(param2.substring(var9, var10));
                  var9 = var10 + 1;
                  StringBuilder discarded$8 = var13.append(param1);
                  continue L1;
                }
              }
            }
          }
        } else {
          var12 = new StringBuilder(var6);
          var9 = 0;
          L2: while (true) {
            var10 = param2.indexOf((int) param0, var9);
            if (var10 < 0) {
              StringBuilder discarded$9 = var12.append(param2.substring(var9));
              return var12.toString();
            } else {
              StringBuilder discarded$10 = var12.append(param2.substring(var9, var10));
              var9 = var10 + 1;
              StringBuilder discarded$11 = var12.append(param1);
              continue L2;
            }
          }
        }
    }

    abstract boolean a(int param0, char param1, int param2);

    abstract void a(byte param0);

    dfa(int param0) {
        ((dfa) this).field_c = param0;
        ((dfa) this).field_d = ((dfa) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Bruce";
        field_b = new gb();
    }
}
