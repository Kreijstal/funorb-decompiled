/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw extends fw {
    static int[][] field_P;
    static String field_N;
    private n field_O;
    static String field_Q;
    private int field_L;
    static int[] field_M;
    static int field_R;

    final boolean a(int param0, kb param1) {
        if (param0 != 11) {
            return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, kb param3) {
        ((kw) this).field_L = ((kw) this).field_L + 1;
        this.a(param0 ^ 0, param1, param2, param3);
        if (param0 != 32722) {
            Object var6 = null;
            boolean discarded$0 = ((kw) this).a(107, (kb) null);
        }
    }

    final String h(int param0) {
        if (param0 == 21384) {
          if (!((kw) this).field_t) {
            return null;
          } else {
            return ((kw) this).field_O.a((byte) 55);
          }
        } else {
          kw.b(true);
          if (!((kw) this).field_t) {
            return null;
          } else {
            return ((kw) this).field_O.a((byte) 55);
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        gu var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wk var14 = null;
        wk var15 = null;
        wk var16 = null;
        wk var17 = null;
        wk var18 = null;
        wk var19 = null;
        wk var20 = null;
        wk var21 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(param0, param1, (byte) -120, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = ((kw) this).field_B + (param0 - -(((kw) this).field_l >> -1504947999));
          var6 = ((kw) this).field_p + param1 - -(((kw) this).field_w >> 1785144961);
          if (param2 <= -82) {
            L0: {
              var8 = ((kw) this).field_O.a(false);
              if (ad.field_K == var8) {
                break L0;
              } else {
                if (so.field_e == var8) {
                  break L0;
                } else {
                  if (var8 != rn.field_e) {
                    if (var8 == oo.field_g) {
                      var20 = db.field_a[1];
                      var20.f(-(var20.field_y >> 880011713) + var5, var6 + -(var20.field_v >> -1881675327), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var19 = db.field_a[2];
                    var19.f(-(var19.field_y >> 2103304481) + var5, -(var19.field_v >> -354912063) + var6, 256);
                    return;
                  }
                }
              }
            }
            var21 = db.field_a[0];
            var9 = var21.field_A << -459839391;
            var10 = var21.field_x << 1068565025;
            if (null != bd.field_p) {
              if (var9 <= bd.field_p.field_y) {
                if (var10 <= bd.field_p.field_v) {
                  vn.a(bd.field_p, 3);
                  qn.b();
                  var21.b(112, 144, var21.field_A << 2028169796, var21.field_x << -328565756, -((kw) this).field_L << 1885955178, 4096);
                  rf.b(-18862);
                  bd.field_p.f(-var21.field_A + var5, -var21.field_x + var6, 256);
                  return;
                } else {
                  bd.field_p = new wk(var9, var10);
                  vn.a(bd.field_p, 3);
                  var21.b(112, 144, var21.field_A << 2028169796, var21.field_x << -328565756, -((kw) this).field_L << 1885955178, 4096);
                  rf.b(-18862);
                  bd.field_p.f(-var21.field_A + var5, -var21.field_x + var6, 256);
                  return;
                }
              } else {
                bd.field_p = new wk(var9, var10);
                vn.a(bd.field_p, 3);
                var21.b(112, 144, var21.field_A << 2028169796, var21.field_x << -328565756, -((kw) this).field_L << 1885955178, 4096);
                rf.b(-18862);
                bd.field_p.f(-var21.field_A + var5, -var21.field_x + var6, 256);
                return;
              }
            } else {
              bd.field_p = new wk(var9, var10);
              vn.a(bd.field_p, 3);
              var21.b(112, 144, var21.field_A << 2028169796, var21.field_x << -328565756, -((kw) this).field_L << 1885955178, 4096);
              rf.b(-18862);
              bd.field_p.f(-var21.field_A + var5, -var21.field_x + var6, 256);
              return;
            }
          } else {
            ((kw) this).a(105, -107, (byte) -98, -86);
            var8 = ((kw) this).field_O.a(false);
            if (ad.field_K != var8) {
              if (so.field_e != var8) {
                if (var8 != rn.field_e) {
                  if (var8 == oo.field_g) {
                    var18 = db.field_a[1];
                    var18.f(-(var18.field_y >> 880011713) + var5, var6 + -(var18.field_v >> -1881675327), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var17 = db.field_a[2];
                  var17.f(-(var17.field_y >> 2103304481) + var5, -(var17.field_v >> -354912063) + var6, 256);
                  return;
                }
              } else {
                var16 = db.field_a[0];
                var14 = var16;
                var9 = var16.field_A << -459839391;
                var10 = var16.field_x << 1068565025;
                if (null != bd.field_p) {
                  if (var9 <= bd.field_p.field_y) {
                    if (var10 <= bd.field_p.field_v) {
                      vn.a(bd.field_p, 3);
                      qn.b();
                      var16.b(112, 144, var16.field_A << 2028169796, var16.field_x << -328565756, -((kw) this).field_L << 1885955178, 4096);
                      rf.b(-18862);
                      bd.field_p.f(-var16.field_A + var5, -var16.field_x + var6, 256);
                      return;
                    } else {
                      bd.field_p = new wk(var9, var10);
                      vn.a(bd.field_p, 3);
                      var16.b(112, 144, var16.field_A << 2028169796, var16.field_x << -328565756, -((kw) this).field_L << 1885955178, 4096);
                      rf.b(-18862);
                      bd.field_p.f(-var16.field_A + var5, -var16.field_x + var6, 256);
                      return;
                    }
                  } else {
                    bd.field_p = new wk(var9, var10);
                    vn.a(bd.field_p, 3);
                    var16.b(112, 144, var16.field_A << 2028169796, var16.field_x << -328565756, -((kw) this).field_L << 1885955178, 4096);
                    rf.b(-18862);
                    bd.field_p.f(-var16.field_A + var5, -var16.field_x + var6, 256);
                    return;
                  }
                } else {
                  bd.field_p = new wk(var9, var10);
                  vn.a(bd.field_p, 3);
                  var16.b(112, 144, var16.field_A << 2028169796, var16.field_x << -328565756, -((kw) this).field_L << 1885955178, 4096);
                  rf.b(-18862);
                  bd.field_p.f(-var16.field_A + var5, -var16.field_x + var6, 256);
                  return;
                }
              }
            } else {
              L1: {
                L2: {
                  var15 = db.field_a[0];
                  var9 = var15.field_A << -459839391;
                  var10 = var15.field_x << 1068565025;
                  if (null == bd.field_p) {
                    break L2;
                  } else {
                    if (var9 > bd.field_p.field_y) {
                      break L2;
                    } else {
                      if (var10 > bd.field_p.field_v) {
                        break L2;
                      } else {
                        vn.a(bd.field_p, 3);
                        qn.b();
                        break L1;
                      }
                    }
                  }
                }
                bd.field_p = new wk(var9, var10);
                vn.a(bd.field_p, 3);
                break L1;
              }
              var15.b(112, 144, var15.field_A << 2028169796, var15.field_x << -328565756, -((kw) this).field_L << 1885955178, 4096);
              rf.b(-18862);
              bd.field_p.f(-var15.field_A + var5, -var15.field_x + var6, 256);
              return;
            }
          }
        }
    }

    kw(n param0) {
        ((kw) this).field_O = param0;
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -112 % ((param1 - -33) / 51);
        if (param0 > 0) {
          if (param0 >= 128) {
            if (160 <= param0) {
              if (param0 <= 255) {
                var2 = (byte)param0;
                return (byte) var2;
              } else {
                L0: {
                  if (8364 != param0) {
                    if (param0 != 8218) {
                      if (param0 != 402) {
                        if (8222 != param0) {
                          if (param0 != 8230) {
                            if (param0 != 8224) {
                              if (param0 != 8225) {
                                if (param0 != 710) {
                                  if (param0 != 8240) {
                                    if (param0 != 352) {
                                      if (param0 != 8249) {
                                        if (338 == param0) {
                                          var2 = -116;
                                          return (byte) var2;
                                        } else {
                                          if (param0 == 381) {
                                            var2 = -114;
                                            return (byte) var2;
                                          } else {
                                            if (param0 == 8216) {
                                              var2 = -111;
                                              return (byte) var2;
                                            } else {
                                              if (8217 != param0) {
                                                if (param0 == 8220) {
                                                  var2 = -109;
                                                  return (byte) var2;
                                                } else {
                                                  if (8221 == param0) {
                                                    var2 = -108;
                                                    return (byte) var2;
                                                  } else {
                                                    if (param0 != 8226) {
                                                      if (param0 != 8211) {
                                                        if (param0 != 8212) {
                                                          if (param0 != 732) {
                                                            if (param0 == 8482) {
                                                              var2 = -103;
                                                              return (byte) var2;
                                                            } else {
                                                              if (353 != param0) {
                                                                if (param0 == 8250) {
                                                                  var2 = -101;
                                                                  return (byte) var2;
                                                                } else {
                                                                  if (339 != param0) {
                                                                    if (param0 == 382) {
                                                                      var2 = -98;
                                                                      break L0;
                                                                    } else {
                                                                      if (376 == param0) {
                                                                        var2 = -97;
                                                                        break L0;
                                                                      } else {
                                                                        var2 = 63;
                                                                        break L0;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var2 = -100;
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -102;
                                                                break L0;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            break L0;
                                                          }
                                                        } else {
                                                          var2 = -105;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var2 = -106;
                                                        break L0;
                                                      }
                                                    } else {
                                                      var2 = -107;
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2 = -110;
                                                break L0;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var2 = -117;
                                        break L0;
                                      }
                                    } else {
                                      var2 = -118;
                                      break L0;
                                    }
                                  } else {
                                    var2 = -119;
                                    break L0;
                                  }
                                } else {
                                  var2 = -120;
                                  return (byte) var2;
                                }
                              } else {
                                var2 = -121;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -122;
                              break L0;
                            }
                          } else {
                            var2 = -123;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -124;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -125;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -126;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -128;
                    break L0;
                  }
                }
                return (byte) var2;
              }
            } else {
              L1: {
                if (8364 != param0) {
                  if (param0 != 8218) {
                    if (param0 != 402) {
                      if (8222 != param0) {
                        if (param0 != 8230) {
                          if (param0 != 8224) {
                            if (param0 != 8225) {
                              if (param0 != 710) {
                                if (param0 != 8240) {
                                  if (param0 != 352) {
                                    if (param0 != 8249) {
                                      if (338 != param0) {
                                        if (param0 != 381) {
                                          if (param0 != 8216) {
                                            if (8217 != param0) {
                                              if (param0 != 8220) {
                                                if (8221 != param0) {
                                                  if (param0 != 8226) {
                                                    if (param0 != 8211) {
                                                      if (param0 != 8212) {
                                                        if (param0 != 732) {
                                                          if (param0 != 8482) {
                                                            if (353 != param0) {
                                                              if (param0 == 8250) {
                                                                var2 = -101;
                                                                return (byte) var2;
                                                              } else {
                                                                if (339 != param0) {
                                                                  if (param0 == 382) {
                                                                    var2 = -98;
                                                                    break L1;
                                                                  } else {
                                                                    if (376 == param0) {
                                                                      var2 = -97;
                                                                      break L1;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var2 = -100;
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L1;
                                                            }
                                                          } else {
                                                            var2 = -103;
                                                            return (byte) var2;
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L1;
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L1;
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  return (byte) var2;
                                                }
                                              } else {
                                                var2 = -109;
                                                return (byte) var2;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L1;
                                            }
                                          } else {
                                            var2 = -111;
                                            return (byte) var2;
                                          }
                                        } else {
                                          var2 = -114;
                                          return (byte) var2;
                                        }
                                      } else {
                                        var2 = -116;
                                        return (byte) var2;
                                      }
                                    } else {
                                      var2 = -117;
                                      break L1;
                                    }
                                  } else {
                                    var2 = -118;
                                    break L1;
                                  }
                                } else {
                                  var2 = -119;
                                  break L1;
                                }
                              } else {
                                var2 = -120;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -121;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -122;
                            break L1;
                          }
                        } else {
                          var2 = -123;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -124;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    return (byte) var2;
                  }
                } else {
                  var2 = -128;
                  break L1;
                }
              }
              return (byte) var2;
            }
          } else {
            var2 = (byte)param0;
            return (byte) var2;
          }
        } else {
          L2: {
            L3: {
              if (160 > param0) {
                break L3;
              } else {
                if (param0 > 255) {
                  break L3;
                } else {
                  var2 = (byte)param0;
                  break L2;
                }
              }
            }
            if (8364 != param0) {
              if (param0 != 8218) {
                if (param0 != 402) {
                  if (8222 != param0) {
                    if (param0 != 8230) {
                      if (param0 != 8224) {
                        if (param0 != 8225) {
                          if (param0 != 710) {
                            if (param0 != 8240) {
                              if (param0 != 352) {
                                if (param0 != 8249) {
                                  if (338 == param0) {
                                    var2 = -116;
                                    return (byte) var2;
                                  } else {
                                    if (param0 == 381) {
                                      var2 = -114;
                                      break L2;
                                    } else {
                                      if (param0 == 8216) {
                                        var2 = -111;
                                        break L2;
                                      } else {
                                        if (8217 != param0) {
                                          if (param0 == 8220) {
                                            var2 = -109;
                                            break L2;
                                          } else {
                                            if (8221 == param0) {
                                              var2 = -108;
                                              break L2;
                                            } else {
                                              if (param0 != 8226) {
                                                if (param0 != 8211) {
                                                  if (param0 != 8212) {
                                                    if (param0 != 732) {
                                                      if (param0 == 8482) {
                                                        var2 = -103;
                                                        break L2;
                                                      } else {
                                                        if (353 != param0) {
                                                          if (param0 == 8250) {
                                                            var2 = -101;
                                                            break L2;
                                                          } else {
                                                            if (339 != param0) {
                                                              if (param0 == 382) {
                                                                var2 = -98;
                                                                break L2;
                                                              } else {
                                                                if (376 == param0) {
                                                                  var2 = -97;
                                                                  break L2;
                                                                } else {
                                                                  var2 = 63;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L2;
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L2;
                                                }
                                              } else {
                                                var2 = -107;
                                                break L2;
                                              }
                                            }
                                          }
                                        } else {
                                          var2 = -110;
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                  break L2;
                                }
                              } else {
                                var2 = -118;
                                break L2;
                              }
                            } else {
                              var2 = -119;
                              break L2;
                            }
                          } else {
                            var2 = -120;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -121;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -122;
                        break L2;
                      }
                    } else {
                      var2 = -123;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -124;
                    return (byte) var2;
                  }
                } else {
                  var2 = -125;
                  return (byte) var2;
                }
              } else {
                var2 = -126;
                return (byte) var2;
              }
            } else {
              var2 = -128;
              break L2;
            }
          }
          return (byte) var2;
        }
    }

    public static void b(boolean param0) {
        field_N = null;
        field_M = null;
        field_P = null;
        if (!param0) {
          byte discarded$2 = kw.a('￣', -69);
          field_Q = null;
          return;
        } else {
          field_Q = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new int[][]{new int[5], new int[3], new int[1]};
        field_M = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_Q = "Concluded";
        field_N = "InstructionS";
    }
}
