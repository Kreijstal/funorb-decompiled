/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eqa implements os {
    static float field_a;

    final static boolean a(int param0, boolean param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var60;
        String var61;
        String var62;
        String var63;
        String var64;
        String var65;
        String var66;
        String var67;
        String var68;
        String var69;
        Object var70;
        Object var71;
        Object var72;
        CharSequence var73;
        L0: {
          var70 = null;
          var71 = null;
          var72 = null;
          var11 = TombRacer.field_G ? 1 : 0;
          var3 = param1 ? 1 : 0;
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
          if (-1 != (bta.field_q ^ -1)) {
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
            if (at.f(24316)) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        if ((fna.field_h ^ -1) != -85) {
          if ((fna.field_h ^ -1) == -86) {
            if (var3 != 0) {
              if (vc.field_n.length() > 0) {
                ana.a(-1 + vc.field_n.length(), ' ', -11, vc.field_n);
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
                    discarded$0 = vc.field_n.append((char) var4);
                    var5 = 485;
                    var60 = fna.field_k;
                    var16 = ima.a(var60, (byte) 8);
                    var64 = var16;
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
                                          var63 = "[" + tla.field_f + "] ";
                                          var65 = var63 + var64 + ": ";
                                          var5 = var5 - lpa.field_s.b(var65);
                                          if (var5 < lpa.field_s.b(vc.field_n.toString())) {
                                            ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
                                            return true;
                                          } else {
                                            return true;
                                          }
                                        }
                                      }
                                    }
                                    var7 = "[" + gl.a((byte) 94, jea.field_nb, new String[]{uu.field_a.field_tb}) + "] ";
                                    break L6;
                                  }
                                }
                                var66 = var7 + var64 + ": ";
                                var5 = var5 - lpa.field_s.b(var66);
                                if (var5 < lpa.field_s.b(vc.field_n.toString())) {
                                  ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
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
                                  var67 = "[" + tla.field_f + "] ";
                                  var68 = var67 + var64 + ": ";
                                  var5 = var5 - lpa.field_s.b(var68);
                                  if (var5 < lpa.field_s.b(vc.field_n.toString())) {
                                    ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
                                    return true;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                            var7 = "[" + gl.a((byte) 94, jea.field_nb, new String[]{uu.field_a.field_tb}) + "] ";
                            break L4;
                          }
                        }
                      }
                      var69 = var7 + var64 + ": ";
                      var5 = var5 - lpa.field_s.b(var69);
                      break L3;
                    } else {
                      var73 = (CharSequence) ((Object) wp.field_a);
                      var61 = gl.a((byte) 115, wha.field_G, new String[]{wt.a(30433, var73)});
                      var62 = gl.a((byte) 102, li.field_a, new String[]{var16});
                      var9 = lpa.field_s.b(var61);
                      var10 = lpa.field_s.b(var62);
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
                    ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
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
            if ((vc.field_n.length() ^ -1) < -1) {
              var4_ref_String = vc.field_n.toString();
              if (!lt.a(var4_ref_String, -1)) {
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
                if ((gda.a(var5, -20011) ^ -1) != -3) {
                  opa.a(bta.field_q, var4_ref_String, param0, 32371, wp.field_a, -1);
                  ufa.a(true);
                  return true;
                } else {
                  loa.a(var5, param2, (byte) 108, 1);
                  opa.a(bta.field_q, var4_ref_String, param0, 32371, wp.field_a, -1);
                  ufa.a(true);
                  return true;
                }
              } else {
                var13 = (String) null;
                var12 = (String) null;
                gu.a(0, param1, (String) null, sba.field_m, (String) null, 2);
                var15 = (String) null;
                var14 = (String) null;
                gu.a(0, true, (String) null, mm.field_f, (String) null, 2);
                ufa.a(true);
                return true;
              }
            } else {
              ufa.a(true);
              return true;
            }
          } else {
            if (bta.field_q != 0) {
              ufa.a(true);
              return true;
            } else {
              return true;
            }
          }
        }
    }

    public final mva[] a(int param0, int param1) {
        if (param1 != -26955) {
            this.a((byte) -119);
            return (mva[]) ((Object) new cfa[param0]);
        }
        return (mva[]) ((Object) new cfa[param0]);
    }

    public final mva a(byte param0) {
        if (param0 > -17) {
            return (mva) null;
        }
        return (mva) ((Object) new cfa());
    }

    static {
    }
}
