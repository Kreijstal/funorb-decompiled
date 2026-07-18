/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static he field_c;
    static String field_b;
    private static t field_a;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        if (jh.field_z < 0) {
          return;
        } else {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (jh.field_z < 75) {
              var5 = (jh.field_z << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (jh.field_z <= 200) {
              break L1;
            } else {
              var5 = (-jh.field_z + 250 << 8) / 50;
              break L1;
            }
          }
          L2: {
            tm.a((byte) -106, field_a);
            be.a();
            ph.b();
            so.b(122);
            if (var5 < 256) {
              ph.b(0, 0, ph.field_j, ph.field_d, 0, -var5 + 256);
              break L2;
            } else {
              break L2;
            }
          }
          r.a(125);
          if (150 <= jh.field_z) {
            cl.field_a.e(15 + var3, 10 + var4, var5);
            var6 = jh.field_z - 125;
            if (var6 > 0) {
              if (50 > var6) {
                if (var6 >= 20) {
                  if (var6 >= 30) {
                    L3: {
                      var7 = (12800 - 256 * var6) / 20;
                      ff.field_c.a(var3, var4, var7);
                      var6 = -140 + jh.field_z;
                      if (var6 <= 0) {
                        break L3;
                      } else {
                        L4: {
                          var7 = 256;
                          if (20 <= var6) {
                            break L4;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L4;
                          }
                        }
                        de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L5: {
                      ff.field_c.a(var3, var4, 256);
                      var6 = -140 + jh.field_z;
                      if (var6 <= 0) {
                        break L5;
                      } else {
                        L6: {
                          var7 = 256;
                          if (20 <= var6) {
                            break L6;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L6;
                          }
                        }
                        de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L7: {
                    var7 = 256 * var6 / 20;
                    ff.field_c.a(var3, var4, var7);
                    var6 = -140 + jh.field_z;
                    if (var6 <= 0) {
                      break L7;
                    } else {
                      L8: {
                        var7 = 256;
                        if (20 <= var6) {
                          break L8;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L8;
                        }
                      }
                      de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  var6 = -140 + jh.field_z;
                  if (var6 <= 0) {
                    break L9;
                  } else {
                    L10: {
                      var7 = 256;
                      if (20 <= var6) {
                        break L10;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L10;
                      }
                    }
                    de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                    break L9;
                  }
                }
                return;
              }
            } else {
              L11: {
                var6 = -140 + jh.field_z;
                if (var6 <= 0) {
                  break L11;
                } else {
                  L12: {
                    var7 = 256;
                    if (20 <= var6) {
                      break L12;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L12;
                    }
                  }
                  de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                  break L11;
                }
              }
              return;
            }
          } else {
            field_a.c(var3, var4);
            var6 = jh.field_z - 125;
            if (var6 > 0) {
              if (50 > var6) {
                if (var6 >= 20) {
                  if (var6 >= 30) {
                    L13: {
                      var7 = (12800 - 256 * var6) / 20;
                      ff.field_c.a(var3, var4, var7);
                      var6 = -140 + jh.field_z;
                      if (var6 <= 0) {
                        break L13;
                      } else {
                        L14: {
                          var7 = 256;
                          if (20 <= var6) {
                            break L14;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L14;
                          }
                        }
                        de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                        break L13;
                      }
                    }
                    return;
                  } else {
                    L15: {
                      ff.field_c.a(var3, var4, 256);
                      var6 = -140 + jh.field_z;
                      if (var6 <= 0) {
                        break L15;
                      } else {
                        L16: {
                          var7 = 256;
                          if (20 <= var6) {
                            break L16;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L16;
                          }
                        }
                        de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                        break L15;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    var7 = 256 * var6 / 20;
                    ff.field_c.a(var3, var4, var7);
                    var6 = -140 + jh.field_z;
                    if (var6 <= 0) {
                      break L17;
                    } else {
                      L18: {
                        var7 = 256;
                        if (20 <= var6) {
                          break L18;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L18;
                        }
                      }
                      de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                      break L17;
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  var6 = -140 + jh.field_z;
                  if (var6 <= 0) {
                    break L19;
                  } else {
                    L20: {
                      var7 = 256;
                      if (20 <= var6) {
                        break L20;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L20;
                      }
                    }
                    de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                    break L19;
                  }
                }
                return;
              }
            } else {
              L21: {
                var6 = -140 + jh.field_z;
                if (var6 <= 0) {
                  break L21;
                } else {
                  L22: {
                    var7 = 256;
                    if (20 <= var6) {
                      break L22;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L22;
                    }
                  }
                  de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
                  break L21;
                }
              }
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new he("");
        field_b = "More suggestions";
        field_a = new t(540, 140);
    }
}
