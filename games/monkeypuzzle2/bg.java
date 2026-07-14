/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends ua implements u, ql, sh {
    private em field_O;
    private t field_z;
    private t field_K;
    private jj field_C;
    static String[] field_B;
    static int[] field_L;
    private qc field_N;
    private qc field_J;
    private qc field_F;
    private qc field_I;
    cm field_G;
    private qc field_D;
    static int field_E;
    private qc field_H;

    private final int a(byte param0, int param1, we param2, String param3, int param4, String param5) {
        if (param0 <= 96) {
            return 54;
        }
        return this.a(35, param4, param3, param1, param2, 3, param5);
    }

    public final void a(int param0, int param1, jj param2, int param3) {
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == -21099) {
          if (-1 != param0) {
            if (-2 != param0) {
              if (2 != param0) {
                return;
              } else {
                wc.a("conduct.ws", false);
                return;
              }
            } else {
              wc.a("privacy.ws", false);
              return;
            }
          } else {
            wc.a("terms.ws", false);
            return;
          }
        } else {
          return;
        }
    }

    private final boolean a(int param0, ag param1) {
        int var3 = 0;
        kf var4 = null;
        na var5 = null;
        var3 = -94 / ((param0 - 51) / 56);
        var4 = param1.a(-118);
        if (var4 == null) {
          return true;
        } else {
          var5 = var4.b(false);
          if (var5 != ol.field_h) {
            if (var5 == ke.field_d) {
              return false;
            } else {
              if (var5 == uc.field_e) {
                return false;
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    private final int a(int param0, String param1, we param2, int param3, int param4) {
        mh var6 = null;
        if (param0 > -96) {
          return 55;
        } else {
          var6 = new mh(20, param4, 120 - -param3, 25, param2, false, 120, 3, t.field_z, 16777215, param1);
          ((bg) this).b((byte) -78, (we) (Object) var6);
          return var6.field_p;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        var3 = uj.field_i;
        if (5 <= var3) {
          if (-106 >= (var3 ^ -1)) {
            if (-121 < var3) {
              var3 = -var3 + 120;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
              if (param1 < 77) {
                return;
              } else {
                L0: {
                  var4 = 1;
                  var5 = 0;
                  if (-2 != param0) {
                    break L0;
                  } else {
                    var5 = 1;
                    break L0;
                  }
                }
                L1: {
                  if (-4 == param0) {
                    var4 = -1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (-5 == (param0 ^ -1)) {
                    var5 = 1;
                    var4 = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0 == 5) {
                    var5 = 1;
                    var4 = -1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((param0 ^ -1) == -7) {
                    var5 = -1;
                    var4 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if (7 == param0) {
                      break L6;
                    } else {
                      if (8 == param0) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var5 = -1;
                  var4 = -1;
                  break L5;
                }
                L7: {
                  if (11 == param0) {
                    var4 = -1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if ((param0 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((param0 ^ -1) != -14) {
                    break L9;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L9;
                  }
                }
                L10: {
                  if (param0 != 14) {
                    break L10;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L10;
                  }
                }
                L11: {
                  if ((param0 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              }
            } else {
              if (param1 < 77) {
                return;
              } else {
                L12: {
                  var4 = 1;
                  var5 = 0;
                  if (-2 != param0) {
                    break L12;
                  } else {
                    var5 = 1;
                    break L12;
                  }
                }
                L13: {
                  if (-4 == param0) {
                    var4 = -1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (-5 == param0) {
                    var5 = 1;
                    var4 = 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param0 == 5) {
                    var5 = 1;
                    var4 = -1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if ((param0 ^ -1) == -7) {
                    var5 = -1;
                    var4 = 1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    if (7 == param0) {
                      break L18;
                    } else {
                      if (8 == param0) {
                        break L18;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var5 = -1;
                  var4 = -1;
                  break L17;
                }
                L19: {
                  if (11 == param0) {
                    var4 = -1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if ((param0 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if ((param0 ^ -1) != -14) {
                    break L21;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L21;
                  }
                }
                L22: {
                  if (param0 != 14) {
                    break L22;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L22;
                  }
                }
                L23: {
                  if ((param0 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              }
            }
          } else {
            var2 = (-40960 + 16384 * var3) / 220;
            if (param1 >= 77) {
              L24: {
                var4 = 1;
                var5 = 0;
                if (-2 != param0) {
                  break L24;
                } else {
                  var5 = 1;
                  break L24;
                }
              }
              L25: {
                if (-4 == param0) {
                  var4 = -1;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (-5 == (param0 ^ -1)) {
                  var5 = 1;
                  var4 = 1;
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                if (param0 == 5) {
                  var5 = 1;
                  var4 = -1;
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                if ((param0 ^ -1) == -7) {
                  var5 = -1;
                  var4 = 1;
                  break L28;
                } else {
                  break L28;
                }
              }
              if (7 != param0) {
                if (8 == param0) {
                  L29: {
                    var5 = -1;
                    var4 = -1;
                    if (11 == param0) {
                      var4 = -1;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if ((param0 ^ -1) == -13) {
                      var5 = -1;
                      var4 = -1;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if ((param0 ^ -1) != -14) {
                      break L31;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L31;
                    }
                  }
                  L32: {
                    if (param0 != 14) {
                      break L32;
                    } else {
                      var5 = 1;
                      var4 = -1;
                      break L32;
                    }
                  }
                  L33: {
                    if ((param0 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                  return;
                } else {
                  L34: {
                    if (11 == param0) {
                      var4 = -1;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    if ((param0 ^ -1) == -13) {
                      var5 = -1;
                      var4 = -1;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if ((param0 ^ -1) != -14) {
                      break L36;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L36;
                    }
                  }
                  L37: {
                    if (param0 != 14) {
                      break L37;
                    } else {
                      var5 = 1;
                      var4 = -1;
                      break L37;
                    }
                  }
                  L38: {
                    if ((param0 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                  return;
                }
              } else {
                L39: {
                  var5 = -1;
                  var4 = -1;
                  if (11 == param0) {
                    var4 = -1;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                L40: {
                  if ((param0 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if ((param0 ^ -1) != -14) {
                    break L41;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L41;
                  }
                }
                L42: {
                  if (param0 != 14) {
                    break L42;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L42;
                  }
                }
                L43: {
                  if ((param0 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L43;
                  } else {
                    break L43;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var2 = var3 * (var3 * 8192) / 1100;
          if (param1 >= 77) {
            L44: {
              var4 = 1;
              var5 = 0;
              if (-2 != param0) {
                break L44;
              } else {
                var5 = 1;
                break L44;
              }
            }
            L45: {
              if (-4 == param0) {
                var4 = -1;
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              if (-5 == (param0 ^ -1)) {
                var5 = 1;
                var4 = 1;
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              if (param0 == 5) {
                var5 = 1;
                var4 = -1;
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              if ((param0 ^ -1) == -7) {
                var5 = -1;
                var4 = 1;
                break L48;
              } else {
                break L48;
              }
            }
            if (7 != param0) {
              if (8 == param0) {
                L49: {
                  var5 = -1;
                  var4 = -1;
                  if (11 == param0) {
                    var4 = -1;
                    break L49;
                  } else {
                    break L49;
                  }
                }
                L50: {
                  if ((param0 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L50;
                  } else {
                    break L50;
                  }
                }
                L51: {
                  if ((param0 ^ -1) != -14) {
                    break L51;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L51;
                  }
                }
                L52: {
                  if (param0 != 14) {
                    break L52;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L52;
                  }
                }
                L53: {
                  if ((param0 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L53;
                  } else {
                    break L53;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              } else {
                L54: {
                  if (11 == param0) {
                    var4 = -1;
                    break L54;
                  } else {
                    break L54;
                  }
                }
                L55: {
                  if ((param0 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L55;
                  } else {
                    break L55;
                  }
                }
                L56: {
                  if ((param0 ^ -1) != -14) {
                    break L56;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L56;
                  }
                }
                L57: {
                  if (param0 != 14) {
                    break L57;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L57;
                  }
                }
                L58: {
                  if ((param0 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L58;
                  } else {
                    break L58;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              }
            } else {
              L59: {
                var5 = -1;
                var4 = -1;
                if (11 == param0) {
                  var4 = -1;
                  break L59;
                } else {
                  break L59;
                }
              }
              L60: {
                if ((param0 ^ -1) == -13) {
                  var5 = -1;
                  var4 = -1;
                  break L60;
                } else {
                  break L60;
                }
              }
              L61: {
                if ((param0 ^ -1) != -14) {
                  break L61;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L61;
                }
              }
              L62: {
                if (param0 != 14) {
                  break L62;
                } else {
                  var5 = 1;
                  var4 = -1;
                  break L62;
                }
              }
              L63: {
                if ((param0 ^ -1) == -16) {
                  var4 = 1;
                  var5 = 1;
                  break L63;
                } else {
                  break L63;
                }
              }
              ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 4826) {
          var2 = 0;
          L0: while (true) {
            if (param1.length() > var2) {
              var3 = param1.charAt(var2);
              if (uc.a((char) var3, false)) {
                var2++;
                var2++;
                continue L0;
              } else {
                if (!re.a(param0 ^ -4843, (char) var3)) {
                  return true;
                } else {
                  var2++;
                  continue L0;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    private final int a(int param0, int param1, String param2, int param3, we param4, int param5, String param6) {
        mh var10 = new mh(20, param1, 120 - -param3, 25, param4, false, 120, param5, t.field_z, 16777215, param2);
        ((bg) this).b((byte) -88, (we) (Object) var10);
        vg var9 = new vg(((ag) (Object) param4).a(-121), param6, 126, var10.field_p + param1, param3 + 50, param0);
        var9.field_o = (of) this;
        ((bg) this).b((byte) -84, (we) (Object) var9);
        return var10.field_p - -var9.field_p;
    }

    public final void a(int param0) {
        if (param0 != 200) {
          int discarded$2 = this.a(-96, -126, (String) null, 71, (we) null, 63, (String) null);
          ((hh) (Object) ((bg) this).field_N.a(-114)).f((byte) -82);
          return;
        } else {
          ((hh) (Object) ((bg) this).field_N.a(-114)).f((byte) -82);
          return;
        }
    }

    public final void a(String param0, int param1) {
        qc var3 = null;
        String var4 = null;
        var3 = ((bg) this).field_N;
        var4 = param0;
        if (param1 >= -50) {
          ((bg) this).a((String) null, -32);
          ((rj) (Object) var3).a(false, -5905, var4);
          return;
        } else {
          ((rj) (Object) var3).a(false, -5905, var4);
          return;
        }
    }

    public bg() {
        super(0, 0, 496, 0, (ml) null);
        ((bg) this).field_N = new qc("", (of) null, 12);
        ((bg) this).field_D = new qc("", (of) null, 100);
        ((bg) this).field_I = new qc("", (of) null, 100);
        ((bg) this).field_H = new qc("", (of) null, 20);
        ((bg) this).field_J = new qc("", (of) null, 20);
        ((bg) this).field_F = new qc("", (of) null, 3);
        int var1 = 1;
        ((bg) this).field_O = new em("", (of) null, var1 != 0);
        ((bg) this).field_z = new t(pl.field_b, (of) null);
        ((bg) this).field_K = new t(aj.field_d, (of) null);
        ((bg) this).field_N.field_m = oa.field_E;
        ((bg) this).field_D.field_m = ad.field_f;
        ((bg) this).field_I.field_m = rf.field_b;
        ((bg) this).field_H.field_m = kd.field_d;
        ((bg) this).field_J.field_m = id.field_h;
        ((bg) this).field_F.field_m = ri.field_d;
        ((bg) this).field_O.field_m = a.field_j;
        ((bg) this).field_N.a((kf) (Object) new hh((rj) (Object) ((bg) this).field_N), true);
        ((bg) this).field_D.a((kf) (Object) new uk((rj) (Object) ((bg) this).field_D), true);
        ((bg) this).field_I.a((kf) (Object) new fd((rj) (Object) ((bg) this).field_I, (rj) (Object) ((bg) this).field_D), true);
        ((bg) this).field_H.a((kf) (Object) new df((rj) (Object) ((bg) this).field_H, (rj) (Object) ((bg) this).field_N, (rj) (Object) ((bg) this).field_D), true);
        ((bg) this).field_J.a((kf) (Object) new rd((rj) (Object) ((bg) this).field_J, (rj) (Object) ((bg) this).field_H), true);
        ((bg) this).field_F.a((kf) (Object) new th((rj) (Object) ((bg) this).field_F), true);
        ((bg) this).field_z.field_w = false;
        ((bg) this).field_z.field_h = (ml) (Object) new hd();
        ((bg) this).field_K.field_h = (ml) (Object) new lc();
        ((bg) this).field_N.field_h = (ml) (Object) new mg(10000536);
        ((bg) this).field_I.field_h = (ml) (Object) new mg(10000536);
        ((bg) this).field_D.field_h = (ml) (Object) new mg(10000536);
        ((bg) this).field_F.field_h = (ml) (Object) new mg(10000536);
        ((bg) this).field_O.field_h = (ml) (Object) new wi();
        ((bg) this).field_J.field_h = (ml) (Object) new ve(10000536);
        ((bg) this).field_H.field_h = (ml) (Object) new ve(10000536);
        String var2 = gg.a(new String[2], uk.field_p, true);
        int var3 = 20;
        var3 = var3 + this.a(-107, be.field_e, (we) (Object) ((bg) this).field_D, 170, var3);
        var3 = var3 + (5 + this.a(20, var3, ef.field_a, 170, (we) (Object) ((bg) this).field_I, 3, ""));
        var3 = var3 + this.a(-112, ec.field_c, (we) (Object) ((bg) this).field_H, 170, var3);
        var3 = var3 + (5 + this.a((byte) 98, 170, (we) (Object) ((bg) this).field_J, ce.field_a, var3, jj.field_B));
        var3 = var3 + (5 + this.a((byte) 122, 170, (we) (Object) ((bg) this).field_N, ke.field_e, var3, wj.field_l));
        var3 = var3 + this.a(var3, 93, 170, mg.field_v, (we) (Object) ((bg) this).field_F);
        mh var4 = new mh(46, var3, -90 + ((bg) this).field_l, 25, (we) (Object) ((bg) this).field_O, true, -120 + ((bg) this).field_l, 5, pf.field_c, 11579568, je.field_f);
        ((bg) this).b((byte) -52, (we) (Object) var4);
        var3 = var3 + var4.field_p;
        a var5 = new a(t.field_z, 0, 0, 0, 0, 16777215, -1, 0, 0, t.field_z.field_C, -1, 2147483647, true);
        ((bg) this).field_C = new jj(var2, (ml) (Object) var5);
        ((bg) this).field_C.field_m = "";
        ((bg) this).field_C.a(false, 0, kg.field_a);
        ((bg) this).field_C.a(false, 1, kg.field_a);
        ((bg) this).field_C.field_o = (of) this;
        ((bg) this).field_C.c(46, var3, -90 + ((bg) this).field_l, -1);
        var3 = var3 + (15 + ((bg) this).field_C.field_p);
        ((bg) this).b((byte) -127, (we) (Object) ((bg) this).field_C);
        int var6 = 4;
        int var7 = 200;
        ((bg) this).field_z.a(40, 13361, 496 - var7 >> -1435116703, var7, var3);
        ((bg) this).field_K.a(40, 13361, var6 - -3, 60, 15 + var3);
        ((bg) this).field_K.field_o = (of) this;
        ((bg) this).field_z.field_o = (of) this;
        ((bg) this).b((byte) -33, (we) (Object) ((bg) this).field_z);
        ((bg) this).b((byte) -27, (we) (Object) ((bg) this).field_K);
        ((bg) this).field_G = new cm((sh) this);
        ((bg) this).field_G.a(150, 13361, ((bg) this).field_N.field_r + ((bg) this).field_N.field_l - -60, -60 + (-((bg) this).field_N.field_l + -((bg) this).field_N.field_r) + ((bg) this).field_l, ((bg) this).field_N.field_e + 20);
        ((bg) this).b((byte) -112, (we) (Object) ((bg) this).field_G);
        ((bg) this).a(var6 + 55 + var3, 13361, 0, 496, 0);
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        if (param3 == 7) {
          if (param4 != ((bg) this).field_K) {
            if (param4 != ((bg) this).field_z) {
              return;
            } else {
              boolean discarded$4 = this.d((byte) 104);
              return;
            }
          } else {
            wg.f(param3 ^ -8);
            return;
          }
        } else {
          ((bg) this).a(-82, -126, (jj) null, -55);
          if (param4 != ((bg) this).field_K) {
            if (param4 != ((bg) this).field_z) {
              return;
            } else {
              boolean discarded$5 = this.d((byte) 104);
              return;
            }
          } else {
            wg.f(param3 ^ -8);
            return;
          }
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5 = 0;
        if (!super.a(param0, param1, param2, 105)) {
          var5 = -20 % ((37 - param3) / 50);
          if (param2 != -99) {
            if (-100 != param2) {
              return false;
            } else {
              return ((bg) this).b(param0, false);
            }
          } else {
            return ((bg) this).a((byte) 112, param0);
          }
        } else {
          return true;
        }
    }

    private final int a(int param0, int param1, int param2, String param3, we param4) {
        mh var9 = new mh(20, param0, param2 + 120, 25, param4, false, 120, 3, t.field_z, 16777215, param3);
        ((bg) this).b((byte) -67, (we) (Object) var9);
        vh var7 = new vh(((ag) (Object) param4).a(-107));
        ((bg) this).b((byte) -82, (we) (Object) var7);
        int var8 = -12 / ((param1 - -16) / 48);
        var7.a(15, 13361, 3 + var9.field_l + var9.field_r, 15, (-15 + var9.field_p >> 1383622113) + var9.field_e);
        return var9.field_p;
    }

    private final boolean l(int param0) {
        if (param0 == -2706) {
          if (this.a(-59, (ag) (Object) ((bg) this).field_N)) {
            if (this.a(-110, (ag) (Object) ((bg) this).field_D)) {
              if (this.a(param0 + 2684, (ag) (Object) ((bg) this).field_I)) {
                if (this.a(param0 + 2694, (ag) (Object) ((bg) this).field_H)) {
                  if (this.a(param0 + 2819, (ag) (Object) ((bg) this).field_J)) {
                    if (!this.a(param0 + 2829, (ag) (Object) ((bg) this).field_F)) {
                      return false;
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
            return false;
          }
        } else {
          return true;
        }
    }

    private final boolean d(byte param0) {
        NumberFormatException numberFormatException = null;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!this.l(param0 + -2810)) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return false;
                }
                case 3: {
                    var2 = -1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        var2 = Integer.parseInt(((bg) this).field_F.field_s);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    numberFormatException = (NumberFormatException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (param0 != 104) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return kh.a(((bg) this).field_H.field_s, 71, ((bg) this).field_O.field_u, ((bg) this).field_N.field_s, var2, (bg) this, ((bg) this).field_D.field_s);
                }
                case 9: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final String b(boolean param0) {
        if (param0) {
            boolean discarded$0 = this.d((byte) -104);
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String e(byte param0) {
        int var2 = -60 / ((param0 - -43) / 45);
        return "<u=2164A2><col=2164A2>";
    }

    final void a(we param0, int param1, int param2, byte param3) {
        if (param3 > -13) {
            return;
        }
        super.a(param0, param1, param2, (byte) -23);
        ((bg) this).field_z.field_w = this.l(-2706);
    }

    public static void k(int param0) {
        field_B = null;
        field_L = null;
        if (param0 != 20660) {
            bg.k(96);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new String[]{"All scores", "My scores", "Best each"};
        field_L = new int[8192];
    }
}
