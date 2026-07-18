/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends tk {
    byte field_B;
    int field_z;
    static int field_y;
    static int[] field_A;
    be field_x;

    final static void b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        if (0 <= fb.field_a) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (75 > fb.field_a) {
              var5 = (fb.field_a << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (fb.field_a > 200) {
              var5 = (250 - fb.field_a << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          mb.a((byte) -35, kj.field_l);
          ig.a();
          ll.a();
          be.a((byte) -78);
          if (256 <= var5) {
            ch.m(119);
            if (150 <= fb.field_a) {
              ej.field_d.d(var3 - -15, 10 + var4, var5);
              var6 = fb.field_a + -125;
              var7 = -43;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (30 > var6) {
                      L2: {
                        ha.field_E.a(var3, var4, 256);
                        var6 = fb.field_a + -140;
                        if (var6 <= 0) {
                          break L2;
                        } else {
                          L3: {
                            var8 = 256;
                            if (var6 < 20) {
                              var8 = 256 * var6 / 20;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        var8 = (-(256 * var6) + 12800) / 20;
                        ha.field_E.a(var3, var4, var8);
                        var6 = fb.field_a + -140;
                        if (var6 <= 0) {
                          break L4;
                        } else {
                          L5: {
                            var8 = 256;
                            if (var6 < 20) {
                              var8 = 256 * var6 / 20;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      var8 = 256 * var6 / 20;
                      ha.field_E.a(var3, var4, var8);
                      var6 = fb.field_a + -140;
                      if (var6 <= 0) {
                        break L6;
                      } else {
                        L7: {
                          var8 = 256;
                          if (var6 < 20) {
                            var8 = 256 * var6 / 20;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    var6 = fb.field_a + -140;
                    if (var6 <= 0) {
                      break L8;
                    } else {
                      L9: {
                        var8 = 256;
                        if (var6 < 20) {
                          var8 = 256 * var6 / 20;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  var6 = fb.field_a + -140;
                  if (var6 <= 0) {
                    break L10;
                  } else {
                    L11: {
                      var8 = 256;
                      if (var6 < 20) {
                        var8 = 256 * var6 / 20;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                    break L10;
                  }
                }
                return;
              }
            } else {
              kj.field_l.d(var3, var4);
              var6 = fb.field_a + -125;
              var7 = -43;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (30 > var6) {
                      L12: {
                        ha.field_E.a(var3, var4, 256);
                        var6 = fb.field_a + -140;
                        if (var6 <= 0) {
                          break L12;
                        } else {
                          L13: {
                            var8 = 256;
                            if (var6 < 20) {
                              var8 = 256 * var6 / 20;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L14: {
                        var8 = (-(256 * var6) + 12800) / 20;
                        ha.field_E.a(var3, var4, var8);
                        var6 = fb.field_a + -140;
                        if (var6 <= 0) {
                          break L14;
                        } else {
                          L15: {
                            var8 = 256;
                            if (var6 < 20) {
                              var8 = 256 * var6 / 20;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                          break L14;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      var8 = 256 * var6 / 20;
                      ha.field_E.a(var3, var4, var8);
                      var6 = fb.field_a + -140;
                      if (var6 <= 0) {
                        break L16;
                      } else {
                        L17: {
                          var8 = 256;
                          if (var6 < 20) {
                            var8 = 256 * var6 / 20;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L18: {
                    var6 = fb.field_a + -140;
                    if (var6 <= 0) {
                      break L18;
                    } else {
                      L19: {
                        var8 = 256;
                        if (var6 < 20) {
                          var8 = 256 * var6 / 20;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  var6 = fb.field_a + -140;
                  if (var6 <= 0) {
                    break L20;
                  } else {
                    L21: {
                      var8 = 256;
                      if (var6 < 20) {
                        var8 = 256 * var6 / 20;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                    break L20;
                  }
                }
                return;
              }
            }
          } else {
            L22: {
              ll.c(0, 0, ll.field_d, ll.field_k, 0, -var5 + 256);
              ch.m(119);
              if (150 <= fb.field_a) {
                ej.field_d.d(var3 - -15, 10 + var4, var5);
                break L22;
              } else {
                kj.field_l.d(var3, var4);
                break L22;
              }
            }
            var6 = fb.field_a + -125;
            var7 = -43;
            if (var6 > 0) {
              if (var6 < 50) {
                if (var6 >= 20) {
                  if (30 > var6) {
                    L23: {
                      ha.field_E.a(var3, var4, 256);
                      var6 = fb.field_a + -140;
                      if (var6 <= 0) {
                        break L23;
                      } else {
                        L24: {
                          var8 = 256;
                          if (var6 < 20) {
                            var8 = 256 * var6 / 20;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                        break L23;
                      }
                    }
                    return;
                  } else {
                    L25: {
                      var8 = (-(256 * var6) + 12800) / 20;
                      ha.field_E.a(var3, var4, var8);
                      var6 = fb.field_a + -140;
                      if (var6 <= 0) {
                        break L25;
                      } else {
                        L26: {
                          var8 = 256;
                          if (var6 < 20) {
                            var8 = 256 * var6 / 20;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                        break L25;
                      }
                    }
                    return;
                  }
                } else {
                  L27: {
                    var8 = 256 * var6 / 20;
                    ha.field_E.a(var3, var4, var8);
                    var6 = fb.field_a + -140;
                    if (var6 <= 0) {
                      break L27;
                    } else {
                      L28: {
                        var8 = 256;
                        if (var6 < 20) {
                          var8 = 256 * var6 / 20;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                      break L27;
                    }
                  }
                  return;
                }
              } else {
                L29: {
                  var6 = fb.field_a + -140;
                  if (var6 <= 0) {
                    break L29;
                  } else {
                    L30: {
                      var8 = 256;
                      if (var6 < 20) {
                        var8 = 256 * var6 / 20;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                    break L29;
                  }
                }
                return;
              }
            } else {
              L31: {
                var6 = fb.field_a + -140;
                if (var6 <= 0) {
                  break L31;
                } else {
                  L32: {
                    var8 = 256;
                    if (var6 < 20) {
                      var8 = 256 * var6 / 20;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  jd.field_g.d(15 + var3, var4 - -10, var8 * var5 >> 8);
                  break L31;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_A = null;
    }

    final int a(byte param0) {
        if (null == ((hi) this).field_x) {
          return 0;
        } else {
          if (param0 != 43) {
            field_y = -41;
            return ((hi) this).field_x.field_k * 100 / (((hi) this).field_x.field_j.length + -((hi) this).field_B);
          } else {
            return ((hi) this).field_x.field_k * 100 / (((hi) this).field_x.field_j.length + -((hi) this).field_B);
          }
        }
    }

    final byte[] g(int param0) {
        if (param0 == 512) {
          if (!((hi) this).field_w) {
            if (-((hi) this).field_B + ((hi) this).field_x.field_j.length > ((hi) this).field_x.field_k) {
              throw new RuntimeException();
            } else {
              return ((hi) this).field_x.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return null;
        }
    }

    hi() {
    }

    static {
    }
}
