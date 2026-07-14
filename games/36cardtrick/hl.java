/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hl extends lk {
    private boolean field_z;
    boolean field_D;
    static boolean[] field_y;
    static String field_C;
    private boolean field_A;
    boolean field_B;

    boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        if (!((hl) this).field_B) {
          if (param3 > -14) {
            return false;
          } else {
            return false;
          }
        } else {
          if (((hl) this).a(-102, param0, param6, param2, param1)) {
            boolean discarded$2 = ((hl) this).a(107, param4);
            ((hl) this).field_x = param5;
            if (((hl) this).field_k != null) {
              if (!(((hl) this).field_k instanceof fi)) {
                return true;
              } else {
                ((fi) ((hl) this).field_k).a(param6, param0, param2, (hl) this, param5, param1, (byte) -124);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param3 > -14) {
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final static boolean a(le param0, int param1) {
        if (param1 != -1) {
            le var3 = (le) null;
            boolean discarded$0 = hl.a((le) null, -15);
            return param0.b((byte) -127);
        }
        return param0.b((byte) -127);
    }

    hl(String param0, pl param1) {
        this(param0, pj.field_a.field_i, param1);
    }

    final boolean d(int param0) {
        if (param0 <= 44) {
            ((hl) this).field_A = false;
            return ((hl) this).field_z;
        }
        return ((hl) this).field_z;
    }

    void a(int param0, int param1, lk param2, int param3) {
        this.a(param0, param1, param2, param3);
        if (((hl) this).field_x == 0) {
            return;
        }
        if (k.field_c == ((hl) this).field_x) {
            return;
        }
        if (!((hl) this).a(-47, param1, ij.field_e, eg.field_b, param0)) {
            ((hl) this).a(false, param2, eg.field_b, param1, param0, ij.field_e);
            return;
        }
        if (-1 != (k.field_c ^ -1)) {
            ((hl) this).a(false, param2, eg.field_b, param1, param0, ij.field_e);
            return;
        }
        ((hl) this).a(-param0 + ij.field_e, true, ((hl) this).field_x, -param1 + eg.field_b);
        ((hl) this).a(false, param2, eg.field_b, param1, param0, ij.field_e);
    }

    boolean a(int param0, lk param1) {
        if (((hl) this).field_B) {
          if (((hl) this).field_A) {
            param1.c((byte) 31);
            ((hl) this).field_z = true;
            if (((hl) this).field_k != null) {
              if (((hl) this).field_k instanceof nj) {
                ((nj) ((hl) this).field_k).a(62, ((hl) this).field_z, (lk) this);
                if (param0 <= 71) {
                  ((hl) this).field_z = true;
                  return true;
                } else {
                  return true;
                }
              } else {
                if (param0 <= 71) {
                  ((hl) this).field_z = true;
                  return true;
                } else {
                  return true;
                }
              }
            } else {
              if (param0 <= 71) {
                ((hl) this).field_z = true;
                return true;
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

    hl(String param0, ci param1, pl param2) {
        super(param0, param1, param2);
        ((hl) this).field_z = false;
        ((hl) this).field_A = true;
        ((hl) this).field_B = true;
    }

    final void c(byte param0) {
        if (param0 > 27) {
          if (((hl) this).field_z) {
            ((hl) this).field_z = false;
            if (null != ((hl) this).field_k) {
              if (((hl) this).field_k instanceof nj) {
                ((nj) ((hl) this).field_k).a(81, ((hl) this).field_z, (lk) this);
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
          return;
        }
    }

    final void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
          if (((hl) this).field_k != null) {
            if (!(((hl) this).field_k instanceof fi)) {
              ((hl) this).field_x = 0;
              return;
            } else {
              ((fi) ((hl) this).field_k).a(param4, -32051, param5, (hl) this, param3, param2);
              ((hl) this).field_x = 0;
              return;
            }
          } else {
            ((hl) this).field_x = 0;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(char param0, byte param1, int param2, lk param3) {
        qk var6 = null;
        if (((hl) this).d(123)) {
          if (-85 != (param2 ^ -1)) {
            if ((param2 ^ -1) != -84) {
              if (param1 >= -99) {
                var6 = (qk) null;
                kc[] discarded$4 = hl.a((qk) null, -100, -63, -51);
                return false;
              } else {
                return false;
              }
            } else {
              ((hl) this).a(-1, true, 1, -1);
              return true;
            }
          } else {
            ((hl) this).a(-1, true, 1, -1);
            return true;
          }
        } else {
          if (param1 >= -99) {
            var6 = (qk) null;
            kc[] discarded$5 = hl.a((qk) null, -100, -63, -51);
            return false;
          } else {
            return false;
          }
        }
    }

    public static void d(byte param0) {
        field_C = null;
        field_y = null;
        if (param0 > -33) {
            hl.d((byte) -15);
        }
    }

    final StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        if (!param1) {
          if (((hl) this).a(param3, param2, param1, param0)) {
            ((hl) this).a(param0, (byte) -16, param3, param2);
            if (!((hl) this).field_D) {
              if (((hl) this).field_B) {
                return param3;
              } else {
                StringBuilder discarded$25 = param3.append(" disabled");
                return param3;
              }
            } else {
              L0: {
                StringBuilder discarded$26 = param3.append(" active");
                if (!((hl) this).field_B) {
                  StringBuilder discarded$27 = param3.append(" disabled");
                  break L0;
                } else {
                  break L0;
                }
              }
              return param3;
            }
          } else {
            return param3;
          }
        } else {
          ((hl) this).field_z = false;
          if (((hl) this).a(param3, param2, param1, param0)) {
            ((hl) this).a(param0, (byte) -16, param3, param2);
            if (((hl) this).field_D) {
              StringBuilder discarded$28 = param3.append(" active");
              if (((hl) this).field_B) {
                return param3;
              } else {
                StringBuilder discarded$29 = param3.append(" disabled");
                return param3;
              }
            } else {
              L1: {
                if (!((hl) this).field_B) {
                  StringBuilder discarded$30 = param3.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
              return param3;
            }
          } else {
            return param3;
          }
        }
    }

    void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
          if (((hl) this).field_k != null) {
            if (!(((hl) this).field_k instanceof qh)) {
              return;
            } else {
              ((qh) ((hl) this).field_k).a(param0, 23, param2, (hl) this, param3);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static kc[] a(qk param0, int param1, int param2, int param3) {
        int var4 = 0;
        var4 = 57 / ((param1 - 0) / 50);
        if (!tc.a(param3, param2, 25479, param0)) {
          return null;
        } else {
          return pf.a(111);
        }
    }

    protected hl() {
        ((hl) this).field_z = false;
        ((hl) this).field_A = true;
        ((hl) this).field_B = true;
        ((hl) this).field_v = pj.field_a.field_n;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Passwords can only contain letters and numbers";
    }
}
