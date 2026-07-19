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

    final static boolean a(int param0, int param1, boolean param2) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var20 = null;
        String var47 = null;
        String var48 = null;
        String var49 = null;
        String var50 = null;
        String var51 = null;
        String var52 = null;
        String var53 = null;
        String var54 = null;
        String var55 = null;
        String var56 = null;
        String var57 = null;
        String var58 = null;
        String var59 = null;
        Object var60 = null;
        CharSequence var61 = null;
        L0: {
          var60 = null;
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
        if ((oq.field_j ^ -1) == -85) {
          if (var3 == 0) {
            if (-1 == (em.field_h ^ -1)) {
              return true;
            } else {
              qq.c(false);
              return true;
            }
          } else {
            L3: {
              if ((cg.field_E.length() ^ -1) >= -1) {
                qq.c(param2);
                break L3;
              } else {
                var4_ref_String = cg.field_E.toString();
                if (af.a(var4_ref_String, 0)) {
                  var13 = (String) null;
                  var12 = (String) null;
                  md.a(2, pr.field_e, 0, (String) null, (String) null, -16169);
                  var15 = (String) null;
                  var14 = (String) null;
                  md.a(2, go.field_K, 0, (String) null, (String) null, -16169);
                  qq.c(param2);
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
                  if ((id.a(-7019, var5) ^ -1) != -3) {
                    ih.a(gi.field_a, 2, -1, em.field_h, var4_ref_String, param1);
                    qq.c(param2);
                    break L3;
                  } else {
                    gb.a((byte) 91, param0, 1, var5);
                    ih.a(gi.field_a, 2, -1, em.field_h, var4_ref_String, param1);
                    qq.c(param2);
                    return true;
                  }
                }
              }
            }
            return true;
          }
        } else {
          if (-86 == (oq.field_j ^ -1)) {
            if (var3 != 0) {
              if (cg.field_E.length() <= 0) {
                return true;
              } else {
                discarded$12 = aj.a(cg.field_E, cg.field_E.length() + -1, 83, ' ');
                return true;
              }
            } else {
              return true;
            }
          } else {
            var4 = ho.field_h;
            if (!nb.a((char) var4, 99)) {
              if (!param2) {
                return false;
              } else {
                le.a(36);
                return false;
              }
            } else {
              if (var3 != 0) {
                if ((cg.field_E.length() ^ -1) > -81) {
                  L5: {
                    discarded$13 = cg.field_E.append((char) var4);
                    var5 = 485;
                    var17 = ln.field_o;
                    var16 = v.a(var17, (byte) 17);
                    var18 = var16;
                    if ((em.field_h ^ -1) == -3) {
                      var61 = (CharSequence) ((Object) gi.field_a);
                      var20 = re.a(fj.field_q, 4371, new String[]{ih.a(var61, -117)});
                      var8 = re.a(cf.field_M, 4371, new String[]{var16});
                      var9 = ho.field_f.c(var20);
                      var10 = ho.field_f.c(var8);
                      if (var9 > var10) {
                        var5 = var5 - var9;
                        break L5;
                      } else {
                        L6: {
                          var5 = var5 - var10;
                          if (var5 < ho.field_f.c(cg.field_E.toString())) {
                            discarded$14 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        return true;
                      }
                    } else {
                      var7 = "";
                      if (0 == em.field_h) {
                        L7: {
                          if (null != np.field_a) {
                            break L7;
                          } else {
                            if (je.field_e) {
                              var7 = "[" + ds.field_a + "] ";
                              break L7;
                            } else {
                              if (null != np.field_a) {
                                if (i.field_c) {
                                  if (wf.field_m == null) {
                                    L8: {
                                      var48 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
                                      var49 = var48 + var18 + ": ";
                                      var5 = var5 - ho.field_f.c(var49);
                                      if (var5 < ho.field_f.c(cg.field_E.toString())) {
                                        discarded$15 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    return true;
                                  } else {
                                    L9: {
                                      var52 = "[" + wf.field_m + "] ";
                                      var53 = var52 + var18 + ": ";
                                      var5 = var5 - ho.field_f.c(var53);
                                      if (var5 < ho.field_f.c(cg.field_E.toString())) {
                                        discarded$16 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    return true;
                                  }
                                } else {
                                  L10: {
                                    var50 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
                                    var51 = var50 + var18 + ": ";
                                    var5 = var5 - ho.field_f.c(var51);
                                    if (var5 < ho.field_f.c(cg.field_E.toString())) {
                                      discarded$17 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  return true;
                                }
                              } else {
                                var47 = var7 + var18 + ": ";
                                var5 = var5 - ho.field_f.c(var47);
                                if (var5 >= ho.field_f.c(cg.field_E.toString())) {
                                  return true;
                                } else {
                                  discarded$18 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                                  return true;
                                }
                              }
                            }
                          }
                        }
                        if (null != np.field_a) {
                          if (i.field_c) {
                            if (wf.field_m == null) {
                              L11: {
                                var55 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
                                var56 = var55 + var18 + ": ";
                                var5 = var5 - ho.field_f.c(var56);
                                if (var5 < ho.field_f.c(cg.field_E.toString())) {
                                  discarded$19 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              return true;
                            } else {
                              L12: {
                                var7 = "[" + wf.field_m + "] ";
                                var59 = var7 + var18 + ": ";
                                var5 = var5 - ho.field_f.c(var59);
                                if (var5 < ho.field_f.c(cg.field_E.toString())) {
                                  discarded$20 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              return true;
                            }
                          } else {
                            L13: {
                              var57 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
                              var58 = var57 + var18 + ": ";
                              var5 = var5 - ho.field_f.c(var58);
                              if (var5 < ho.field_f.c(cg.field_E.toString())) {
                                discarded$21 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            return true;
                          }
                        } else {
                          var54 = var7 + var18 + ": ";
                          var5 = var5 - ho.field_f.c(var54);
                          break L5;
                        }
                      } else {
                        L14: {
                          var59 = var7 + var18 + ": ";
                          var5 = var5 - ho.field_f.c(var59);
                          if (var5 < ho.field_f.c(cg.field_E.toString())) {
                            discarded$22 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        return true;
                      }
                    }
                  }
                  if (var5 >= ho.field_f.c(cg.field_E.toString())) {
                    return true;
                  } else {
                    discarded$23 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
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

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0 < 119) {
            field_b = -98;
            field_a = null;
            return;
        }
        field_a = null;
    }

    abstract byte[] a(boolean param0);

    static {
        field_a = "Waiting for music";
        field_c = "Rated game";
    }
}
