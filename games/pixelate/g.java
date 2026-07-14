/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends mg {
    static kk field_r;
    static ak field_o;
    static byte[] field_s;
    private c field_n;
    static int field_m;
    static String field_q;
    private c field_p;

    final dj a(String param0, boolean param1) {
        String var3 = null;
        String var4 = null;
        var3 = ((g) this).field_n.field_q.toLowerCase();
        var4 = param0.toLowerCase();
        if (param1) {
          if (var4.length() != 0) {
            if (wg.a(var4, var3, (byte) -4)) {
              if (this.b(126, param0)) {
                return sk.field_a;
              } else {
                return qk.field_g;
              }
            } else {
              return sk.field_a;
            }
          } else {
            return sk.field_a;
          }
        } else {
          return null;
        }
    }

    final String a(int param0, String param1) {
        String var4 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var6 = ((g) this).field_n.field_q.toLowerCase();
        var4 = param1.toLowerCase();
        if (var4.length() != 0) {
          if (param0 < -76) {
            var8 = var4;
            if (!ep.a((byte) 34, var8)) {
              if (nm.a(var8, 64)) {
                return ka.field_R;
              } else {
                if (!cm.a(var8, 73)) {
                  if (!this.b(125, param1)) {
                    if (var6.length() > 0) {
                      if (!kb.a(var8, var6, (byte) 78)) {
                        if (pc.a(var8, (byte) -47, var6)) {
                          return pk.field_b;
                        } else {
                          if (gb.a(var8, var6, 95)) {
                            return tj.field_w;
                          } else {
                            return vi.field_y;
                          }
                        }
                      } else {
                        return tj.field_w;
                      }
                    } else {
                      return cd.field_a;
                    }
                  } else {
                    return ki.field_c;
                  }
                } else {
                  return ag.field_n;
                }
              }
            } else {
              return vi.field_y;
            }
          } else {
            field_m = 16;
            var7 = var4;
            if (!ep.a((byte) 34, var7)) {
              if (nm.a(var7, 64)) {
                return ka.field_R;
              } else {
                if (!cm.a(var7, 73)) {
                  if (!this.b(125, param1)) {
                    if (var6.length() > 0) {
                      if (!kb.a(var7, var6, (byte) 78)) {
                        if (pc.a(var7, (byte) -47, var6)) {
                          return pk.field_b;
                        } else {
                          if (gb.a(var7, var6, 95)) {
                            return tj.field_w;
                          } else {
                            return vi.field_y;
                          }
                        }
                      } else {
                        return tj.field_w;
                      }
                    } else {
                      return cd.field_a;
                    }
                  } else {
                    return ki.field_c;
                  }
                } else {
                  return ag.field_n;
                }
              }
            } else {
              return vi.field_y;
            }
          }
        } else {
          return null;
        }
    }

    final static ak b(boolean param0) {
        if (param0) {
            return null;
        }
        return ma.field_z.field_Fb;
    }

    private final boolean b(int param0, String param1) {
        int var5 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        if (param0 >= 124) {
          var12 = ((g) this).field_p.field_q.toLowerCase();
          var13 = param1.toLowerCase();
          if (var12.length() > 0) {
            if (-1 > (var13.length() ^ -1)) {
              var5 = var12.lastIndexOf("@");
              if ((var5 ^ -1) <= -1) {
                if (var5 < -1 + var12.length()) {
                  var14 = var12.substring(0, var5);
                  var15 = var12.substring(1 + var5);
                  if (-1 < (var13.indexOf(var14) ^ -1)) {
                    if ((var13.indexOf(var15) ^ -1) > -1) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          g.a(-44, -114);
          var8 = ((g) this).field_p.field_q.toLowerCase();
          var9 = param1.toLowerCase();
          if (var8.length() > 0) {
            if (-1 > (var9.length() ^ -1)) {
              var5 = var8.lastIndexOf("@");
              if ((var5 ^ -1) <= -1) {
                if (var5 < -1 + var8.length()) {
                  var10 = var8.substring(0, var5);
                  var11 = var8.substring(1 + var5);
                  if (-1 < (var9.indexOf(var10) ^ -1)) {
                    if ((var9.indexOf(var11) ^ -1) > -1) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          var2 = 0;
          var3 = ga.field_f;
          if (var3 < 5) {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          } else {
            if (-106 < (var3 ^ -1)) {
              var2 = (var3 * 16384 + -40960) / 220;
              if (param1 <= 29) {
                return;
              } else {
                L1: {
                  var4 = 1;
                  var5 = 0;
                  if ((param0 ^ -1) == -2) {
                    var5 = 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 != 3) {
                    break L2;
                  } else {
                    var4 = -1;
                    break L2;
                  }
                }
                L3: {
                  if (4 != param0) {
                    break L3;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L3;
                  }
                }
                L4: {
                  if (param0 == 5) {
                    var4 = -1;
                    var5 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0 != 6) {
                    break L5;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (param0 == 7) {
                      break L7;
                    } else {
                      if (param0 == 8) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var4 = -1;
                  var5 = -1;
                  break L6;
                }
                L8: {
                  if ((param0 ^ -1) == -12) {
                    var4 = -1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (12 != param0) {
                    break L9;
                  } else {
                    var4 = -1;
                    var5 = -1;
                    break L9;
                  }
                }
                L10: {
                  if (13 != param0) {
                    break L10;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L10;
                  }
                }
                L11: {
                  if (param0 != 14) {
                    break L11;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L11;
                  }
                }
                L12: {
                  if (param0 != 15) {
                    break L12;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L12;
                  }
                }
                oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
                return;
              }
            } else {
              if (120 <= var3) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = 8192 - 8192 * var3 * var3 / 3300;
                if (param1 > 29) {
                  L13: {
                    var4 = 1;
                    var5 = 0;
                    if ((param0 ^ -1) == -2) {
                      var5 = 1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (param0 != 3) {
                      break L14;
                    } else {
                      var4 = -1;
                      break L14;
                    }
                  }
                  L15: {
                    if (4 != param0) {
                      break L15;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L15;
                    }
                  }
                  L16: {
                    if (param0 == 5) {
                      var4 = -1;
                      var5 = 1;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (param0 != 6) {
                      break L17;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L17;
                    }
                  }
                  if (param0 != 7) {
                    if (param0 == 8) {
                      L18: {
                        var4 = -1;
                        var5 = -1;
                        if ((param0 ^ -1) == -12) {
                          var4 = -1;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (12 != param0) {
                          break L19;
                        } else {
                          var4 = -1;
                          var5 = -1;
                          break L19;
                        }
                      }
                      L20: {
                        if (13 != param0) {
                          break L20;
                        } else {
                          var4 = 1;
                          var5 = -1;
                          break L20;
                        }
                      }
                      L21: {
                        if (param0 != 14) {
                          break L21;
                        } else {
                          var5 = 1;
                          var4 = -1;
                          break L21;
                        }
                      }
                      L22: {
                        if (param0 != 15) {
                          break L22;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L22;
                        }
                      }
                      oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
                      return;
                    } else {
                      L23: {
                        if ((param0 ^ -1) == -12) {
                          var4 = -1;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (12 != param0) {
                          break L24;
                        } else {
                          var4 = -1;
                          var5 = -1;
                          break L24;
                        }
                      }
                      L25: {
                        if (13 != param0) {
                          break L25;
                        } else {
                          var4 = 1;
                          var5 = -1;
                          break L25;
                        }
                      }
                      L26: {
                        if (param0 != 14) {
                          break L26;
                        } else {
                          var5 = 1;
                          var4 = -1;
                          break L26;
                        }
                      }
                      L27: {
                        if (param0 != 15) {
                          break L27;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L27;
                        }
                      }
                      oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
                      return;
                    }
                  } else {
                    L28: {
                      var4 = -1;
                      var5 = -1;
                      if ((param0 ^ -1) == -12) {
                        var4 = -1;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (12 != param0) {
                        break L29;
                      } else {
                        var4 = -1;
                        var5 = -1;
                        break L29;
                      }
                    }
                    L30: {
                      if (13 != param0) {
                        break L30;
                      } else {
                        var4 = 1;
                        var5 = -1;
                        break L30;
                      }
                    }
                    L31: {
                      if (param0 != 14) {
                        break L31;
                      } else {
                        var5 = 1;
                        var4 = -1;
                        break L31;
                      }
                    }
                    L32: {
                      if (param0 != 15) {
                        break L32;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L32;
                      }
                    }
                    oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param1 <= 29) {
          return;
        } else {
          L33: {
            var4 = 1;
            var5 = 0;
            if ((param0 ^ -1) == -2) {
              var5 = 1;
              break L33;
            } else {
              break L33;
            }
          }
          L34: {
            if (param0 != 3) {
              break L34;
            } else {
              var4 = -1;
              break L34;
            }
          }
          L35: {
            if (4 != param0) {
              break L35;
            } else {
              var4 = 1;
              var5 = 1;
              break L35;
            }
          }
          L36: {
            if (param0 == 5) {
              var4 = -1;
              var5 = 1;
              break L36;
            } else {
              break L36;
            }
          }
          L37: {
            if (param0 != 6) {
              break L37;
            } else {
              var4 = 1;
              var5 = -1;
              break L37;
            }
          }
          L38: {
            L39: {
              if (param0 == 7) {
                break L39;
              } else {
                if (param0 == 8) {
                  break L39;
                } else {
                  break L38;
                }
              }
            }
            var4 = -1;
            var5 = -1;
            break L38;
          }
          L40: {
            if ((param0 ^ -1) == -12) {
              var4 = -1;
              break L40;
            } else {
              break L40;
            }
          }
          L41: {
            if (12 != param0) {
              break L41;
            } else {
              var4 = -1;
              var5 = -1;
              break L41;
            }
          }
          L42: {
            if (13 != param0) {
              break L42;
            } else {
              var4 = 1;
              var5 = -1;
              break L42;
            }
          }
          L43: {
            if (param0 != 14) {
              break L43;
            } else {
              var5 = 1;
              var4 = -1;
              break L43;
            }
          }
          L44: {
            if (param0 != 15) {
              break L44;
            } else {
              var4 = 1;
              var5 = 1;
              break L44;
            }
          }
          oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
          return;
        }
    }

    g(c param0, c param1, c param2) {
        super(param0);
        ((g) this).field_p = param2;
        ((g) this).field_n = param1;
    }

    final static ue a(int param0, byte param1, int param2, int param3, int param4) {
        ue var5 = null;
        ue var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var6 = 27 % ((param1 - 25) / 44);
        var5 = (ue) (Object) f.field_c.c(1504642273);
        L0: while (true) {
          if (var5 != null) {
            if (param4 != var5_ref.field_o) {
              var5 = (ue) (Object) f.field_c.f(1504642273);
              continue L0;
            } else {
              return var5_ref;
            }
          } else {
            var5_ref = new ue();
            var5_ref.field_s = param2;
            var5_ref.field_m = param3;
            var5_ref.field_o = param4;
            f.field_c.a(22125, (fa) (Object) var5_ref);
            uj.a(param0, var5_ref, 65536);
            return var5_ref;
          }
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        field_o = null;
        if (param0 != -30055) {
            g.a(-18, -13);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 2;
        field_q = "Loading graphics";
    }
}
