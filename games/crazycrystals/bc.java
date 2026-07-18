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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        if (sn.field_c < 0) {
          return;
        } else {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (75 > sn.field_c) {
              var5 = (sn.field_c << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (sn.field_c <= 200) {
              break L1;
            } else {
              var5 = (-sn.field_c + 250 << 8) / 50;
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
          if (sn.field_c < 150) {
            rk.field_a.b(var3, var4);
            var6 = sn.field_c - 125;
            if (var6 > 0) {
              if (var6 < 50) {
                if (20 <= var6) {
                  if (var6 >= 30) {
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
                        ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> 8);
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
                        ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> 8);
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
                      ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> 8);
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                var6 = sn.field_c - 140;
                if (0 < var6) {
                  L9: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L9;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L9;
                    }
                  }
                  ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> 8);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L10: {
                var6 = sn.field_c - 140;
                if (0 >= var6) {
                  break L10;
                } else {
                  L11: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L11;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L11;
                    }
                  }
                  ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> 8);
                  break L10;
                }
              }
              return;
            }
          } else {
            kn.field_p.f(15 + var3, 10 + var4, var5);
            var6 = sn.field_c - 125;
            if (var6 <= 0) {
              L12: {
                var6 = sn.field_c - 140;
                if (0 >= var6) {
                  break L12;
                } else {
                  L13: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L13;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L13;
                    }
                  }
                  ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> 8);
                  break L12;
                }
              }
              return;
            } else {
              L14: {
                if (var6 < 50) {
                  L15: {
                    if (20 <= var6) {
                      if (var6 < 30) {
                        eq.field_k.d(var3, var4, 256);
                        break L15;
                      } else {
                        var7 = 256 * (-var6 + 50) / 20;
                        eq.field_k.d(var3, var4, var7);
                        break L15;
                      }
                    } else {
                      var7 = 256 * var6 / 20;
                      eq.field_k.d(var3, var4, var7);
                      break L15;
                    }
                  }
                  var6 = sn.field_c - 140;
                  if (0 >= var6) {
                    break L14;
                  } else {
                    L16: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L16;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L16;
                      }
                    }
                    ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> 8);
                    break L14;
                  }
                } else {
                  var6 = sn.field_c - 140;
                  if (0 >= var6) {
                    break L14;
                  } else {
                    L17: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L17;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L17;
                      }
                    }
                    ne.field_e.f(var3 - -15, var4 - -10, var5 * var7 >> 8);
                    break L14;
                  }
                }
              }
              return;
            }
          }
        }
    }

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final void a(int param0) {
        kh.a(((bc) this).field_c, ((bc) this).field_d, ((bc) this).field_e);
        if (param0 != 6945) {
            Object var3 = null;
            ((bc) this).a(-44, -26, (java.awt.Component) null, 65);
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_f = null;
    }

    abstract void a(java.awt.Graphics param0, int param1, byte param2, int param3);

    static {
    }
}
