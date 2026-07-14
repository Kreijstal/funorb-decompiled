/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class oa extends lh {
    static wk[] field_U;
    static String field_R;
    static long field_P;
    static String field_O;
    static String field_H;
    private boolean field_L;
    boolean field_K;
    static String[] field_J;
    static wk field_N;
    static int field_S;
    private boolean field_I;
    boolean field_T;
    static int[] field_M;
    static long field_G;
    static wk[] field_Q;

    public static void a(byte param0) {
        field_J = null;
        field_O = null;
        field_N = null;
        field_M = null;
        if (param0 != -105) {
          field_R = null;
          field_Q = null;
          field_R = null;
          field_U = null;
          field_H = null;
          return;
        } else {
          field_Q = null;
          field_R = null;
          field_U = null;
          field_H = null;
          return;
        }
    }

    final boolean d(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((oa) this).a(4, -27, (lh) null, -86);
            return ((oa) this).field_I;
        }
        return ((oa) this).field_I;
    }

    boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        if (((oa) this).field_K) {
          if (((oa) this).a(param0, param4, (byte) 81, param3, param2)) {
            boolean discarded$2 = ((oa) this).a(1, param1);
            ((oa) this).field_w = param6;
            if (null != ((oa) this).field_A) {
              if (!(((oa) this).field_A instanceof gn)) {
                return true;
              } else {
                ((gn) (Object) ((oa) this).field_A).a(param6, param0, param2, 13030, param4, param3, (oa) this);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (!param5) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          if (!param5) {
            return true;
          } else {
            return false;
          }
        }
    }

    final static void a(String param0, byte param1) {
        on.field_k = param0;
        if (param1 != -107) {
            Object var3 = null;
            oa.a((String) null, (byte) 82);
        }
    }

    oa(String param0, tn param1) {
        this(param0, ad.field_j.field_f, param1);
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        Object var6 = null;
        if (param2 < -104) {
          if (((oa) this).a(param1, (byte) -91, param3, param0)) {
            ((oa) this).a(param3, param0, false, param1);
            if (!((oa) this).field_T) {
              if (((oa) this).field_K) {
                return param1;
              } else {
                StringBuilder discarded$7 = param1.append(" disabled");
                return param1;
              }
            } else {
              L0: {
                StringBuilder discarded$8 = param1.append(" active");
                if (!((oa) this).field_K) {
                  StringBuilder discarded$9 = param1.append(" disabled");
                  break L0;
                } else {
                  break L0;
                }
              }
              return param1;
            }
          } else {
            return param1;
          }
        } else {
          var6 = null;
          StringBuilder discarded$10 = ((oa) this).a((Hashtable) null, (StringBuilder) null, (byte) -122, 29);
          if (((oa) this).a(param1, (byte) -91, param3, param0)) {
            ((oa) this).a(param3, param0, false, param1);
            if (!((oa) this).field_T) {
              L1: {
                if (!((oa) this).field_K) {
                  StringBuilder discarded$11 = param1.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
              return param1;
            } else {
              L2: {
                StringBuilder discarded$12 = param1.append(" active");
                if (!((oa) this).field_K) {
                  StringBuilder discarded$13 = param1.append(" disabled");
                  break L2;
                } else {
                  break L2;
                }
              }
              return param1;
            }
          } else {
            return param1;
          }
        }
    }

    void b(int param0, byte param1, int param2, int param3) {
        if (param1 <= -122) {
          if (((oa) this).field_A != null) {
            if (!(((oa) this).field_A instanceof ae)) {
              return;
            } else {
              ((ae) (Object) ((oa) this).field_A).a(param2, (byte) -23, param0, (oa) this, param3);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void d(byte param0) {
        if (param0 == -45) {
          if (((oa) this).field_I) {
            ((oa) this).field_I = false;
            if (((oa) this).field_A != null) {
              if (!(((oa) this).field_A instanceof j)) {
                return;
              } else {
                ((j) (Object) ((oa) this).field_A).a(((oa) this).field_I, (byte) 7, (lh) this);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((oa) this).d((byte) -34);
          if (((oa) this).field_I) {
            ((oa) this).field_I = false;
            if (((oa) this).field_A != null) {
              if (!(((oa) this).field_A instanceof j)) {
                return;
              } else {
                ((j) (Object) ((oa) this).field_A).a(((oa) this).field_I, (byte) 7, (lh) this);
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

    oa(String param0, qk param1, tn param2) {
        super(param0, param1, param2);
        ((oa) this).field_K = true;
        ((oa) this).field_I = false;
        ((oa) this).field_L = true;
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        if (((oa) this).d(param0 ^ param0)) {
          if (param1 != 84) {
            if (param1 != 83) {
              return false;
            } else {
              ((oa) this).b(1, (byte) -125, -1, -1);
              return true;
            }
          } else {
            ((oa) this).b(1, (byte) -125, -1, -1);
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 == -4278) {
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_M = null;
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        int var7 = 0;
        if (null != ((oa) this).field_A) {
          if (!(((oa) this).field_A instanceof gn)) {
            ((oa) this).field_w = 0;
            var7 = 88 % ((36 - param0) / 32);
            return;
          } else {
            ((gn) (Object) ((oa) this).field_A).a(param3, param2, param1, (oa) this, param5, 19870);
            ((oa) this).field_w = 0;
            var7 = 88 % ((36 - param0) / 32);
            return;
          }
        } else {
          ((oa) this).field_w = 0;
          var7 = 88 % ((36 - param0) / 32);
          return;
        }
    }

    final static boolean a(int param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (0 != param0) {
          if (!param1) {
            return false;
          } else {
            L0: {
              if (-1 == (1 << param0 & ln.field_a)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static void f(int param0) {
        rh.a(false);
        jb.c((byte) -70);
        n.field_x = null;
        ke.a(2);
        if (param0 != -12161) {
            oa.f(-6);
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        if (param1 > 56) {
          super.a(param0, 87, param2, param3);
          if (((oa) this).field_w != 0) {
            if (nc.field_d != ((oa) this).field_w) {
              if (!((oa) this).a(pi.field_c, param3, (byte) 81, oh.field_f, param0)) {
                ((oa) this).a((byte) -14, oh.field_f, param3, param0, param2, pi.field_c);
                return;
              } else {
                if (nc.field_d == 0) {
                  ((oa) this).b(((oa) this).field_w, (byte) -123, oh.field_f + -param0, -param3 + pi.field_c);
                  ((oa) this).a((byte) -14, oh.field_f, param3, param0, param2, pi.field_c);
                  return;
                } else {
                  ((oa) this).a((byte) -14, oh.field_f, param3, param0, param2, pi.field_c);
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
          return;
        }
    }

    boolean a(int param0, lh param1) {
        if (((oa) this).field_K) {
          if (((oa) this).field_L) {
            param1.d((byte) -45);
            if (param0 == 1) {
              ((oa) this).field_I = true;
              if (null != ((oa) this).field_A) {
                if (!(((oa) this).field_A instanceof j)) {
                  return true;
                } else {
                  ((j) (Object) ((oa) this).field_A).a(((oa) this).field_I, (byte) 7, (lh) this);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              boolean discarded$2 = oa.a(-72, true);
              ((oa) this).field_I = true;
              if (null != ((oa) this).field_A) {
                if (!(((oa) this).field_A instanceof j)) {
                  return true;
                } else {
                  ((j) (Object) ((oa) this).field_A).a(((oa) this).field_I, (byte) 7, (lh) this);
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

    protected oa() {
        ((oa) this).field_K = true;
        ((oa) this).field_I = false;
        ((oa) this).field_L = true;
        ((oa) this).field_p = ad.field_j.field_u;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<br><br>Close-combat attack: <col=ffffff><%0></col>";
        field_J = new String[16];
        field_O = "Tags from Unrated games are not recorded.";
        field_S = 0;
        field_R = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
