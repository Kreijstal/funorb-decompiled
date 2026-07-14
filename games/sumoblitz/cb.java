/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static ri field_e;
    private ms field_f;
    static boolean field_b;
    static wc[] field_a;
    private jn field_d;
    static int field_c;

    final ms b(byte param0) {
        ms var2 = null;
        var2 = ((cb) this).field_d.field_e.field_b;
        if (((cb) this).field_d.field_e != var2) {
          ((cb) this).field_f = var2.field_b;
          if (param0 != -80) {
            ms discarded$2 = ((cb) this).b((byte) -128);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((cb) this).field_f = null;
          return null;
        }
    }

    final ms a(byte param0) {
        ms var2 = null;
        var2 = ((cb) this).field_d.field_e.field_g;
        if (((cb) this).field_d.field_e != var2) {
          ((cb) this).field_f = var2.field_g;
          if (param0 >= -13) {
            ms discarded$2 = ((cb) this).a((byte) -67);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((cb) this).field_f = null;
          return null;
        }
    }

    final ms c(byte param0) {
        ms var2 = null;
        var2 = ((cb) this).field_f;
        if (((cb) this).field_d.field_e != var2) {
          ((cb) this).field_f = var2.field_g;
          if (param0 != 87) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((cb) this).field_f = null;
          return null;
        }
    }

    final ms b(int param0) {
        ms var2 = null;
        if (param0 == 0) {
          var2 = ((cb) this).field_f;
          if (((cb) this).field_d.field_e == var2) {
            ((cb) this).field_f = null;
            return null;
          } else {
            ((cb) this).field_f = var2.field_b;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = td.field_u;
        if ((var3 ^ -1) <= -6) {
          L0: {
            if (-106 < (var3 ^ -1)) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if ((var3 ^ -1) <= -121) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = -(var3 * var3 * 8192 / 3300) + 8192;
                if (param0 != 79) {
                  return;
                } else {
                  L1: {
                    var4 = 1;
                    var5 = 0;
                    if ((param1 ^ -1) == -4) {
                      var4 = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (param1 != 1) {
                      break L2;
                    } else {
                      var5 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (param1 == 4) {
                      var5 = 1;
                      var4 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (5 == param1) {
                      var4 = -1;
                      var5 = 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (-7 == (param1 ^ -1)) {
                      var4 = 1;
                      var5 = -1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (param1 == -8) {
                        break L7;
                      } else {
                        if (8 == param1) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var5 = -1;
                    var4 = -1;
                    break L6;
                  }
                  L8: {
                    if (-12 == param1) {
                      var4 = -1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param1 == -13) {
                      var4 = -1;
                      var5 = -1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-14 == param1) {
                      var4 = 1;
                      var5 = -1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (-15 == (param1 ^ -1)) {
                      var5 = 1;
                      var4 = -1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((param1 ^ -1) != -16) {
                      break L12;
                    } else {
                      var5 = 1;
                      var4 = 1;
                      break L12;
                    }
                  }
                  uc.field_b = pm.a(83, var2 * var5, var4 * var2);
                  return;
                }
              }
            }
          }
          if (param0 != 79) {
            return;
          } else {
            L13: {
              var4 = 1;
              var5 = 0;
              if ((param1 ^ -1) == -4) {
                var4 = -1;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (param1 != 1) {
                break L14;
              } else {
                var5 = 1;
                break L14;
              }
            }
            L15: {
              if (param1 == 4) {
                var5 = 1;
                var4 = 1;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (5 == param1) {
                var4 = -1;
                var5 = 1;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (-7 == (param1 ^ -1)) {
                var4 = 1;
                var5 = -1;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              L19: {
                if (param1 == -8) {
                  break L19;
                } else {
                  if (8 == param1) {
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
              var5 = -1;
              var4 = -1;
              break L18;
            }
            L20: {
              if (-12 == param1) {
                var4 = -1;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (param1 == -13) {
                var4 = -1;
                var5 = -1;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (-14 == param1) {
                var4 = 1;
                var5 = -1;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (-15 == (param1 ^ -1)) {
                var5 = 1;
                var4 = -1;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if ((param1 ^ -1) != -16) {
                break L24;
              } else {
                var5 = 1;
                var4 = 1;
                break L24;
              }
            }
            uc.field_b = pm.a(83, var2 * var5, var4 * var2);
            return;
          }
        } else {
          var2 = var3 * var3 * 8192 / 1100;
          if (param0 == 79) {
            L25: {
              var4 = 1;
              var5 = 0;
              if ((param1 ^ -1) == -4) {
                var4 = -1;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (param1 != 1) {
                break L26;
              } else {
                var5 = 1;
                break L26;
              }
            }
            L27: {
              if (param1 == 4) {
                var5 = 1;
                var4 = 1;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (5 == param1) {
                var4 = -1;
                var5 = 1;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (-7 == (param1 ^ -1)) {
                var4 = 1;
                var5 = -1;
                break L29;
              } else {
                break L29;
              }
            }
            if (param1 != -8) {
              if (8 == param1) {
                L30: {
                  var5 = -1;
                  var4 = -1;
                  if (-12 == (param1 ^ -1)) {
                    var4 = -1;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (param1 == -13) {
                    var4 = -1;
                    var5 = -1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (-14 == param1) {
                    var4 = 1;
                    var5 = -1;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (-15 == (param1 ^ -1)) {
                    var5 = 1;
                    var4 = -1;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if ((param1 ^ -1) != -16) {
                    break L34;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L34;
                  }
                }
                uc.field_b = pm.a(83, var2 * var5, var4 * var2);
                return;
              } else {
                L35: {
                  if (-12 == (param1 ^ -1)) {
                    var4 = -1;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (param1 == -13) {
                    var4 = -1;
                    var5 = -1;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (-14 == param1) {
                    var4 = 1;
                    var5 = -1;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (-15 == (param1 ^ -1)) {
                    var5 = 1;
                    var4 = -1;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if ((param1 ^ -1) != -16) {
                    break L39;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L39;
                  }
                }
                uc.field_b = pm.a(83, var2 * var5, var4 * var2);
                return;
              }
            } else {
              L40: {
                var5 = -1;
                var4 = -1;
                if (-12 == param1) {
                  var4 = -1;
                  break L40;
                } else {
                  break L40;
                }
              }
              L41: {
                if (param1 == -13) {
                  var4 = -1;
                  var5 = -1;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (-14 == param1) {
                  var4 = 1;
                  var5 = -1;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                if (-15 == (param1 ^ -1)) {
                  var5 = 1;
                  var4 = -1;
                  break L43;
                } else {
                  break L43;
                }
              }
              L44: {
                if ((param1 ^ -1) != -16) {
                  break L44;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L44;
                }
              }
              uc.field_b = pm.a(83, var2 * var5, var4 * var2);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(cd[] param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        cd var8 = null;
        cd var9 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0.length;
        if (!param1) {
          var7 = null;
          cb.a((cd[]) null, true);
          var3 = 1;
          L0: while (true) {
            if (var2 <= var3) {
              return;
            } else {
              var8 = param0[var3];
              var5 = var3 + -1;
              L1: while (true) {
                L2: {
                  if (-1 < (var5 ^ -1)) {
                    break L2;
                  } else {
                    if (!da.a(param0[var5], -114, var8)) {
                      break L2;
                    } else {
                      param0[var5 - -1] = param0[var5];
                      var5--;
                      continue L1;
                    }
                  }
                }
                param0[1 + var5] = var8;
                var3++;
                continue L0;
              }
            }
          }
        } else {
          var3 = 1;
          L3: while (true) {
            if (var2 <= var3) {
              return;
            } else {
              var9 = param0[var3];
              var5 = var3 + -1;
              L4: while (true) {
                L5: {
                  if (-1 < (var5 ^ -1)) {
                    break L5;
                  } else {
                    if (!da.a(param0[var5], -114, var9)) {
                      break L5;
                    } else {
                      param0[var5 - -1] = param0[var5];
                      var5--;
                      continue L4;
                    }
                  }
                }
                param0[1 + var5] = var9;
                var3++;
                continue L3;
              }
            }
          }
        }
    }

    final ms a(int param0, ms param1) {
        ms var3 = null;
        int var4 = 2 / ((57 - param0) / 41);
        if (param1 == null) {
            var3 = ((cb) this).field_d.field_e.field_b;
        } else {
            var3 = param1;
        }
        if (!(var3 != ((cb) this).field_d.field_e)) {
            ((cb) this).field_f = null;
            return null;
        }
        ((cb) this).field_f = var3.field_b;
        return var3;
    }

    final ms a(byte param0, ms param1) {
        ms var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((cb) this).field_d.field_e.field_g;
        }
        if (param0 != -70) {
            return null;
        }
        if (!(var3 != ((cb) this).field_d.field_e)) {
            ((cb) this).field_f = null;
            return null;
        }
        ((cb) this).field_f = var3.field_g;
        return var3;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = in.field_z;
        te.field_c = te.field_c + param0;
        if (param1 == -1372239541) {
          in.field_z = in.field_z + param0;
          if (-6 >= gj.a((byte) -84, 10)) {
            if (gj.a((byte) -84, 10) >= 5) {
              ha.field_f = ha.field_f - param0;
              if (-50001 > var2) {
                if ((in.field_z ^ -1) <= -50001) {
                  if (!gt.field_bb) {
                    th.b(24753, 241, 14);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              fb.field_a = fb.field_a - param0;
              if (-50001 < (var2 ^ -1)) {
                if (in.field_z <= -50001) {
                  if (gt.field_bb) {
                    return;
                  } else {
                    th.b(24753, 241, 14);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (5 > gj.a((byte) -84, 10)) {
              ts.field_a = ts.field_a + param0;
              if (-50001 > var2) {
                if ((in.field_z ^ -1) <= -50001) {
                  if (gt.field_bb) {
                    return;
                  } else {
                    th.b(24753, 241, 14);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              kn.field_b = kn.field_b + param0;
              if (-50001 > var2) {
                if (in.field_z > -50001) {
                  return;
                } else {
                  L0: {
                    if (!gt.field_bb) {
                      th.b(24753, 241, 14);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static int b(int param0, int param1) {
        L0: {
          if (param0 == -22415) {
            break L0;
          } else {
            cb.a((byte) 82, -115);
            break L0;
          }
        }
        if (65536L <= (long)param1) {
          if (16777216L > (long)param1) {
            if (-1048577L >= ((long)param1 ^ -1L)) {
              if ((long)param1 < 4194304L) {
                return hu.field_f[param1 >> -746475698] >> -535806395;
              } else {
                return hu.field_f[param1 >> 1444537168] >> 1080564932;
              }
            } else {
              if (262144L > (long)param1) {
                return hu.field_f[param1 >> -2121967222] >> -614625401;
              } else {
                return hu.field_f[param1 >> 1963359212] >> -528172346;
              }
            }
          } else {
            if ((long)param1 >= 268435456L) {
              if (1073741824L > (long)param1) {
                return hu.field_f[param1 >> 1338504022] >> 1691900129;
              } else {
                return hu.field_f[param1 >> -891168296];
              }
            } else {
              if ((long)param1 < 67108864L) {
                return hu.field_f[param1 >> -853248078] >> -425801949;
              } else {
                return hu.field_f[param1 >> -1384583532] >> -1719810270;
              }
            }
          }
        } else {
          if ((long)param1 >= 256L) {
            if (((long)param1 ^ -1L) <= -4097L) {
              if (-16385L >= ((long)param1 ^ -1L)) {
                return hu.field_f[param1 >> 961492648] >> -1940505240;
              } else {
                return hu.field_f[param1 >> 1120969414] >> 300181609;
              }
            } else {
              if (((long)param1 ^ -1L) <= -1025L) {
                return hu.field_f[param1 >> -1246279388] >> 2141391498;
              } else {
                return hu.field_f[param1 >> 1343968610] >> -1372239541;
              }
            }
          } else {
            if (0 <= param1) {
              return hu.field_f[param1] >> -1983039732;
            } else {
              return -1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != -1384583532) {
            int discarded$0 = cb.b(67, -59);
            field_a = null;
            return;
        }
        field_a = null;
    }

    cb(jn param0) {
        ((cb) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
    }
}
