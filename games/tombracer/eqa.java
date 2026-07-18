/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eqa implements os {
    static float field_a;

    final static boolean a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var53 = null;
        String var54 = null;
        String var55 = null;
        String var56 = null;
        String var57 = null;
        String var58 = null;
        String var59 = null;
        String var60 = null;
        String var61 = null;
        Object var62 = null;
        Object var63 = null;
        Object var64 = null;
        CharSequence var65 = null;
        L0: {
          var62 = null;
          var63 = null;
          var64 = null;
          var11 = TombRacer.field_G ? 1 : 0;
          var3 = 1;
          if (voa.field_v) {
            break L0;
          } else {
            if (wi.field_s == null) {
              var3 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (bta.field_q != 0) {
            break L1;
          } else {
            if (ifa.field_n != null) {
              var3 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (bta.field_q != 2) {
            break L2;
          } else {
            int discarded$16 = 24316;
            if (at.f()) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        if (fna.field_h != 84) {
          if (fna.field_h == 85) {
            if (var3 != 0) {
              if (vc.field_n.length() > 0) {
                StringBuilder discarded$17 = ana.a(-1 + vc.field_n.length(), ' ', -11, vc.field_n);
                return true;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            var4 = kda.field_td;
            if (rra.a((byte) -126, (char) var4)) {
              if (var3 != 0) {
                if (vc.field_n.length() < 80) {
                  L3: {
                    StringBuilder discarded$18 = vc.field_n.append((char) var4);
                    var5 = 485;
                    var6 = fna.field_k;
                    int discarded$19 = 8;
                    var12 = ima.a(var6);
                    var56 = var12;
                    if (bta.field_q != 2) {
                      L4: {
                        var7 = "";
                        if (0 != bta.field_q) {
                          break L4;
                        } else {
                          L5: {
                            if (null != uu.field_a) {
                              break L5;
                            } else {
                              if (kq.field_c) {
                                var7 = "[" + cla.field_o + "] ";
                                break L5;
                              } else {
                                L6: {
                                  if (uu.field_a == null) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (!kp.field_c) {
                                        break L7;
                                      } else {
                                        if (tla.field_f == null) {
                                          break L7;
                                        } else {
                                          var55 = "[" + tla.field_f + "] ";
                                          var57 = var55 + var56 + ": ";
                                          var5 = var5 - lpa.field_s.b(var57);
                                          if (var5 < lpa.field_s.b(vc.field_n.toString())) {
                                            StringBuilder discarded$20 = ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
                                            return true;
                                          } else {
                                            return true;
                                          }
                                        }
                                      }
                                    }
                                    var7 = "[" + gl.a((byte) 94, jea.field_nb, new String[1]) + "] ";
                                    break L6;
                                  }
                                }
                                var58 = var7 + var56 + ": ";
                                var5 = var5 - lpa.field_s.b(var58);
                                if (var5 < lpa.field_s.b(vc.field_n.toString())) {
                                  StringBuilder discarded$21 = ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
                                  return true;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                          if (uu.field_a == null) {
                            break L4;
                          } else {
                            L8: {
                              if (!kp.field_c) {
                                break L8;
                              } else {
                                if (tla.field_f == null) {
                                  break L8;
                                } else {
                                  var59 = "[" + tla.field_f + "] ";
                                  var60 = var59 + var56 + ": ";
                                  var5 = var5 - lpa.field_s.b(var60);
                                  if (var5 < lpa.field_s.b(vc.field_n.toString())) {
                                    StringBuilder discarded$22 = ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
                                    return true;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                            var7 = "[" + gl.a((byte) 94, jea.field_nb, new String[1]) + "] ";
                            break L4;
                          }
                        }
                      }
                      var61 = var7 + var56 + ": ";
                      var5 = var5 - lpa.field_s.b(var61);
                      break L3;
                    } else {
                      var65 = (CharSequence) (Object) wp.field_a;
                      var53 = gl.a((byte) 115, wha.field_G, new String[1]);
                      var54 = gl.a((byte) 102, li.field_a, new String[1]);
                      var9 = lpa.field_s.b(var53);
                      var10 = lpa.field_s.b(var54);
                      if (var9 > var10) {
                        var5 = var5 - var9;
                        break L3;
                      } else {
                        var5 = var5 - var10;
                        break L3;
                      }
                    }
                  }
                  if (var5 < lpa.field_s.b(vc.field_n.toString())) {
                    StringBuilder discarded$23 = ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
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
            } else {
              return false;
            }
          }
        } else {
          if (var3 != 0) {
            if (vc.field_n.length() > 0) {
              var4_ref_String = vc.field_n.toString();
              int discarded$24 = -1;
              if (!lt.a(var4_ref_String)) {
                L9: {
                  var5 = bta.field_q;
                  if (var5 != 0) {
                    break L9;
                  } else {
                    if (null == uu.field_a) {
                      break L9;
                    } else {
                      var5 = 1;
                      break L9;
                    }
                  }
                }
                if (gda.a(var5, -20011) != 2) {
                  opa.a(bta.field_q, var4_ref_String, param0, 32371, wp.field_a, -1);
                  int discarded$25 = 1;
                  ufa.a();
                  return true;
                } else {
                  loa.a(var5, param2, (byte) 108, 1);
                  opa.a(bta.field_q, var4_ref_String, param0, 32371, wp.field_a, -1);
                  int discarded$26 = 1;
                  ufa.a();
                  return true;
                }
              } else {
                int discarded$27 = 2;
                gu.a(0, true, (String) null, sba.field_m, (String) null);
                int discarded$28 = 2;
                gu.a(0, true, (String) null, mm.field_f, (String) null);
                int discarded$29 = 1;
                ufa.a();
                return true;
              }
            } else {
              int discarded$30 = 1;
              ufa.a();
              return true;
            }
          } else {
            if (bta.field_q != 0) {
              int discarded$31 = 1;
              ufa.a();
              return true;
            } else {
              return true;
            }
          }
        }
    }

    public final mva[] a(int param0, int param1) {
        if (param1 != -26955) {
            mva discarded$0 = ((eqa) this).a((byte) -119);
            return (mva[]) (Object) new cfa[param0];
        }
        return (mva[]) (Object) new cfa[param0];
    }

    public final mva a(byte param0) {
        if (param0 > -17) {
            return null;
        }
        return (mva) (Object) new cfa();
    }

    static {
    }
}
