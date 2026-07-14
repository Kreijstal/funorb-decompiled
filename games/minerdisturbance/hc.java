/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hc extends fe {
    boolean field_H;
    private boolean field_G;
    private boolean field_F;
    static boolean field_D;
    boolean field_E;

    boolean a(char param0, fe param1, byte param2, int param3) {
        if (((hc) this).k(-100)) {
          if (param3 != -85) {
            if (-84 != param3) {
              if (param2 != -79) {
                ((hc) this).field_E = false;
                return false;
              } else {
                return false;
              }
            } else {
              ((hc) this).a(-1, -1, -1, 1);
              return true;
            }
          } else {
            ((hc) this).a(-1, -1, -1, 1);
            return true;
          }
        } else {
          if (param2 != -79) {
            ((hc) this).field_E = false;
            return false;
          } else {
            return false;
          }
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 > 6) {
          if (param4 >= param3) {
            if (param4 < param5 + param3) {
              if (param1 <= param6) {
                if (param6 >= param1 - -param2) {
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
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((hc) this).a(param3, true, param2, param1)) {
          ((hc) this).a(param1, param3, 34, param2);
          if (!((hc) this).field_H) {
            if (!((hc) this).field_E) {
              StringBuilder discarded$19 = param3.append(" disabled");
              if (param0 != -70) {
                ((hc) this).field_F = false;
                return param3;
              } else {
                return param3;
              }
            } else {
              if (param0 != -70) {
                ((hc) this).field_F = false;
                return param3;
              } else {
                return param3;
              }
            }
          } else {
            L0: {
              StringBuilder discarded$20 = param3.append(" active");
              if (!((hc) this).field_E) {
                StringBuilder discarded$21 = param3.append(" disabled");
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 == -70) {
              return param3;
            } else {
              ((hc) this).field_F = false;
              return param3;
            }
          }
        } else {
          if (param0 == -70) {
            return param3;
          } else {
            ((hc) this).field_F = false;
            return param3;
          }
        }
    }

    boolean a(fe param0, int param1) {
        if (param1 >= 119) {
          if (((hc) this).field_E) {
            if (((hc) this).field_F) {
              param0.g(4966);
              ((hc) this).field_G = true;
              if (((hc) this).field_y != null) {
                if (!(((hc) this).field_y instanceof kg)) {
                  return true;
                } else {
                  ((kg) (Object) ((hc) this).field_y).a(((hc) this).field_G, 19392, (fe) this);
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
          ((hc) this).a(93, 90, 39, -108);
          if (((hc) this).field_E) {
            if (((hc) this).field_F) {
              param0.g(4966);
              ((hc) this).field_G = true;
              if (((hc) this).field_y != null) {
                if (!(((hc) this).field_y instanceof kg)) {
                  return true;
                } else {
                  ((kg) (Object) ((hc) this).field_y).a(((hc) this).field_G, 19392, (fe) this);
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
        }
    }

    final void g(int param0) {
        if (((hc) this).field_G) {
          ((hc) this).field_G = false;
          if (((hc) this).field_y != null) {
            if (((hc) this).field_y instanceof kg) {
              ((kg) (Object) ((hc) this).field_y).a(((hc) this).field_G, 19392, (fe) this);
              if (param0 != 4966) {
                ((hc) this).field_F = false;
                return;
              } else {
                return;
              }
            } else {
              if (param0 != 4966) {
                ((hc) this).field_F = false;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 4966) {
              ((hc) this).field_F = false;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 4966) {
            ((hc) this).field_F = false;
            return;
          } else {
            return;
          }
        }
    }

    final boolean k(int param0) {
        int var2 = -28 / ((param0 - -33) / 45);
        return ((hc) this).field_G;
    }

    hc(String param0, ad param1, rm param2) {
        super(param0, param1, param2);
        ((hc) this).field_G = false;
        ((hc) this).field_F = true;
        ((hc) this).field_E = true;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (null != ((hc) this).field_y) {
          if (((hc) this).field_y instanceof sh) {
            ((sh) (Object) ((hc) this).field_y).a(param2, (byte) 6, (hc) this, param3, param1);
            if (param0 != -1) {
              ((hc) this).g(-9);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != -1) {
              ((hc) this).g(-9);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -1) {
            ((hc) this).g(-9);
            return;
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, byte param2, fe param3) {
        Object var6 = null;
        if (param2 > 49) {
          super.a(param0, param1, (byte) 56, param3);
          if (((hc) this).field_w != 0) {
            if (((hc) this).field_w != ld.field_B) {
              if (((hc) this).b(gb.field_e, param1, param0, nk.field_w, -118)) {
                if (0 == ld.field_B) {
                  ((hc) this).a(-1, -param1 + nk.field_w, gb.field_e + -param0, ((hc) this).field_w);
                  ((hc) this).a(param1, gb.field_e, nk.field_w, param0, param3, 0);
                  return;
                } else {
                  ((hc) this).a(param1, gb.field_e, nk.field_w, param0, param3, 0);
                  return;
                }
              } else {
                ((hc) this).a(param1, gb.field_e, nk.field_w, param0, param3, 0);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var6 = null;
          boolean discarded$1 = ((hc) this).a('ﾰ', (fe) null, (byte) 26, -48);
          super.a(param0, param1, (byte) 56, param3);
          if (((hc) this).field_w != 0) {
            if (((hc) this).field_w != ld.field_B) {
              if (((hc) this).b(gb.field_e, param1, param0, nk.field_w, -118)) {
                if (0 == ld.field_B) {
                  ((hc) this).a(-1, -param1 + nk.field_w, gb.field_e + -param0, ((hc) this).field_w);
                  ((hc) this).a(param1, gb.field_e, nk.field_w, param0, param3, 0);
                  return;
                } else {
                  ((hc) this).a(param1, gb.field_e, nk.field_w, param0, param3, 0);
                  return;
                }
              } else {
                ((hc) this).a(param1, gb.field_e, nk.field_w, param0, param3, 0);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    hc(String param0, rm param1) {
        this(param0, bd.field_c.field_m, param1);
    }

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        if (((hc) this).field_y != null) {
          if (!(((hc) this).field_y instanceof dd)) {
            ((hc) this).field_w = param5;
            return;
          } else {
            ((dd) (Object) ((hc) this).field_y).a(param0, param1, param3, (hc) this, param2, param5 ^ -2048);
            ((hc) this).field_w = param5;
            return;
          }
        } else {
          ((hc) this).field_w = param5;
          return;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        if (!((hc) this).field_E) {
          if (param2 != 0) {
            return false;
          } else {
            return false;
          }
        } else {
          if (((hc) this).b(param3, param6, param1, param0, param2 + -98)) {
            boolean discarded$2 = ((hc) this).a(param5, 127);
            ((hc) this).field_w = param4;
            if (null != ((hc) this).field_y) {
              if (!(((hc) this).field_y instanceof dd)) {
                return true;
              } else {
                ((dd) (Object) ((hc) this).field_y).a(param0, param6, param4, param1, -31561, (hc) this, param3);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param2 != 0) {
              return false;
            } else {
              return false;
            }
          }
        }
    }

    protected hc() {
        ((hc) this).field_G = false;
        ((hc) this).field_F = true;
        ((hc) this).field_E = true;
        ((hc) this).field_A = bd.field_c.field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = false;
    }
}
