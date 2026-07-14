/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ng extends ee {
    static cf field_A;
    boolean field_F;
    private boolean field_B;
    boolean field_D;
    private boolean field_M;
    static String field_E;
    static p field_C;
    private static int[] field_N;
    static int field_I;
    private static int[] field_G;
    static int[] field_H;
    static ka[] field_L;
    static int[] field_K;
    static String field_J;

    boolean a(ee param0, int param1) {
        if (param1 == 0) {
          if (((ng) this).field_F) {
            if (((ng) this).field_M) {
              param0.d(6064);
              ((ng) this).field_B = true;
              if (((ng) this).field_k != null) {
                if (!(((ng) this).field_k instanceof mk)) {
                  return true;
                } else {
                  ((mk) (Object) ((ng) this).field_k).a((ee) this, ((ng) this).field_B, (byte) -74);
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
          ((ng) this).a(24, 47, -94, 79);
          if (((ng) this).field_F) {
            if (((ng) this).field_M) {
              param0.d(6064);
              ((ng) this).field_B = true;
              if (((ng) this).field_k != null) {
                if (!(((ng) this).field_k instanceof mk)) {
                  return true;
                } else {
                  ((mk) (Object) ((ng) this).field_k).a((ee) this, ((ng) this).field_B, (byte) -74);
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

    boolean a(int param0, char param1, byte param2, ee param3) {
        if (param2 > 9) {
          if (((ng) this).c(86)) {
            if ((param0 ^ -1) != -85) {
              if ((param0 ^ -1) != -84) {
                return false;
              } else {
                ((ng) this).a(-1, -13461, -1, 1);
                return true;
              }
            } else {
              ((ng) this).a(-1, -13461, -1, 1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    ng(String param0, gg param1) {
        this(param0, kl.field_e.field_f, param1);
    }

    final boolean c(int param0) {
        Object var3 = null;
        if (param0 <= 76) {
          var3 = null;
          boolean discarded$2 = ((ng) this).a(54, -80, 117, 118, -114, 23, (ee) null);
          return ((ng) this).field_B;
        } else {
          return ((ng) this).field_B;
        }
    }

    void a(ee param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -112, param3);
        if (param2 >= -97) {
            return;
        }
        if (-1 == (((ng) this).field_z ^ -1)) {
            return;
        }
        if (((ng) this).field_z == wh.field_e) {
            return;
        }
        if (!((ng) this).a(ph.field_d, kc.field_u, param3, -29991, param1)) {
            ((ng) this).a(param3, (byte) 119, param0, param1, kc.field_u, ph.field_d);
            return;
        }
        if (wh.field_e != 0) {
            ((ng) this).a(param3, (byte) 119, param0, param1, kc.field_u, ph.field_d);
            return;
        }
        ((ng) this).a(-param3 + ph.field_d, -13461, kc.field_u + -param1, ((ng) this).field_z);
        ((ng) this).a(param3, (byte) 119, param0, param1, kc.field_u, ph.field_d);
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        if (param2 == -81) {
          if (((ng) this).field_F) {
            if (((ng) this).a(param0, param1, param3, -29991, param4)) {
              boolean discarded$3 = ((ng) this).a(param6, 0);
              ((ng) this).field_z = param5;
              if (null != ((ng) this).field_k) {
                if (!(((ng) this).field_k instanceof pb)) {
                  return true;
                } else {
                  ((pb) (Object) ((ng) this).field_k).a(param3, param1, (byte) -1, param0, (ng) this, param4, param5);
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
          boolean discarded$4 = ((ng) this).c(43);
          if (((ng) this).field_F) {
            if (((ng) this).a(param0, param1, param3, -29991, param4)) {
              boolean discarded$5 = ((ng) this).a(param6, 0);
              ((ng) this).field_z = param5;
              if (null != ((ng) this).field_k) {
                if (((ng) this).field_k instanceof pb) {
                  ((pb) (Object) ((ng) this).field_k).a(param3, param1, (byte) -1, param0, (ng) this, param4, param5);
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

    final void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        int var7 = 0;
        if (null != ((ng) this).field_k) {
          if (!(((ng) this).field_k instanceof pb)) {
            ((ng) this).field_z = 0;
            var7 = 94 / ((-29 - param1) / 39);
            return;
          } else {
            ((pb) (Object) ((ng) this).field_k).a(param5, true, param4, (ng) this, param3, param0);
            ((ng) this).field_z = 0;
            var7 = 94 / ((-29 - param1) / 39);
            return;
          }
        } else {
          ((ng) this).field_z = 0;
          var7 = 94 / ((-29 - param1) / 39);
          return;
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        if (param3) {
          if (((ng) this).a(param0, param1, -126, param2)) {
            L0: {
              ((ng) this).a(param2, -125, param0, param1);
              if (((ng) this).field_D) {
                StringBuilder discarded$8 = param2.append(" active");
                break L0;
              } else {
                break L0;
              }
            }
            if (((ng) this).field_F) {
              return param2;
            } else {
              StringBuilder discarded$9 = param2.append(" disabled");
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          field_I = 125;
          if (((ng) this).a(param0, param1, -126, param2)) {
            L1: {
              ((ng) this).a(param2, -125, param0, param1);
              if (((ng) this).field_D) {
                StringBuilder discarded$10 = param2.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (((ng) this).field_F) {
              return param2;
            } else {
              StringBuilder discarded$11 = param2.append(" disabled");
              return param2;
            }
          } else {
            return param2;
          }
        }
    }

    ng(String param0, j param1, gg param2) {
        super(param0, param1, param2);
        ((ng) this).field_F = true;
        ((ng) this).field_B = false;
        ((ng) this).field_M = true;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 == -13461) {
          if (((ng) this).field_k != null) {
            if (!(((ng) this).field_k instanceof sg)) {
              return;
            } else {
              ((sg) (Object) ((ng) this).field_k).a((ng) this, param2, param0, param3, false);
              return;
            }
          } else {
            return;
          }
        } else {
          field_N = null;
          if (((ng) this).field_k == null) {
            return;
          } else {
            L0: {
              if (((ng) this).field_k instanceof sg) {
                ((sg) (Object) ((ng) this).field_k).a((ng) this, param2, param0, param3, false);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final void d(int param0) {
        if (param0 == 6064) {
          if (((ng) this).field_B) {
            ((ng) this).field_B = false;
            if (((ng) this).field_k != null) {
              if (!(((ng) this).field_k instanceof mk)) {
                return;
              } else {
                ((mk) (Object) ((ng) this).field_k).a((ee) this, ((ng) this).field_B, (byte) -54);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ng.c(true);
          if (((ng) this).field_B) {
            ((ng) this).field_B = false;
            if (((ng) this).field_k != null) {
              if (!(((ng) this).field_k instanceof mk)) {
                return;
              } else {
                ((mk) (Object) ((ng) this).field_k).a((ee) this, ((ng) this).field_B, (byte) -54);
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

    public static void c(boolean param0) {
        field_J = null;
        field_N = null;
        field_G = null;
        field_L = null;
        if (!param0) {
          return;
        } else {
          field_A = null;
          field_H = null;
          field_C = null;
          field_E = null;
          field_K = null;
          return;
        }
    }

    protected ng() {
        ((ng) this).field_F = true;
        ((ng) this).field_B = false;
        ((ng) this).field_M = true;
        ((ng) this).field_q = kl.field_e.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new cf();
        field_E = "Names cannot start or end with space or underscore";
        field_C = new p();
        field_G = new int[]{127, 127, 127, 127, 127, 127};
        field_N = new int[]{255, 255, 255, 255, 255, 255};
        field_H = new int[]{-field_G[0] + field_N[0] >> 1927247329, field_N[1] + -field_G[1] >> -1016999295, -field_G[2] + field_N[2] >> -1048468479, field_N[3] + -field_G[3] >> 793891553, -field_G[4] + field_N[4] >> -85764159, -field_G[5] + field_N[5] >> -817916991};
        field_J = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_K = new int[]{field_G[0] + field_N[0] >> 1938209985, field_N[1] + field_G[1] >> 2026154113, field_N[2] + field_G[2] >> -887839615, field_N[3] + field_G[3] >> -1815442367, field_G[4] + field_N[4] >> -99175775, field_G[5] + field_N[5] >> -1946388255};
    }
}
