/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kf extends w {
    boolean field_D;
    private boolean field_B;
    static be field_y;
    static db[] field_A;
    private boolean field_x;
    boolean field_C;
    static dg field_z;

    boolean a(byte param0, w param1) {
        if (((kf) this).field_D) {
          if (((kf) this).field_x) {
            param1.c((byte) -122);
            if (param0 == 44) {
              ((kf) this).field_B = true;
              if (null != ((kf) this).field_r) {
                if (!(((kf) this).field_r instanceof ml)) {
                  return true;
                } else {
                  ((ml) (Object) ((kf) this).field_r).a(false, ((kf) this).field_B, (w) this);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((kf) this).field_x = true;
              ((kf) this).field_B = true;
              if (null != ((kf) this).field_r) {
                if (!(((kf) this).field_r instanceof ml)) {
                  return true;
                } else {
                  ((ml) (Object) ((kf) this).field_r).a(false, ((kf) this).field_B, (w) this);
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    kf(String param0, vd param1) {
        this(param0, nb.field_z.field_f, param1);
    }

    boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        if (param0 == -4808) {
          if (((kf) this).field_D) {
            if (((kf) this).a(param3, param6, param5, param4, (byte) -93)) {
              boolean discarded$2 = ((kf) this).a((byte) 44, param2);
              ((kf) this).field_h = param1;
              if (((kf) this).field_r != null) {
                if (!(((kf) this).field_r instanceof j)) {
                  return true;
                } else {
                  ((j) (Object) ((kf) this).field_r).a(param3, param1, param6, (byte) -14, param5, param4, (kf) this);
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
          ((kf) this).field_B = false;
          if (((kf) this).field_D) {
            if (((kf) this).a(param3, param6, param5, param4, (byte) -93)) {
              boolean discarded$3 = ((kf) this).a((byte) 44, param2);
              ((kf) this).field_h = param1;
              if (((kf) this).field_r != null) {
                if (((kf) this).field_r instanceof j) {
                  ((j) (Object) ((kf) this).field_r).a(param3, param1, param6, (byte) -14, param5, param4, (kf) this);
                  return true;
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
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (((kf) this).field_r == null) {
            break L0;
          } else {
            if (((kf) this).field_r instanceof jk) {
              ((jk) (Object) ((kf) this).field_r).a(param2, param1, 215535458, param3, (kf) this);
              break L0;
            } else {
              if (param0 == -23287) {
                return;
              } else {
                ((kf) this).field_B = true;
                return;
              }
            }
          }
        }
        if (param0 != -23287) {
          ((kf) this).field_B = true;
          return;
        } else {
          return;
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (((kf) this).field_h != 0) {
          if (((kf) this).field_h != ul.field_o) {
            if (!((kf) this).a(sh.field_e, bk.field_b, param3, param2, (byte) -115)) {
              ((kf) this).a(param1, bk.field_b, param2, 0, param3, sh.field_e);
              return;
            } else {
              if (-1 == (ul.field_o ^ -1)) {
                ((kf) this).a(-23287, -param2 + sh.field_e, ((kf) this).field_h, bk.field_b + -param3);
                ((kf) this).a(param1, bk.field_b, param2, 0, param3, sh.field_e);
                return;
              } else {
                ((kf) this).a(param1, bk.field_b, param2, 0, param3, sh.field_e);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void e(int param0) {
        field_z = null;
        field_A = null;
        field_y = null;
        if (param0 != -85) {
            field_y = null;
        }
    }

    final static boolean d(boolean param0) {
        pd var1 = null;
        int var2 = 0;
        int var3 = 0;
        pd var4 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        var4 = (pd) (Object) al.field_C.a(param0);
        var1 = var4;
        if (var1 != null) {
          var2 = 0;
          L0: while (true) {
            if (var1.field_p > var2) {
              L1: {
                if (var4.field_k[var2] != null) {
                  if (var4.field_k[var2].field_b != 0) {
                    break L1;
                  } else {
                    return false;
                  }
                } else {
                  break L1;
                }
              }
              if (var4.field_i[var2] == null) {
                var2++;
                var2++;
                var2++;
                continue L0;
              } else {
                if (var4.field_i[var2].field_b == 0) {
                  return false;
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        if (((kf) this).field_r != null) {
          if (!(((kf) this).field_r instanceof j)) {
            ((kf) this).field_h = param3;
            return;
          } else {
            ((j) (Object) ((kf) this).field_r).a(-121, param4, param5, param2, param1, (kf) this);
            ((kf) this).field_h = param3;
            return;
          }
        } else {
          ((kf) this).field_h = param3;
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 != 18337) {
            return false;
        }
        return ((kf) this).field_B;
    }

    final static void f(int param0) {
        nb.field_z = hh.a((byte) 115);
        ug.field_A = new eg();
        if (param0 != 1) {
          kf.h(-103);
          jd.a(true, true, 37);
          return;
        } else {
          jd.a(true, true, 37);
          return;
        }
    }

    final static int g(int param0) {
        if (param0 != 0) {
            kf.f(-4);
            return uk.field_V;
        }
        return uk.field_V;
    }

    final static void h(int param0) {
        if (param0 != -1) {
            return;
        }
        og.field_c = ig.field_a.c(false);
        CharSequence var2 = (CharSequence) (Object) og.field_c;
        cb.field_t = ck.a(var2, (byte) -48);
    }

    kf(String param0, rd param1, vd param2) {
        super(param0, param1, param2);
        ((kf) this).field_D = true;
        ((kf) this).field_B = false;
        ((kf) this).field_x = true;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        Object var6 = null;
        if (param3 == -15992) {
          if (((kf) this).a(7373, param2, param1, param0)) {
            ((kf) this).a(param2, 0, param0, param1);
            if (!((kf) this).field_C) {
              if (!((kf) this).field_D) {
                StringBuilder discarded$6 = param2.append(" disabled");
                return param2;
              } else {
                return param2;
              }
            } else {
              StringBuilder discarded$7 = param2.append(" active");
              if (!((kf) this).field_D) {
                StringBuilder discarded$8 = param2.append(" disabled");
                return param2;
              } else {
                return param2;
              }
            }
          } else {
            return param2;
          }
        } else {
          var6 = null;
          ((kf) this).a((byte) 35, (w) null, 75, 35);
          if (((kf) this).a(7373, param2, param1, param0)) {
            ((kf) this).a(param2, 0, param0, param1);
            if (((kf) this).field_C) {
              StringBuilder discarded$9 = param2.append(" active");
              if (((kf) this).field_D) {
                return param2;
              } else {
                StringBuilder discarded$10 = param2.append(" disabled");
                return param2;
              }
            } else {
              if (!((kf) this).field_D) {
                StringBuilder discarded$11 = param2.append(" disabled");
                return param2;
              } else {
                return param2;
              }
            }
          } else {
            return param2;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = -35 / ((-87 - param0) / 36);
        int var3 = 0;
        if (-1 != (param1 & 7 ^ -1)) {
            var3 = -(7 & param1) + 8;
        }
        int var4 = param1 + var3;
        return var4;
    }

    protected kf() {
        ((kf) this).field_D = true;
        ((kf) this).field_B = false;
        ((kf) this).field_x = true;
        ((kf) this).field_i = nb.field_z.field_j;
    }

    final void c(byte param0) {
        Object var3 = null;
        if (((kf) this).field_B) {
          ((kf) this).field_B = false;
          if (null != ((kf) this).field_r) {
            if (!(((kf) this).field_r instanceof ml)) {
              if (param0 > -35) {
                var3 = null;
                boolean discarded$4 = ((kf) this).a(-41, -60, (w) null, 127, 58, -109, 47);
                return;
              } else {
                return;
              }
            } else {
              ((ml) (Object) ((kf) this).field_r).a(false, ((kf) this).field_B, (w) this);
              if (param0 > -35) {
                var3 = null;
                boolean discarded$5 = ((kf) this).a(-41, -60, (w) null, 127, 58, -109, 47);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 > -35) {
              var3 = null;
              boolean discarded$6 = ((kf) this).a(-41, -60, (w) null, 127, 58, -109, 47);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 <= -35) {
            return;
          } else {
            var3 = null;
            boolean discarded$7 = ((kf) this).a(-41, -60, (w) null, 127, 58, -109, 47);
            return;
          }
        }
    }

    boolean a(char param0, int param1, w param2, byte param3) {
        int var5 = 0;
        var5 = -98 / ((-13 - param3) / 55);
        if (((kf) this).a(18337)) {
          if (-85 != (param1 ^ -1)) {
            if (param1 != 83) {
              return false;
            } else {
              ((kf) this).a(-23287, -1, 1, -1);
              return true;
            }
          } else {
            ((kf) this).a(-23287, -1, 1, -1);
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new dg();
    }
}
