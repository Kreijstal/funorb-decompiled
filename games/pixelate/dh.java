/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static int[] field_d;
    static bb field_a;
    static String[] field_c;
    static ak[] field_b;

    final static void a(byte param0, boolean param1) {
        if (param0 == 58) {
          L0: {
            if ((oo.field_b ^ -1) >= -1) {
              break L0;
            } else {
              if (!uj.field_Wb) {
                break L0;
              } else {
                L1: {
                  t.a(0, 0, t.field_j, ui.field_i.field_gb);
                  nc.field_e.a(param1, 0);
                  if (0 < vn.field_g) {
                    break L1;
                  } else {
                    if (h.field_W > 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                if (!bm.field_o) {
                  return;
                } else {
                  t.a(0, 0, t.field_j, ui.field_i.field_gb);
                  ra.field_e.a(param1, 0);
                  return;
                }
              }
            }
          }
          L2: {
            if (0 < vn.field_g) {
              break L2;
            } else {
              if (h.field_W > 0) {
                break L2;
              } else {
                return;
              }
            }
          }
          if (!bm.field_o) {
            return;
          } else {
            t.a(0, 0, t.field_j, ui.field_i.field_gb);
            ra.field_e.a(param1, 0);
            return;
          }
        } else {
          dh.a(true);
          if ((oo.field_b ^ -1) < -1) {
            if (uj.field_Wb) {
              L3: {
                t.a(0, 0, t.field_j, ui.field_i.field_gb);
                nc.field_e.a(param1, 0);
                if (0 < vn.field_g) {
                  break L3;
                } else {
                  if (h.field_W > 0) {
                    break L3;
                  } else {
                    return;
                  }
                }
              }
              if (!bm.field_o) {
                return;
              } else {
                t.a(0, 0, t.field_j, ui.field_i.field_gb);
                ra.field_e.a(param1, 0);
                return;
              }
            } else {
              if (0 >= vn.field_g) {
                if (h.field_W > 0) {
                  if (!bm.field_o) {
                    return;
                  } else {
                    t.a(0, 0, t.field_j, ui.field_i.field_gb);
                    ra.field_e.a(param1, 0);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (!bm.field_o) {
                  return;
                } else {
                  t.a(0, 0, t.field_j, ui.field_i.field_gb);
                  ra.field_e.a(param1, 0);
                  return;
                }
              }
            }
          } else {
            L4: {
              L5: {
                if (0 < vn.field_g) {
                  break L5;
                } else {
                  if (h.field_W > 0) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              if (bm.field_o) {
                t.a(0, 0, t.field_j, ui.field_i.field_gb);
                ra.field_e.a(param1, 0);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0) {
        hb.field_jb = null;
        uk.field_r = null;
        df.field_r = null;
        if (param0 != 0) {
          dh.a(false);
          sm.field_l = false;
          jk.field_d = null;
          return;
        } else {
          sm.field_l = false;
          jk.field_d = null;
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (!param0) {
            dh.a((byte) 60, true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        StringBuilder var11 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            if (var3 > var2) {
              if (ii.a((byte) 116, param0.charAt(var2))) {
                var2++;
                continue L0;
              } else {
                L1: while (true) {
                  L2: {
                    if (var2 >= var3) {
                      break L2;
                    } else {
                      if (!ii.a((byte) 121, param0.charAt(var3 - 1))) {
                        break L2;
                      } else {
                        var3--;
                        continue L1;
                      }
                    }
                  }
                  var4 = var3 + -var2;
                  if (-2 >= var4) {
                    if (-13 >= var4) {
                      L3: {
                        var11 = new StringBuilder(var4);
                        var6 = var2;
                        if (var3 <= var6) {
                          break L3;
                        } else {
                          L4: {
                            var7 = param0.charAt(var6);
                            if (vf.a((byte) -3, (char) var7)) {
                              L5: {
                                var8 = ae.a(124, (char) var7);
                                if (0 != var8) {
                                  StringBuilder discarded$2 = var11.append(var8);
                                  break L5;
                                } else {
                                  var6++;
                                  break L5;
                                }
                              }
                              var6++;
                              break L4;
                            } else {
                              var6++;
                              break L4;
                            }
                          }
                          var6++;
                          var6++;
                          var6++;
                          var6++;
                          break L3;
                        }
                      }
                      if (param1 >= 24) {
                        if (-1 == var11.length()) {
                          return null;
                        } else {
                          return var11.toString();
                        }
                      } else {
                        field_c = null;
                        if (-1 == var11.length()) {
                          return null;
                        } else {
                          return var11.toString();
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              L6: while (true) {
                L7: {
                  if (var2 >= var3) {
                    break L7;
                  } else {
                    if (!ii.a((byte) 121, param0.charAt(var3 - 1))) {
                      break L7;
                    } else {
                      var3--;
                      continue L6;
                    }
                  }
                }
                var4 = var3 + -var2;
                if (-2 >= var4) {
                  if (-13 >= var4) {
                    L8: {
                      var10 = new StringBuilder(var4);
                      var6 = var2;
                      if (var3 <= var6) {
                        break L8;
                      } else {
                        L9: {
                          var7 = param0.charAt(var6);
                          if (vf.a((byte) -3, (char) var7)) {
                            L10: {
                              var8 = ae.a(124, (char) var7);
                              if (0 != var8) {
                                StringBuilder discarded$3 = var10.append(var8);
                                break L10;
                              } else {
                                var6++;
                                break L10;
                              }
                            }
                            var6++;
                            break L9;
                          } else {
                            var6++;
                            break L9;
                          }
                        }
                        var6++;
                        var6++;
                        var6++;
                        var6++;
                        break L8;
                      }
                    }
                    if (param1 >= 24) {
                      if (-1 == var10.length()) {
                        return null;
                      } else {
                        return var10.toString();
                      }
                    } else {
                      field_c = null;
                      if (-1 == var10.length()) {
                        return null;
                      } else {
                        return var10.toString();
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new bb();
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
