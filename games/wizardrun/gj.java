/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gj implements Iterable {
    static db[] field_f;
    private wl field_e;
    static volatile int field_a;
    static int field_b;
    int field_d;
    wl[] field_c;

    final static aa a(byte param0, String param1) {
        Object var3 = null;
        aa var3_ref = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        CharSequence var13 = null;
        var3 = null;
        var5 = wizardrun.field_H;
        if (null != lj.field_f) {
          if (param1 != null) {
            if (param1.length() != 0) {
              if (param0 == -116) {
                var12 = (CharSequence) (Object) param1;
                var8 = ta.a(-60, var12);
                if (var8 != null) {
                  var3_ref = (aa) (Object) lj.field_f.a((long)var8.hashCode(), (byte) 104);
                  L0: while (true) {
                    if (var3_ref != null) {
                      var13 = (CharSequence) (Object) var3_ref.field_mb;
                      var9 = ta.a(-51, var13);
                      if (var9.equals((Object) (Object) var8)) {
                        return var3_ref;
                      } else {
                        var3_ref = (aa) (Object) lj.field_f.a(false);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                field_b = -125;
                var10 = (CharSequence) (Object) param1;
                var6 = ta.a(-60, var10);
                if (var6 != null) {
                  var3_ref = (aa) (Object) lj.field_f.a((long)var6.hashCode(), (byte) 104);
                  L1: while (true) {
                    if (var3_ref != null) {
                      var11 = (CharSequence) (Object) var3_ref.field_mb;
                      var7 = ta.a(-51, var11);
                      if (var7.equals((Object) (Object) var6)) {
                        return var3_ref;
                      } else {
                        var3_ref = (aa) (Object) lj.field_f.a(false);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wh((gj) this);
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        var2 = 0;
        var3 = jd.field_f;
        if (5 <= var3) {
          if (-106 < (var3 ^ -1)) {
            L0: {
              var2 = (var3 * 16384 + -40960) / 220;
              var4 = 1;
              var5 = 0;
              if (param1 != 3) {
                break L0;
              } else {
                var4 = -1;
                break L0;
              }
            }
            L1: {
              if ((param1 ^ -1) != -2) {
                break L1;
              } else {
                var5 = 1;
                break L1;
              }
            }
            L2: {
              if (param1 != 4) {
                break L2;
              } else {
                var4 = 1;
                var5 = 1;
                break L2;
              }
            }
            L3: {
              if ((param1 ^ -1) != -6) {
                break L3;
              } else {
                var5 = 1;
                var4 = -1;
                break L3;
              }
            }
            L4: {
              if (6 != param1) {
                break L4;
              } else {
                var4 = 1;
                var5 = -1;
                break L4;
              }
            }
            L5: {
              if (param1 == 7) {
                var4 = -1;
                var5 = -1;
                break L5;
              } else {
                if (param1 != 8) {
                  break L5;
                } else {
                  L6: {
                    var4 = -1;
                    var5 = -1;
                    if (-12 != (param1 ^ -1)) {
                      break L6;
                    } else {
                      var4 = -1;
                      break L6;
                    }
                  }
                  L7: {
                    if (-13 != (param1 ^ -1)) {
                      break L7;
                    } else {
                      var4 = -1;
                      var5 = -1;
                      break L7;
                    }
                  }
                  L8: {
                    if (13 != param1) {
                      break L8;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L8;
                    }
                  }
                  if (param0 == 115) {
                    L9: {
                      if ((param1 ^ -1) == -15) {
                        var4 = -1;
                        var5 = 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (-16 == (param1 ^ -1)) {
                        var4 = 1;
                        var5 = 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
                    return;
                  } else {
                    L11: {
                      field_a = -119;
                      if ((param1 ^ -1) == -15) {
                        var4 = -1;
                        var5 = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (-16 == (param1 ^ -1)) {
                        var4 = 1;
                        var5 = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
                    return;
                  }
                }
              }
            }
            L13: {
              if (-12 != (param1 ^ -1)) {
                break L13;
              } else {
                var4 = -1;
                break L13;
              }
            }
            L14: {
              if (-13 != (param1 ^ -1)) {
                break L14;
              } else {
                var4 = -1;
                var5 = -1;
                break L14;
              }
            }
            L15: {
              if (13 != param1) {
                break L15;
              } else {
                var4 = 1;
                var5 = -1;
                break L15;
              }
            }
            if (param0 == 115) {
              L16: {
                if ((param1 ^ -1) == -15) {
                  var4 = -1;
                  var5 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (-16 == (param1 ^ -1)) {
                  var4 = 1;
                  var5 = 1;
                  break L17;
                } else {
                  break L17;
                }
              }
              cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
              return;
            } else {
              L18: {
                field_a = -119;
                if ((param1 ^ -1) == -15) {
                  var4 = -1;
                  var5 = 1;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (-16 == (param1 ^ -1)) {
                  var4 = 1;
                  var5 = 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
              return;
            }
          } else {
            if ((var3 ^ -1) > -121) {
              L20: {
                var3 = 120 + -var3;
                var2 = 8192 + -(var3 * (var3 * 8192) / 3300);
                var4 = 1;
                var5 = 0;
                if (param1 != 3) {
                  break L20;
                } else {
                  var4 = -1;
                  break L20;
                }
              }
              L21: {
                if ((param1 ^ -1) != -2) {
                  break L21;
                } else {
                  var5 = 1;
                  break L21;
                }
              }
              L22: {
                if (param1 != 4) {
                  break L22;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L22;
                }
              }
              L23: {
                if ((param1 ^ -1) != -6) {
                  break L23;
                } else {
                  var5 = 1;
                  var4 = -1;
                  break L23;
                }
              }
              L24: {
                if (6 != param1) {
                  break L24;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L24;
                }
              }
              L25: {
                if (param1 == 7) {
                  var4 = -1;
                  var5 = -1;
                  break L25;
                } else {
                  if (param1 != 8) {
                    break L25;
                  } else {
                    L26: {
                      var4 = -1;
                      var5 = -1;
                      if (-12 != (param1 ^ -1)) {
                        break L26;
                      } else {
                        var4 = -1;
                        break L26;
                      }
                    }
                    L27: {
                      if (-13 != (param1 ^ -1)) {
                        break L27;
                      } else {
                        var4 = -1;
                        var5 = -1;
                        break L27;
                      }
                    }
                    L28: {
                      if (13 != param1) {
                        break L28;
                      } else {
                        var4 = 1;
                        var5 = -1;
                        break L28;
                      }
                    }
                    L29: {
                      if (param0 == 115) {
                        break L29;
                      } else {
                        field_a = -119;
                        break L29;
                      }
                    }
                    L30: {
                      if ((param1 ^ -1) == -15) {
                        var4 = -1;
                        var5 = 1;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (-16 == (param1 ^ -1)) {
                        var4 = 1;
                        var5 = 1;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
                    return;
                  }
                }
              }
              L32: {
                if (-12 != (param1 ^ -1)) {
                  break L32;
                } else {
                  var4 = -1;
                  break L32;
                }
              }
              L33: {
                if (-13 != (param1 ^ -1)) {
                  break L33;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L33;
                }
              }
              L34: {
                if (13 != param1) {
                  break L34;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L34;
                }
              }
              if (param0 == 115) {
                L35: {
                  if ((param1 ^ -1) == -15) {
                    var4 = -1;
                    var5 = 1;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (-16 == (param1 ^ -1)) {
                    var4 = 1;
                    var5 = 1;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
                return;
              } else {
                L37: {
                  field_a = -119;
                  if ((param1 ^ -1) == -15) {
                    var4 = -1;
                    var5 = 1;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (-16 == (param1 ^ -1)) {
                    var4 = 1;
                    var5 = 1;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
                return;
              }
            } else {
              L39: {
                var4 = 1;
                var5 = 0;
                if (param1 != 3) {
                  break L39;
                } else {
                  var4 = -1;
                  break L39;
                }
              }
              L40: {
                if ((param1 ^ -1) != -2) {
                  break L40;
                } else {
                  var5 = 1;
                  break L40;
                }
              }
              L41: {
                if (param1 != 4) {
                  break L41;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L41;
                }
              }
              L42: {
                if ((param1 ^ -1) != -6) {
                  break L42;
                } else {
                  var5 = 1;
                  var4 = -1;
                  break L42;
                }
              }
              L43: {
                if (6 != param1) {
                  break L43;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L43;
                }
              }
              L44: {
                if (param1 == 7) {
                  var4 = -1;
                  var5 = -1;
                  break L44;
                } else {
                  if (param1 != 8) {
                    break L44;
                  } else {
                    L45: {
                      var4 = -1;
                      var5 = -1;
                      if (-12 != (param1 ^ -1)) {
                        break L45;
                      } else {
                        var4 = -1;
                        break L45;
                      }
                    }
                    L46: {
                      if (-13 != (param1 ^ -1)) {
                        break L46;
                      } else {
                        var4 = -1;
                        var5 = -1;
                        break L46;
                      }
                    }
                    L47: {
                      if (13 != param1) {
                        break L47;
                      } else {
                        var4 = 1;
                        var5 = -1;
                        break L47;
                      }
                    }
                    L48: {
                      if (param0 == 115) {
                        break L48;
                      } else {
                        field_a = -119;
                        break L48;
                      }
                    }
                    L49: {
                      if ((param1 ^ -1) == -15) {
                        var4 = -1;
                        var5 = 1;
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                    L50: {
                      if (-16 == (param1 ^ -1)) {
                        var4 = 1;
                        var5 = 1;
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                    cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
                    return;
                  }
                }
              }
              L51: {
                if (-12 != (param1 ^ -1)) {
                  break L51;
                } else {
                  var4 = -1;
                  break L51;
                }
              }
              L52: {
                if (-13 != (param1 ^ -1)) {
                  break L52;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L52;
                }
              }
              L53: {
                if (13 != param1) {
                  break L53;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L53;
                }
              }
              if (param0 == 115) {
                L54: {
                  if ((param1 ^ -1) == -15) {
                    var4 = -1;
                    var5 = 1;
                    break L54;
                  } else {
                    break L54;
                  }
                }
                L55: {
                  if (-16 == (param1 ^ -1)) {
                    var4 = 1;
                    var5 = 1;
                    break L55;
                  } else {
                    break L55;
                  }
                }
                cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
                return;
              } else {
                L56: {
                  field_a = -119;
                  if ((param1 ^ -1) == -15) {
                    var4 = -1;
                    var5 = 1;
                    break L56;
                  } else {
                    break L56;
                  }
                }
                L57: {
                  if (-16 == (param1 ^ -1)) {
                    var4 = 1;
                    var5 = 1;
                    break L57;
                  } else {
                    break L57;
                  }
                }
                cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
                return;
              }
            }
          }
        } else {
          L58: {
            var2 = var3 * var3 * 8192 / 1100;
            var4 = 1;
            var5 = 0;
            if (param1 != 3) {
              break L58;
            } else {
              var4 = -1;
              break L58;
            }
          }
          L59: {
            if ((param1 ^ -1) != -2) {
              break L59;
            } else {
              var5 = 1;
              break L59;
            }
          }
          L60: {
            if (param1 != 4) {
              break L60;
            } else {
              var4 = 1;
              var5 = 1;
              break L60;
            }
          }
          L61: {
            if ((param1 ^ -1) != -6) {
              break L61;
            } else {
              var5 = 1;
              var4 = -1;
              break L61;
            }
          }
          L62: {
            if (6 != param1) {
              break L62;
            } else {
              var4 = 1;
              var5 = -1;
              break L62;
            }
          }
          if (param1 != 7) {
            L63: {
              if (param1 != 8) {
                break L63;
              } else {
                var4 = -1;
                var5 = -1;
                break L63;
              }
            }
            L64: {
              if (-12 != (param1 ^ -1)) {
                break L64;
              } else {
                var4 = -1;
                break L64;
              }
            }
            L65: {
              if (-13 != (param1 ^ -1)) {
                break L65;
              } else {
                var4 = -1;
                var5 = -1;
                break L65;
              }
            }
            L66: {
              if (13 != param1) {
                break L66;
              } else {
                var4 = 1;
                var5 = -1;
                break L66;
              }
            }
            if (param0 != 115) {
              L67: {
                field_a = -119;
                if ((param1 ^ -1) == -15) {
                  var4 = -1;
                  var5 = 1;
                  break L67;
                } else {
                  break L67;
                }
              }
              L68: {
                if (-16 == (param1 ^ -1)) {
                  var4 = 1;
                  var5 = 1;
                  break L68;
                } else {
                  break L68;
                }
              }
              cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
              return;
            } else {
              L69: {
                if ((param1 ^ -1) == -15) {
                  var4 = -1;
                  var5 = 1;
                  break L69;
                } else {
                  break L69;
                }
              }
              L70: {
                if (-16 == (param1 ^ -1)) {
                  var4 = 1;
                  var5 = 1;
                  break L70;
                } else {
                  break L70;
                }
              }
              cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
              return;
            }
          } else {
            L71: {
              var4 = -1;
              var5 = -1;
              if (-12 != (param1 ^ -1)) {
                break L71;
              } else {
                var4 = -1;
                break L71;
              }
            }
            L72: {
              if (-13 != (param1 ^ -1)) {
                break L72;
              } else {
                var4 = -1;
                var5 = -1;
                break L72;
              }
            }
            L73: {
              if (13 != param1) {
                break L73;
              } else {
                var4 = 1;
                var5 = -1;
                break L73;
              }
            }
            L74: {
              if (param0 == 115) {
                break L74;
              } else {
                field_a = -119;
                break L74;
              }
            }
            L75: {
              if ((param1 ^ -1) == -15) {
                var4 = -1;
                var5 = 1;
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              if (-16 == (param1 ^ -1)) {
                var4 = 1;
                var5 = 1;
                break L76;
              } else {
                break L76;
              }
            }
            cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
            return;
          }
        }
    }

    final static aa a(String param0, int param1) {
        Object var2 = null;
        aa var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = wizardrun.field_H;
        if (param1 == -30782) {
          if (null != wl.field_f) {
            L0: {
              var6 = (CharSequence) (Object) param0;
              var2 = (Object) (Object) ta.a(-55, var6);
              if (var2 == null) {
                var2 = (Object) (Object) var6;
                break L0;
              } else {
                break L0;
              }
            }
            var3 = (aa) (Object) wl.field_f.a((long)((String) var2).hashCode(), (byte) 124);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_mb;
                  var4 = ta.a(param1 + 30710, var7);
                  if (var4 == null) {
                    var4 = var3.field_mb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!var4.equals(var2)) {
                  var3 = (aa) (Object) wl.field_f.a(false);
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= 70) {
            return;
        }
        Object var2 = null;
        aa discarded$0 = gj.a((byte) -10, (String) null);
    }

    final wl a(boolean param0, long param1) {
        wl var4 = null;
        wl var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        var4 = ((gj) this).field_c[(int)(param1 & (long)(-1 + ((gj) this).field_d))];
        ((gj) this).field_e = var4.field_b;
        if (param0) {
          gj.a((byte) 61, -95);
          L0: while (true) {
            if (var4 != ((gj) this).field_e) {
              if (param1 == ((gj) this).field_e.field_e) {
                var5 = ((gj) this).field_e;
                ((gj) this).field_e = ((gj) this).field_e.field_b;
                return var5;
              } else {
                ((gj) this).field_e = ((gj) this).field_e.field_b;
                continue L0;
              }
            } else {
              ((gj) this).field_e = null;
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (var4 != ((gj) this).field_e) {
              if (param1 == ((gj) this).field_e.field_e) {
                var5 = ((gj) this).field_e;
                ((gj) this).field_e = ((gj) this).field_e.field_b;
                return var5;
              } else {
                ((gj) this).field_e = ((gj) this).field_e.field_b;
                continue L1;
              }
            } else {
              ((gj) this).field_e = null;
              return null;
            }
          }
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        if (param1 <= 21) {
            return;
        }
        param0.addMouseListener((java.awt.event.MouseListener) (Object) tc.field_m);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) tc.field_m);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) tc.field_m);
    }

    final void a(long param0, wl param1, byte param2) {
        wl var5 = null;
        if (null == param1.field_c) {
          var5 = ((gj) this).field_c[(int)((long)(-1 + ((gj) this).field_d) & param0)];
          param1.field_c = var5.field_c;
          if (param2 > -84) {
            return;
          } else {
            param1.field_b = var5;
            param1.field_c.field_b = param1;
            param1.field_e = param0;
            param1.field_b.field_c = param1;
            return;
          }
        } else {
          param1.a(false);
          var5 = ((gj) this).field_c[(int)((long)(-1 + ((gj) this).field_d) & param0)];
          param1.field_c = var5.field_c;
          if (param2 > -84) {
            return;
          } else {
            param1.field_b = var5;
            param1.field_c.field_b = param1;
            param1.field_e = param0;
            param1.field_b.field_c = param1;
            return;
          }
        }
    }

    private gj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_b = 0;
    }
}
