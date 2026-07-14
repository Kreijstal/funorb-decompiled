/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fw extends kb {
    boolean field_I;
    static int field_C;
    static int[] field_J;
    private boolean field_D;
    static String field_H;
    int field_G;
    static kl field_F;
    private boolean field_E;
    boolean field_K;

    final static void a(int param0, String[] param1) {
        L0: {
          if (null != ga.field_g) {
            ga.field_g.field_T.a(100, param1);
            break L0;
          } else {
            break L0;
          }
        }
        if (null == tj.field_C) {
          if (param0 != -1) {
            fw.i(-98);
            return;
          } else {
            return;
          }
        } else {
          tj.field_C.field_M.a(100, param1);
          if (param0 == -1) {
            return;
          } else {
            fw.i(-98);
            return;
          }
        }
    }

    boolean a(int param0, kb param1) {
        if (((fw) this).field_I) {
          if (((fw) this).field_D) {
            if (param0 == 11) {
              param1.f(1);
              ((fw) this).field_E = true;
              if (((fw) this).field_x != null) {
                if (!(((fw) this).field_x instanceof ie)) {
                  return true;
                } else {
                  ((ie) (Object) ((fw) this).field_x).a((kb) this, ((fw) this).field_E, (byte) -41);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              field_C = 102;
              param1.f(1);
              ((fw) this).field_E = true;
              if (((fw) this).field_x != null) {
                if (!(((fw) this).field_x instanceof ie)) {
                  return true;
                } else {
                  ((ie) (Object) ((fw) this).field_x).a((kb) this, ((fw) this).field_E, (byte) -41);
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

    void a(int param0, int param1, int param2, kb param3) {
        this.a(param0 + 0, param1, param2, param3);
        ((fw) this).field_G = 0;
        if (param0 == 32722) {
          if (((fw) this).field_q != 0) {
            if (((fw) this).field_q != ro.field_ub) {
              if (!((fw) this).b(param0 + -32721, param1, ko.field_b, sm.field_d, param2)) {
                ((fw) this).a(param2, param3, sm.field_d, (byte) -118, ko.field_b, param1);
                return;
              } else {
                if (-1 == (ro.field_ub ^ -1)) {
                  ((fw) this).a(((fw) this).field_q, sm.field_d - param1, ko.field_b - param2, true);
                  ((fw) this).a(param2, param3, sm.field_d, (byte) -118, ko.field_b, param1);
                  return;
                } else {
                  ((fw) this).a(param2, param3, sm.field_d, (byte) -118, ko.field_b, param1);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_C = -124;
          if (((fw) this).field_q != 0) {
            L0: {
              if (((fw) this).field_q != ro.field_ub) {
                if (!((fw) this).b(param0 + -32721, param1, ko.field_b, sm.field_d, param2)) {
                  ((fw) this).a(param2, param3, sm.field_d, (byte) -118, ko.field_b, param1);
                  return;
                } else {
                  if (-1 == (ro.field_ub ^ -1)) {
                    ((fw) this).a(((fw) this).field_q, sm.field_d - param1, ko.field_b - param2, true);
                    ((fw) this).a(param2, param3, sm.field_d, (byte) -118, ko.field_b, param1);
                    break L0;
                  } else {
                    ((fw) this).a(param2, param3, sm.field_d, (byte) -118, ko.field_b, param1);
                    return;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    fw(String param0, qo param1) {
        this(param0, t.field_c.field_j, param1);
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        if (!((fw) this).a(false)) {
          if (param3 != -12215) {
            field_F = null;
            return false;
          } else {
            return false;
          }
        } else {
          if (84 != param1) {
            if ((param1 ^ -1) != -84) {
              if (param3 != -12215) {
                field_F = null;
                return false;
              } else {
                return false;
              }
            } else {
              ((fw) this).a(1, -1, -1, true);
              return true;
            }
          } else {
            ((fw) this).a(1, -1, -1, true);
            return true;
          }
        }
    }

    public static void i(int param0) {
        field_H = null;
        field_J = null;
        if (param0 != 0) {
            return;
        }
        field_F = null;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        L0: {
          if (!((fw) this).a(param3, param0, (byte) 106, param1)) {
            break L0;
          } else {
            ((fw) this).a(param0, param3, true, param1);
            if (!((fw) this).field_K) {
              if (!((fw) this).field_I) {
                StringBuilder discarded$21 = param1.append(" disabled");
                break L0;
              } else {
                if (param2 == 26477) {
                  return param1;
                } else {
                  boolean discarded$22 = ((fw) this).a(true);
                  return param1;
                }
              }
            } else {
              L1: {
                StringBuilder discarded$23 = param1.append(" active");
                if (!((fw) this).field_I) {
                  StringBuilder discarded$24 = param1.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param2 == 26477) {
                return param1;
              } else {
                boolean discarded$25 = ((fw) this).a(true);
                return param1;
              }
            }
          }
        }
        if (param2 != 26477) {
          boolean discarded$26 = ((fw) this).a(true);
          return param1;
        } else {
          return param1;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return ((fw) this).field_E;
    }

    void a(int param0, int param1, int param2, boolean param3) {
        ((fw) this).field_G = param0;
        if (param3) {
          if (null != ((fw) this).field_x) {
            if (!(((fw) this).field_x instanceof he)) {
              return;
            } else {
              ((he) (Object) ((fw) this).field_x).a(param1, 11, param0, param2, (fw) this);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    fw(String param0, kh param1, qo param2) {
        super(param0, param1, param2);
        ((fw) this).field_I = true;
        ((fw) this).field_D = true;
        ((fw) this).field_E = false;
        ((fw) this).field_G = 0;
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        int var7 = 0;
        if (((fw) this).field_x != null) {
          if (!(((fw) this).field_x instanceof qe)) {
            var7 = -87 % ((param3 - -58) / 53);
            ((fw) this).field_q = 0;
            return;
          } else {
            ((qe) (Object) ((fw) this).field_x).a(-110, param4, (fw) this, param5, param0, param2);
            var7 = -87 % ((param3 - -58) / 53);
            ((fw) this).field_q = 0;
            return;
          }
        } else {
          var7 = -87 % ((param3 - -58) / 53);
          ((fw) this).field_q = 0;
          return;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        Object var9 = null;
        if (((fw) this).field_I) {
          if (((fw) this).b(1, param1, param5, param0, param2)) {
            boolean discarded$3 = ((fw) this).a(11, param4);
            ((fw) this).field_q = param6;
            if (null != ((fw) this).field_x) {
              if (!(((fw) this).field_x instanceof qe)) {
                return true;
              } else {
                ((qe) (Object) ((fw) this).field_x).a((fw) this, param2, param1, param0, param5, param6, (byte) 110);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param3 <= 103) {
              var9 = null;
              boolean discarded$4 = ((fw) this).a(67, -21, 92, 52, (kb) null, -105, -128);
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (param3 <= 103) {
            var9 = null;
            boolean discarded$5 = ((fw) this).a(67, -21, 92, 52, (kb) null, -105, -128);
            return false;
          } else {
            return false;
          }
        }
    }

    fw(int param0, int param1, int param2, int param3, kh param4, qo param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((fw) this).field_I = true;
        ((fw) this).field_D = true;
        ((fw) this).field_E = false;
        ((fw) this).field_G = 0;
    }

    final void f(int param0) {
        Object var3 = null;
        if (((fw) this).field_E) {
          ((fw) this).field_E = false;
          if (null != ((fw) this).field_x) {
            if (!(((fw) this).field_x instanceof ie)) {
              if (param0 != 1) {
                var3 = null;
                StringBuilder discarded$4 = ((fw) this).a(78, (StringBuilder) null, 126, (Hashtable) null);
                return;
              } else {
                return;
              }
            } else {
              ((ie) (Object) ((fw) this).field_x).a((kb) this, ((fw) this).field_E, (byte) -41);
              if (param0 != 1) {
                var3 = null;
                StringBuilder discarded$5 = ((fw) this).a(78, (StringBuilder) null, 126, (Hashtable) null);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 1) {
              var3 = null;
              StringBuilder discarded$6 = ((fw) this).a(78, (StringBuilder) null, 126, (Hashtable) null);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 1) {
            var3 = null;
            StringBuilder discarded$7 = ((fw) this).a(78, (StringBuilder) null, 126, (Hashtable) null);
            return;
          } else {
            return;
          }
        }
    }

    public fw() {
        ((fw) this).field_I = true;
        ((fw) this).field_D = true;
        ((fw) this).field_E = false;
        ((fw) this).field_G = 0;
        ((fw) this).field_k = t.field_c.field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Average rating";
    }
}
