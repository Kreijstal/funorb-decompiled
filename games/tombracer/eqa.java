/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eqa implements os {
    static float field_a;

    final static boolean a(int param0, boolean param1, int param2) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var3 = 0;
        int var4 = 0;
        String var4_ref_String = null;
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
        String var19 = null;
        String var45 = null;
        String var46 = null;
        Object var47 = null;
        CharSequence var48 = null;
        L0: {
          var47 = null;
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
          L3: {
            if ((fna.field_h ^ -1) == -86) {
              break L3;
            } else {
              var4 = kda.field_td;
              if (rra.a((byte) -126, (char) var4)) {
                if (var3 != 0) {
                  if (vc.field_n.length() < 80) {
                    L4: {
                      L5: {
                        discarded$4 = vc.field_n.append((char) var4);
                        var5 = 485;
                        var17 = fna.field_k;
                        var7 = var17;
                        var7 = var17;
                        var16 = ima.a(var17, (byte) 8);
                        var7 = var16;
                        var7 = var16;
                        var19 = var16;
                        var7 = var19;
                        var7 = var19;
                        if (bta.field_q != 2) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              var48 = (CharSequence) ((Object) wp.field_a);
                              var18 = gl.a((byte) 115, wha.field_G, new String[]{wt.a(30433, var48)});
                              var7 = var18;
                              var7 = var18;
                              var8 = gl.a((byte) 102, li.field_a, new String[]{var16});
                              var7 = var8;
                              var7 = var8;
                              var9 = lpa.field_s.b(var18);
                              var10 = lpa.field_s.b(var8);
                              if (var9 > var10) {
                                break L7;
                              } else {
                                var5 = var5 - var10;
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var5 = var5 - var9;
                            break L6;
                          }
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L8: {
                        var7 = "";
                        if (0 != bta.field_q) {
                          break L8;
                        } else {
                          L9: {
                            if (null != uu.field_a) {
                              break L9;
                            } else {
                              if (kq.field_c) {
                                var7 = "[" + cla.field_o + "] ";
                                break L9;
                              } else {
                                L10: {
                                  if (uu.field_a == null) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (!kp.field_c) {
                                        break L11;
                                      } else {
                                        if (tla.field_f == null) {
                                          break L11;
                                        } else {
                                          var7 = "[" + tla.field_f + "] ";
                                          if (var11 == 0) {
                                            break L10;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    var7 = "[" + gl.a((byte) 94, jea.field_nb, new String[]{uu.field_a.field_tb}) + "] ";
                                    break L10;
                                  }
                                }
                                var45 = var7 + var19 + ": ";
                                var7 = var45;
                                var7 = var45;
                                var5 = var5 - lpa.field_s.b(var45);
                                if (var5 < lpa.field_s.b(vc.field_n.toString())) {
                                  discarded$5 = ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
                                  return true;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                          if (uu.field_a == null) {
                            break L8;
                          } else {
                            L12: {
                              if (!kp.field_c) {
                                break L12;
                              } else {
                                if (tla.field_f == null) {
                                  break L12;
                                } else {
                                  var7 = "[" + tla.field_f + "] ";
                                  if (var11 == 0) {
                                    break L8;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var7 = "[" + gl.a((byte) 94, jea.field_nb, new String[]{uu.field_a.field_tb}) + "] ";
                            break L8;
                          }
                        }
                      }
                      var46 = var7 + var19 + ": ";
                      var5 = var5 - lpa.field_s.b(var46);
                      break L4;
                    }
                    if (var5 < lpa.field_s.b(vc.field_n.toString())) {
                      discarded$6 = ana.a(vc.field_n.length() - 1, ' ', -11, vc.field_n);
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
                if (var11 != 0) {
                  break L3;
                } else {
                  return false;
                }
              }
            }
          }
          if (var3 != 0) {
            if (vc.field_n.length() > 0) {
              discarded$7 = ana.a(-1 + vc.field_n.length(), ' ', -11, vc.field_n);
              return true;
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          L13: {
            if (var3 != 0) {
              break L13;
            } else {
              if (bta.field_q != 0) {
                ufa.a(true);
                if (var11 != 0) {
                  break L13;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
          if ((vc.field_n.length() ^ -1) < -1) {
            L14: {
              var4_ref_String = vc.field_n.toString();
              var7 = var4_ref_String;
              var7 = var4_ref_String;
              if (!lt.a(var4_ref_String, -1)) {
                break L14;
              } else {
                var13 = (String) null;
                var12 = (String) null;
                gu.a(0, param1, (String) null, sba.field_m, (String) null, 2);
                var15 = (String) null;
                var14 = (String) null;
                gu.a(0, true, (String) null, mm.field_f, (String) null, 2);
                if (var11 != 0) {
                  break L14;
                } else {
                  ufa.a(true);
                  return true;
                }
              }
            }
            L15: {
              var5 = bta.field_q;
              if (var5 != 0) {
                break L15;
              } else {
                if (null == uu.field_a) {
                  break L15;
                } else {
                  var5 = 1;
                  break L15;
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
            ufa.a(true);
            return true;
          }
        }
    }

    public final mva[] a(int param0, int param1) {
        mva discarded$0 = null;
        if (param1 != -26955) {
            discarded$0 = this.a((byte) -119);
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
