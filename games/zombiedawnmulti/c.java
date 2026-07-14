/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c {
    private ff field_a;
    static Random field_c;
    private ff field_f;
    static int field_e;
    static boolean field_b;
    static String field_d;

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = f.field_a;
        if (-6 >= (var3 ^ -1)) {
          if (var3 >= 105) {
            if (120 > var3) {
              L0: {
                var3 = 120 - var3;
                var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                var4 = 1;
                var5 = 0;
                if (1 != param0) {
                  break L0;
                } else {
                  var5 = 1;
                  break L0;
                }
              }
              L1: {
                if (-4 != param0) {
                  break L1;
                } else {
                  var4 = -1;
                  break L1;
                }
              }
              L2: {
                if (-5 == param0) {
                  var4 = 1;
                  var5 = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0 == -6) {
                  var4 = -1;
                  var5 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (6 == param0) {
                  var4 = 1;
                  var5 = -1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (-8 == param0) {
                  var5 = -1;
                  var4 = -1;
                  break L5;
                } else {
                  if (8 != param0) {
                    break L5;
                  } else {
                    L6: {
                      var5 = -1;
                      var4 = -1;
                      if (param0 != 11) {
                        break L6;
                      } else {
                        var4 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      if (-13 != (param0 ^ -1)) {
                        break L7;
                      } else {
                        var4 = -1;
                        var5 = -1;
                        break L7;
                      }
                    }
                    if (param1 < 72) {
                      return;
                    } else {
                      L8: {
                        if (13 == param0) {
                          var5 = -1;
                          var4 = 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (14 == param0) {
                          var5 = 1;
                          var4 = -1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if ((param0 ^ -1) != -16) {
                          break L10;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L10;
                        }
                      }
                      hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                      return;
                    }
                  }
                }
              }
              L11: {
                if (param0 != 11) {
                  break L11;
                } else {
                  var4 = -1;
                  break L11;
                }
              }
              L12: {
                if (-13 != (param0 ^ -1)) {
                  break L12;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L12;
                }
              }
              if (param1 < 72) {
                return;
              } else {
                L13: {
                  if (13 == param0) {
                    var5 = -1;
                    var4 = 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (14 == param0) {
                    var5 = 1;
                    var4 = -1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if ((param0 ^ -1) != -16) {
                    break L15;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L15;
                  }
                }
                hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                return;
              }
            } else {
              L16: {
                var4 = 1;
                var5 = 0;
                if (1 != param0) {
                  break L16;
                } else {
                  var5 = 1;
                  break L16;
                }
              }
              L17: {
                if (-4 != param0) {
                  break L17;
                } else {
                  var4 = -1;
                  break L17;
                }
              }
              L18: {
                if (-5 == param0) {
                  var4 = 1;
                  var5 = 1;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (param0 == -6) {
                  var4 = -1;
                  var5 = 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (6 == param0) {
                  var4 = 1;
                  var5 = -1;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (-8 == param0) {
                  var5 = -1;
                  var4 = -1;
                  break L21;
                } else {
                  if (8 != param0) {
                    break L21;
                  } else {
                    L22: {
                      var5 = -1;
                      var4 = -1;
                      if (param0 != 11) {
                        break L22;
                      } else {
                        var4 = -1;
                        break L22;
                      }
                    }
                    L23: {
                      if (-13 != (param0 ^ -1)) {
                        break L23;
                      } else {
                        var4 = -1;
                        var5 = -1;
                        break L23;
                      }
                    }
                    if (param1 < 72) {
                      return;
                    } else {
                      L24: {
                        if (13 == param0) {
                          var5 = -1;
                          var4 = 1;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (14 == param0) {
                          var5 = 1;
                          var4 = -1;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        if ((param0 ^ -1) != -16) {
                          break L26;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L26;
                        }
                      }
                      hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                      return;
                    }
                  }
                }
              }
              L27: {
                if (param0 != 11) {
                  break L27;
                } else {
                  var4 = -1;
                  break L27;
                }
              }
              L28: {
                if (-13 != (param0 ^ -1)) {
                  break L28;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L28;
                }
              }
              if (param1 < 72) {
                return;
              } else {
                L29: {
                  if (13 == param0) {
                    var5 = -1;
                    var4 = 1;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (14 == param0) {
                    var5 = 1;
                    var4 = -1;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if ((param0 ^ -1) != -16) {
                    break L31;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L31;
                  }
                }
                hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                return;
              }
            }
          } else {
            L32: {
              var2 = (-40960 + var3 * 16384) / 220;
              var4 = 1;
              var5 = 0;
              if (1 != param0) {
                break L32;
              } else {
                var5 = 1;
                break L32;
              }
            }
            L33: {
              if (-4 != param0) {
                break L33;
              } else {
                var4 = -1;
                break L33;
              }
            }
            L34: {
              if (-5 == param0) {
                var4 = 1;
                var5 = 1;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (param0 == -6) {
                var4 = -1;
                var5 = 1;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (6 == param0) {
                var4 = 1;
                var5 = -1;
                break L36;
              } else {
                break L36;
              }
            }
            if (-8 != param0) {
              L37: {
                if (8 != param0) {
                  break L37;
                } else {
                  var5 = -1;
                  var4 = -1;
                  break L37;
                }
              }
              L38: {
                if (param0 != 11) {
                  break L38;
                } else {
                  var4 = -1;
                  break L38;
                }
              }
              L39: {
                if (-13 != (param0 ^ -1)) {
                  break L39;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L39;
                }
              }
              if (param1 < 72) {
                return;
              } else {
                L40: {
                  if (13 == param0) {
                    var5 = -1;
                    var4 = 1;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if (14 == param0) {
                    var5 = 1;
                    var4 = -1;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  if ((param0 ^ -1) != -16) {
                    break L42;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L42;
                  }
                }
                hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                return;
              }
            } else {
              L43: {
                var5 = -1;
                var4 = -1;
                if (param0 != 11) {
                  break L43;
                } else {
                  var4 = -1;
                  break L43;
                }
              }
              L44: {
                if (-13 != (param0 ^ -1)) {
                  break L44;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L44;
                }
              }
              if (param1 < 72) {
                return;
              } else {
                L45: {
                  if (13 == param0) {
                    var5 = -1;
                    var4 = 1;
                    break L45;
                  } else {
                    break L45;
                  }
                }
                L46: {
                  if (14 == param0) {
                    var5 = 1;
                    var4 = -1;
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if ((param0 ^ -1) != -16) {
                    break L47;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L47;
                  }
                }
                hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                return;
              }
            }
          }
        } else {
          L48: {
            var2 = 8192 * var3 * var3 / 1100;
            var4 = 1;
            var5 = 0;
            if (1 != param0) {
              break L48;
            } else {
              var5 = 1;
              break L48;
            }
          }
          L49: {
            if (-4 != param0) {
              break L49;
            } else {
              var4 = -1;
              break L49;
            }
          }
          L50: {
            if (-5 == param0) {
              var4 = 1;
              var5 = 1;
              break L50;
            } else {
              break L50;
            }
          }
          L51: {
            if (param0 == -6) {
              var4 = -1;
              var5 = 1;
              break L51;
            } else {
              break L51;
            }
          }
          L52: {
            if (6 == param0) {
              var4 = 1;
              var5 = -1;
              break L52;
            } else {
              break L52;
            }
          }
          if (-8 != param0) {
            L53: {
              if (8 != param0) {
                break L53;
              } else {
                var5 = -1;
                var4 = -1;
                break L53;
              }
            }
            L54: {
              if (param0 != 11) {
                break L54;
              } else {
                var4 = -1;
                break L54;
              }
            }
            L55: {
              if (-13 != (param0 ^ -1)) {
                break L55;
              } else {
                var4 = -1;
                var5 = -1;
                break L55;
              }
            }
            if (param1 < 72) {
              return;
            } else {
              L56: {
                if (13 == param0) {
                  var5 = -1;
                  var4 = 1;
                  break L56;
                } else {
                  break L56;
                }
              }
              L57: {
                if (14 == param0) {
                  var5 = 1;
                  var4 = -1;
                  break L57;
                } else {
                  break L57;
                }
              }
              L58: {
                if ((param0 ^ -1) != -16) {
                  break L58;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L58;
                }
              }
              hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
              return;
            }
          } else {
            L59: {
              var5 = -1;
              var4 = -1;
              if (param0 != 11) {
                break L59;
              } else {
                var4 = -1;
                break L59;
              }
            }
            L60: {
              if (-13 != (param0 ^ -1)) {
                break L60;
              } else {
                var4 = -1;
                var5 = -1;
                break L60;
              }
            }
            if (param1 < 72) {
              return;
            } else {
              L61: {
                if (13 == param0) {
                  var5 = -1;
                  var4 = 1;
                  break L61;
                } else {
                  break L61;
                }
              }
              L62: {
                if (14 == param0) {
                  var5 = 1;
                  var4 = -1;
                  break L62;
                } else {
                  break L62;
                }
              }
              L63: {
                if ((param0 ^ -1) != -16) {
                  break L63;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L63;
                }
              }
              hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
              return;
            }
          }
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 98) {
            return true;
        }
        return tj.field_a.c(param0 + -224);
    }

    public static void a(int param0) {
        if (param0 != -6) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static int a(byte[] param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = -1;
        var5 = param3;
        L0: while (true) {
          if (param1 <= var5) {
            if (!param2) {
              c.a(104);
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 ^ -1;
              return var4;
            }
          } else {
            var4 = var4 >>> -874646712 ^ ed.field_a[255 & (param0[var5] ^ var4)];
            var5++;
            continue L0;
          }
        }
    }

    final ff c(int param0) {
        ff var2 = ((c) this).field_f;
        if (param0 != -1) {
            ff discarded$9 = ((c) this).c(-65);
            if (!(var2 != ((c) this).field_a)) {
                ((c) this).field_f = null;
                return null;
            }
            ((c) this).field_f = var2.field_v;
            return var2;
        }
        if (!(var2 != ((c) this).field_a)) {
            ((c) this).field_f = null;
            return null;
        }
        ((c) this).field_f = var2.field_v;
        return var2;
    }

    final static void a(boolean param0, byte param1, float param2, String param3) {
        int var4 = 0;
        if (null == pj.field_I) {
          pj.field_I = new ta(nb.field_a, pm.field_P);
          nb.field_a.b(3016, (cf) (Object) pj.field_I);
          pj.field_I.a(param3, param2, 66, param0);
          oo.b();
          var4 = 30 % ((param1 - -45) / 37);
          wj.b(true, -114);
          return;
        } else {
          pj.field_I.a(param3, param2, 66, param0);
          oo.b();
          var4 = 30 % ((param1 - -45) / 37);
          wj.b(true, -114);
          return;
        }
    }

    final void a(ff param0, boolean param1) {
        if (null == param0.field_w) {
          param0.field_v = ((c) this).field_a.field_v;
          param0.field_w = ((c) this).field_a;
          if (!param1) {
            return;
          } else {
            param0.field_w.field_v = param0;
            param0.field_v.field_w = param0;
            return;
          }
        } else {
          param0.c((byte) -70);
          param0.field_v = ((c) this).field_a.field_v;
          param0.field_w = ((c) this).field_a;
          if (!param1) {
            return;
          } else {
            param0.field_w.field_v = param0;
            param0.field_v.field_w = param0;
            return;
          }
        }
    }

    final int b(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = param0;
        ff var3 = ((c) this).field_a.field_v;
        while (var3 != ((c) this).field_a) {
            var2++;
            var3 = var3.field_v;
        }
        return var2;
    }

    public c() {
        ((c) this).field_a = new ff();
        ((c) this).field_a.field_v = ((c) this).field_a;
        ((c) this).field_a.field_w = ((c) this).field_a;
    }

    final ff a(boolean param0) {
        ff var2 = null;
        var2 = ((c) this).field_a.field_v;
        if (((c) this).field_a != var2) {
          if (param0) {
            ((c) this).field_a = null;
            ((c) this).field_f = var2.field_v;
            return var2;
          } else {
            ((c) this).field_f = var2.field_v;
            return var2;
          }
        } else {
          ((c) this).field_f = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new Random();
        field_b = true;
        field_d = "Stun a human or an enemy zombie.";
    }
}
