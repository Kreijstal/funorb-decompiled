/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static int field_c;
    static String field_a;
    static gk field_b;
    static pk field_d;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        if (gb.field_f >= 0) {
          L0: {
            var3 = -135 + param1;
            var4 = param0 - 35;
            var5 = 256;
            if (75 <= gb.field_f) {
              break L0;
            } else {
              var5 = (gb.field_f << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (gb.field_f > 200) {
              var5 = (250 + -gb.field_f << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          Geoblox.a(1, ki.field_c);
          mh.b();
          vb.c();
          ck.a((byte) 123);
          if (var5 >= 256) {
            id.a(true);
            if (gb.field_f >= 150) {
              bk.field_b.d(15 + var3, var4 + 10, var5);
              var6 = -125 + gb.field_f;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (var6 >= 30) {
                      L2: {
                        var7 = 256 * (-var6 + 50) / 20;
                        cd.field_l.c(var3, var4, var7);
                        var6 = gb.field_f - 140;
                        if (var6 <= 0) {
                          break L2;
                        } else {
                          L3: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L3;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L3;
                            }
                          }
                          cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        cd.field_l.c(var3, var4, 256);
                        var6 = gb.field_f - 140;
                        if (var6 <= 0) {
                          break L4;
                        } else {
                          L5: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L5;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L5;
                            }
                          }
                          cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      var7 = var6 * 256 / 20;
                      cd.field_l.c(var3, var4, var7);
                      var6 = gb.field_f - 140;
                      if (var6 <= 0) {
                        break L6;
                      } else {
                        L7: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L7;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L7;
                          }
                        }
                        cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    var6 = gb.field_f - 140;
                    if (var6 <= 0) {
                      break L8;
                    } else {
                      L9: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L9;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L9;
                        }
                      }
                      cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  var6 = gb.field_f - 140;
                  if (var6 <= 0) {
                    break L10;
                  } else {
                    L11: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L11;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L11;
                      }
                    }
                    cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                    break L10;
                  }
                }
                return;
              }
            } else {
              ki.field_c.d(var3, var4);
              var6 = -125 + gb.field_f;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (var6 >= 30) {
                      L12: {
                        var7 = 256 * (-var6 + 50) / 20;
                        cd.field_l.c(var3, var4, var7);
                        var6 = gb.field_f - 140;
                        if (var6 <= 0) {
                          break L12;
                        } else {
                          L13: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L13;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L13;
                            }
                          }
                          cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L14: {
                        cd.field_l.c(var3, var4, 256);
                        var6 = gb.field_f - 140;
                        if (var6 <= 0) {
                          break L14;
                        } else {
                          L15: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L15;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L15;
                            }
                          }
                          cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                          break L14;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      var7 = var6 * 256 / 20;
                      cd.field_l.c(var3, var4, var7);
                      var6 = gb.field_f - 140;
                      if (var6 <= 0) {
                        break L16;
                      } else {
                        L17: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L17;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L17;
                          }
                        }
                        cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L18: {
                    var6 = gb.field_f - 140;
                    if (var6 <= 0) {
                      break L18;
                    } else {
                      L19: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L19;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L19;
                        }
                      }
                      cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  var6 = gb.field_f - 140;
                  if (var6 <= 0) {
                    break L20;
                  } else {
                    L21: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L21;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L21;
                      }
                    }
                    cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                    break L20;
                  }
                }
                return;
              }
            }
          } else {
            L22: {
              vb.b(0, 0, vb.field_f, vb.field_b, 0, -var5 + 256);
              id.a(true);
              if (gb.field_f >= 150) {
                bk.field_b.d(15 + var3, var4 + 10, var5);
                break L22;
              } else {
                ki.field_c.d(var3, var4);
                break L22;
              }
            }
            var6 = -125 + gb.field_f;
            if (var6 > 0) {
              if (var6 < 50) {
                if (var6 >= 20) {
                  if (var6 >= 30) {
                    L23: {
                      var7 = 256 * (-var6 + 50) / 20;
                      cd.field_l.c(var3, var4, var7);
                      var6 = gb.field_f - 140;
                      if (var6 <= 0) {
                        break L23;
                      } else {
                        L24: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L24;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L24;
                          }
                        }
                        cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                        break L23;
                      }
                    }
                    return;
                  } else {
                    L25: {
                      cd.field_l.c(var3, var4, 256);
                      var6 = gb.field_f - 140;
                      if (var6 <= 0) {
                        break L25;
                      } else {
                        L26: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L26;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L26;
                          }
                        }
                        cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                        break L25;
                      }
                    }
                    return;
                  }
                } else {
                  L27: {
                    var7 = var6 * 256 / 20;
                    cd.field_l.c(var3, var4, var7);
                    var6 = gb.field_f - 140;
                    if (var6 <= 0) {
                      break L27;
                    } else {
                      L28: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L28;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L28;
                        }
                      }
                      cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                      break L27;
                    }
                  }
                  return;
                }
              } else {
                L29: {
                  var6 = gb.field_f - 140;
                  if (var6 <= 0) {
                    break L29;
                  } else {
                    L30: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L30;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L30;
                      }
                    }
                    cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                    break L29;
                  }
                }
                return;
              }
            } else {
              L31: {
                var6 = gb.field_f - 140;
                if (var6 <= 0) {
                  break L31;
                } else {
                  L32: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L32;
                    } else {
                      var7 = var6 * 256 / 20;
                      break L32;
                    }
                  }
                  cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
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

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static void a(byte param0) {
        vl.field_q = false;
        tc.field_a = null;
        int var1 = 46;
        oe.field_V = 0;
        bc.field_a = -1;
        nj.field_g = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Open in popup window";
        field_b = new gk();
    }
}
