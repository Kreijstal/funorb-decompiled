/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bc {
    int[] field_c;
    int field_e;
    java.awt.Image field_b;
    static am field_a;
    static jh field_f;
    int field_d;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = CrazyCrystals.field_B;
        if (param1 >= 116) {
          if (sn.field_c < 0) {
            return;
          } else {
            L0: {
              var3 = param2 - 135;
              var4 = param0 + -35;
              var5 = 256;
              if (75 > sn.field_c) {
                var5 = (sn.field_c << -894248600) / 75;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (sn.field_c <= 200) {
                break L1;
              } else {
                var5 = (-sn.field_c + 250 << -749629432) / 50;
                break L1;
              }
            }
            L2: {
              em.a((byte) 38, rk.field_a);
              nb.b();
              kh.a();
              ja.d((byte) -67);
              if (var5 < 256) {
                kh.d(0, 0, kh.field_l, kh.field_d, 0, 256 - var5);
                break L2;
              } else {
                break L2;
              }
            }
            lg.a(1);
            if (-151 < (sn.field_c ^ -1)) {
              rk.field_a.b(var3, var4);
              var6 = sn.field_c - 125;
              if (var6 > 0) {
                if ((var6 ^ -1) > -51) {
                  if (20 <= var6) {
                    if (-31 >= (var6 ^ -1)) {
                      L3: {
                        var7 = 256 * (-var6 + 50) / 20;
                        eq.field_k.d(var3, var4, var7);
                        var6 = sn.field_c - 140;
                        if (0 >= var6) {
                          break L3;
                        } else {
                          L4: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L4;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L4;
                            }
                          }
                          ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                          break L3;
                        }
                      }
                      return;
                    } else {
                      L5: {
                        eq.field_k.d(var3, var4, 256);
                        var6 = sn.field_c - 140;
                        if (0 >= var6) {
                          break L5;
                        } else {
                          L6: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L6;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L6;
                            }
                          }
                          ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      var7 = 256 * var6 / 20;
                      eq.field_k.d(var3, var4, var7);
                      var6 = sn.field_c - 140;
                      if (0 >= var6) {
                        break L7;
                      } else {
                        L8: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L8;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L8;
                          }
                        }
                        ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  L9: {
                    var6 = sn.field_c - 140;
                    if (0 >= var6) {
                      break L9;
                    } else {
                      L10: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L10;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L10;
                        }
                      }
                      ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                L11: {
                  var6 = sn.field_c - 140;
                  if (0 >= var6) {
                    break L11;
                  } else {
                    L12: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L12;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L12;
                      }
                    }
                    ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                    break L11;
                  }
                }
                return;
              }
            } else {
              kn.field_p.f(15 + var3, 10 + var4, var5);
              var6 = sn.field_c - 125;
              if (var6 <= 0) {
                L13: {
                  var6 = sn.field_c - 140;
                  if (0 >= var6) {
                    break L13;
                  } else {
                    L14: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L14;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L14;
                      }
                    }
                    ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                    break L13;
                  }
                }
                return;
              } else {
                L15: {
                  if ((var6 ^ -1) > -51) {
                    L16: {
                      if (20 <= var6) {
                        if (-31 < (var6 ^ -1)) {
                          eq.field_k.d(var3, var4, 256);
                          break L16;
                        } else {
                          var7 = 256 * (-var6 + 50) / 20;
                          eq.field_k.d(var3, var4, var7);
                          break L16;
                        }
                      } else {
                        var7 = 256 * var6 / 20;
                        eq.field_k.d(var3, var4, var7);
                        break L16;
                      }
                    }
                    L17: {
                      var6 = sn.field_c - 140;
                      if (0 >= var6) {
                        break L17;
                      } else {
                        L18: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L18;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L18;
                          }
                        }
                        ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                        break L17;
                      }
                    }
                    break L15;
                  } else {
                    L19: {
                      var6 = sn.field_c - 140;
                      if (0 >= var6) {
                        break L19;
                      } else {
                        L20: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L20;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L20;
                          }
                        }
                        ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                        break L19;
                      }
                    }
                    break L15;
                  }
                }
                return;
              }
            }
          }
        } else {
          field_f = (jh) null;
          if (sn.field_c < 0) {
            return;
          } else {
            L21: {
              var3 = param2 - 135;
              var4 = param0 + -35;
              var5 = 256;
              if (75 > sn.field_c) {
                var5 = (sn.field_c << -894248600) / 75;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (sn.field_c <= 200) {
                break L22;
              } else {
                var5 = (-sn.field_c + 250 << -749629432) / 50;
                break L22;
              }
            }
            L23: {
              em.a((byte) 38, rk.field_a);
              nb.b();
              kh.a();
              ja.d((byte) -67);
              if (var5 < 256) {
                kh.d(0, 0, kh.field_l, kh.field_d, 0, 256 - var5);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              lg.a(1);
              if (-151 < (sn.field_c ^ -1)) {
                rk.field_a.b(var3, var4);
                break L24;
              } else {
                kn.field_p.f(15 + var3, 10 + var4, var5);
                break L24;
              }
            }
            L25: {
              L26: {
                var6 = sn.field_c - 125;
                if (var6 <= 0) {
                  break L26;
                } else {
                  if ((var6 ^ -1) > -51) {
                    if (20 <= var6) {
                      if (-31 < (var6 ^ -1)) {
                        eq.field_k.d(var3, var4, 256);
                        break L26;
                      } else {
                        var7 = 256 * (-var6 + 50) / 20;
                        eq.field_k.d(var3, var4, var7);
                        break L26;
                      }
                    } else {
                      var7 = 256 * var6 / 20;
                      eq.field_k.d(var3, var4, var7);
                      break L26;
                    }
                  } else {
                    L27: {
                      var6 = sn.field_c - 140;
                      if (0 >= var6) {
                        break L27;
                      } else {
                        L28: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L28;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L28;
                          }
                        }
                        ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                        break L27;
                      }
                    }
                    break L25;
                  }
                }
              }
              L29: {
                var6 = sn.field_c - 140;
                if (0 >= var6) {
                  break L29;
                } else {
                  L30: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L30;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L30;
                    }
                  }
                  ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> -152919192);
                  break L29;
                }
              }
              break L25;
            }
            return;
          }
        }
    }

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final void a(int param0) {
        kh.a(this.field_c, this.field_d, this.field_e);
        if (param0 != 6945) {
            java.awt.Component var3 = (java.awt.Component) null;
            this.a(-44, -26, (java.awt.Component) null, 65);
        }
    }

    public static void b(int param0) {
        if (param0 != -26389) {
            field_f = (jh) null;
            field_a = null;
            field_f = null;
            return;
        }
        field_a = null;
        field_f = null;
    }

    abstract void a(java.awt.Graphics param0, int param1, byte param2, int param3);

    static {
    }
}
