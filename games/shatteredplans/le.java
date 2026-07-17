/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class le {
    static tc field_e;
    static String field_a;
    static String field_c;
    static int field_b;
    static bi field_d;

    abstract void a(byte[] param0, byte param1);

    final static boolean a(int param0, int param1) {
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        Object var21 = null;
        CharSequence var22 = null;
        L0: {
          var21 = null;
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          var3 = 1;
          if (ShatteredPlansClient.field_K) {
            break L0;
          } else {
            if (fa.field_X == null) {
              var3 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (em.field_h != 0) {
            break L1;
          } else {
            if (he.field_p != null) {
              var3 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (2 != em.field_h) {
            break L2;
          } else {
            if (!lh.e((byte) 53)) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        if (oq.field_j == 84) {
          L3: {
            if (var3 == 0) {
              if (em.field_h == 0) {
                break L3;
              } else {
                int discarded$28 = 0;
                qq.c();
                return true;
              }
            } else {
              if (cg.field_E.length() <= 0) {
                int discarded$29 = 0;
                qq.c();
                break L3;
              } else {
                var4_ref_String = cg.field_E.toString();
                var7 = var4_ref_String;
                var7 = var4_ref_String;
                int discarded$30 = 0;
                if (af.a(var4_ref_String)) {
                  var13 = null;
                  var12 = null;
                  md.a(2, pr.field_e, 0, (String) null, (String) null, -16169);
                  var15 = null;
                  var14 = null;
                  md.a(2, go.field_K, 0, (String) null, (String) null, -16169);
                  int discarded$31 = 0;
                  qq.c();
                  return true;
                } else {
                  L4: {
                    var5 = em.field_h;
                    if (var5 != 0) {
                      break L4;
                    } else {
                      if (null != np.field_a) {
                        var5 = 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (id.a(-7019, var5) != 2) {
                    ih.a(gi.field_a, 2, -1, em.field_h, var4_ref_String, param1);
                    int discarded$32 = 0;
                    qq.c();
                    return true;
                  } else {
                    gb.a((byte) 91, param0, 1, var5);
                    ih.a(gi.field_a, 2, -1, em.field_h, var4_ref_String, param1);
                    int discarded$33 = 0;
                    qq.c();
                    return true;
                  }
                }
              }
            }
          }
          return true;
        } else {
          if (oq.field_j == 85) {
            L5: {
              if (var3 == 0) {
                break L5;
              } else {
                if (cg.field_E.length() <= 0) {
                  break L5;
                } else {
                  int discarded$34 = 32;
                  StringBuilder discarded$35 = aj.a(cg.field_E, cg.field_E.length() + -1, 83);
                  return true;
                }
              }
            }
            return true;
          } else {
            var4 = ho.field_h;
            if (!nb.a((char) var4, 99)) {
              int discarded$36 = 36;
              le.a();
              return false;
            } else {
              if (var3 != 0) {
                if (cg.field_E.length() < 80) {
                  L6: {
                    StringBuilder discarded$37 = cg.field_E.append(var4);
                    var5 = 485;
                    var17 = ln.field_o;
                    var16 = v.a(var17, (byte) 17);
                    var18 = var16;
                    if (em.field_h == 2) {
                      var22 = (CharSequence) (Object) gi.field_a;
                      var20 = re.a(fj.field_q, 4371, new String[1]);
                      var8 = re.a(cf.field_M, 4371, new String[1]);
                      var9 = ho.field_f.c(var20);
                      var10 = ho.field_f.c(var8);
                      if (var9 > var10) {
                        var5 = var5 - var9;
                        break L6;
                      } else {
                        L7: {
                          var5 = var5 - var10;
                          if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                            int discarded$38 = 32;
                            StringBuilder discarded$39 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        return true;
                      }
                    } else {
                      L8: {
                        var7 = "";
                        if (0 == em.field_h) {
                          L9: {
                            if (null != np.field_a) {
                              break L9;
                            } else {
                              if (je.field_e) {
                                var7 = "[" + ds.field_a + "] ";
                                break L9;
                              } else {
                                if (null != np.field_a) {
                                  if (!i.field_c) {
                                    L10: {
                                      var7 = "[" + re.a(he.field_q, 4371, new String[1]) + "] ";
                                      var19 = var7 + var18 + ": ";
                                      var5 = var5 - ho.field_f.c(var19);
                                      if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                                        int discarded$40 = 32;
                                        StringBuilder discarded$41 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    return true;
                                  } else {
                                    if (wf.field_m != null) {
                                      L11: {
                                        var7 = "[" + wf.field_m + "] ";
                                        var19 = var7 + var18 + ": ";
                                        var5 = var5 - ho.field_f.c(var19);
                                        if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                                          int discarded$42 = 32;
                                          StringBuilder discarded$43 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      return true;
                                    } else {
                                      L12: {
                                        var7 = "[" + re.a(he.field_q, 4371, new String[1]) + "] ";
                                        var19 = var7 + var18 + ": ";
                                        var5 = var5 - ho.field_f.c(var19);
                                        if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                                          int discarded$44 = 32;
                                          StringBuilder discarded$45 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87);
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      return true;
                                    }
                                  }
                                } else {
                                  var19 = var7 + var18 + ": ";
                                  var5 = var5 - ho.field_f.c(var19);
                                  if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                                    int discarded$46 = 32;
                                    StringBuilder discarded$47 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87);
                                    return true;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                          }
                          if (null != np.field_a) {
                            if (!i.field_c) {
                              L13: {
                                var7 = "[" + re.a(he.field_q, 4371, new String[1]) + "] ";
                                var19 = var7 + var18 + ": ";
                                var5 = var5 - ho.field_f.c(var19);
                                if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                                  int discarded$48 = 32;
                                  StringBuilder discarded$49 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              return true;
                            } else {
                              if (wf.field_m != null) {
                                var7 = "[" + wf.field_m + "] ";
                                break L8;
                              } else {
                                L14: {
                                  var7 = "[" + re.a(he.field_q, 4371, new String[1]) + "] ";
                                  var19 = var7 + var18 + ": ";
                                  var5 = var5 - ho.field_f.c(var19);
                                  if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                                    int discarded$50 = 32;
                                    StringBuilder discarded$51 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                return true;
                              }
                            }
                          } else {
                            var19 = var7 + var18 + ": ";
                            var5 = var5 - ho.field_f.c(var19);
                            break L6;
                          }
                        } else {
                          break L8;
                        }
                      }
                      L15: {
                        var19 = var7 + var18 + ": ";
                        var5 = var5 - ho.field_f.c(var19);
                        if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                          int discarded$52 = 32;
                          StringBuilder discarded$53 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      return true;
                    }
                  }
                  if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                    int discarded$54 = 32;
                    StringBuilder discarded$55 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    public static void a() {
        field_c = null;
        field_d = null;
        field_e = null;
        field_a = null;
    }

    abstract byte[] a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for music";
        field_c = "Rated game";
    }
}
