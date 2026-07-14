/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wp extends pk {
    int field_B;
    static String field_A;
    private boolean field_y;
    private boolean field_D;
    boolean field_C;
    static boolean[] field_z;
    boolean field_x;

    boolean a(pk param0, byte param1) {
        if (((wp) this).field_x) {
          if (((wp) this).field_y) {
            param0.c((byte) 122);
            if (param1 == 61) {
              ((wp) this).field_D = true;
              if (((wp) this).field_o != null) {
                if (!(((wp) this).field_o instanceof fc)) {
                  return true;
                } else {
                  ((fc) (Object) ((wp) this).field_o).a(((wp) this).field_D, (pk) this, -112);
                  return true;
                }
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

    final void c(byte param0) {
        int var2 = 0;
        var2 = 61 / ((param0 - 64) / 51);
        if (((wp) this).field_D) {
          ((wp) this).field_D = false;
          if (null != ((wp) this).field_o) {
            if (((wp) this).field_o instanceof fc) {
              ((fc) (Object) ((wp) this).field_o).a(((wp) this).field_D, (pk) this, -76);
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
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        if (param2 >= 9) {
          if (((wp) this).d(-1)) {
            if ((param3 ^ -1) != -85) {
              if ((param3 ^ -1) != -84) {
                return false;
              } else {
                ((wp) this).b(1, -1, true, -1);
                return true;
              }
            } else {
              ((wp) this).b(1, -1, true, -1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((wp) this).c((byte) -47);
          if (((wp) this).d(-1)) {
            if ((param3 ^ -1) != -85) {
              if ((param3 ^ -1) != -84) {
                return false;
              } else {
                ((wp) this).b(1, -1, true, -1);
                return true;
              }
            } else {
              ((wp) this).b(1, -1, true, -1);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    wp(int param0, int param1, int param2, int param3, mh param4, qm param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((wp) this).field_D = false;
        ((wp) this).field_B = 0;
        ((wp) this).field_y = true;
        ((wp) this).field_x = true;
    }

    final static f a(fr param0, int param1, int param2, byte[] param3, boolean param4, int param5, int param6, int param7) {
        L0: {
          if (param6 > 105) {
            break L0;
          } else {
            wp.a((byte) 46);
            break L0;
          }
        }
        if (!param0.field_Cc) {
          if (rm.a(param2, -105)) {
            if (!rm.a(param1, -103)) {
              if (!param0.field_C) {
                return new f(param0, param5, param2, param1, hn.a(false, param2), hn.a(false, param1), param3, param7);
              } else {
                return new f(param0, 34037, param5, param2, param1, param4, param3, param7);
              }
            } else {
              return new f(param0, 3553, param5, param2, param1, param4, param3, param7);
            }
          } else {
            if (!param0.field_C) {
              return new f(param0, param5, param2, param1, hn.a(false, param2), hn.a(false, param1), param3, param7);
            } else {
              return new f(param0, 34037, param5, param2, param1, param4, param3, param7);
            }
          }
        } else {
          return new f(param0, 3553, param5, param2, param1, param4, param3, param7);
        }
    }

    wp(String param0, qm param1) {
        this(param0, ks.field_x.field_h, param1);
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (!param1) {
          if (null != ((wp) this).field_o) {
            if (!(((wp) this).field_o instanceof wu)) {
              ((wp) this).field_l = 0;
              return;
            } else {
              ((wu) (Object) ((wp) this).field_o).a(param5, param2, param3, param4, (wp) this, -21726);
              ((wp) this).field_l = 0;
              return;
            }
          } else {
            ((wp) this).field_l = 0;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        Object var9 = null;
        if (param1 <= -42) {
          if (((wp) this).field_x) {
            if (((wp) this).b(param5, -1, param4, param2, param6)) {
              boolean discarded$3 = ((wp) this).a(param0, (byte) 61);
              ((wp) this).field_l = param3;
              if (null != ((wp) this).field_o) {
                if (!(((wp) this).field_o instanceof wu)) {
                  return true;
                } else {
                  ((wu) (Object) ((wp) this).field_o).a(param5, param3, param4, (wp) this, param2, param6, false);
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
          var9 = null;
          boolean discarded$4 = ((wp) this).a((pk) null, 108, 43, 75, 47, -24, -60);
          if (((wp) this).field_x) {
            if (((wp) this).b(param5, -1, param4, param2, param6)) {
              boolean discarded$5 = ((wp) this).a(param0, (byte) 61);
              ((wp) this).field_l = param3;
              if (null == ((wp) this).field_o) {
                return true;
              } else {
                L0: {
                  if (((wp) this).field_o instanceof wu) {
                    ((wu) (Object) ((wp) this).field_o).a(param5, param3, param4, (wp) this, param2, param6, false);
                    break L0;
                  } else {
                    break L0;
                  }
                }
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

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (((wp) this).a(param0, param1, -121, param2)) {
          ((wp) this).a(param0, (byte) -128, param2, param1);
          if (!((wp) this).field_C) {
            if (((wp) this).field_x) {
              if (param3 != 0) {
                ((wp) this).field_B = 96;
                return param2;
              } else {
                return param2;
              }
            } else {
              StringBuilder discarded$19 = param2.append(" disabled");
              if (param3 != 0) {
                ((wp) this).field_B = 96;
                return param2;
              } else {
                return param2;
              }
            }
          } else {
            StringBuilder discarded$20 = param2.append(" active");
            if (!((wp) this).field_x) {
              StringBuilder discarded$21 = param2.append(" disabled");
              if (param3 != 0) {
                ((wp) this).field_B = 96;
                return param2;
              } else {
                return param2;
              }
            } else {
              if (param3 != 0) {
                ((wp) this).field_B = 96;
                return param2;
              } else {
                return param2;
              }
            }
          }
        } else {
          if (param3 != 0) {
            ((wp) this).field_B = 96;
            return param2;
          } else {
            return param2;
          }
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5 = 0;
        var5 = -37 % ((-25 - param1) / 45);
        super.a(param0, 49, param2, param3);
        ((wp) this).field_B = 0;
        if (((wp) this).field_l != 0) {
          if (((wp) this).field_l != ar.field_G) {
            if (((wp) this).b(ko.field_p, -1, param0, pi.field_e, param3)) {
              if (0 == ar.field_G) {
                ((wp) this).b(((wp) this).field_l, ko.field_p - param0, true, pi.field_e - param3);
                ((wp) this).a(param2, false, param0, pi.field_e, ko.field_p, param3);
                return;
              } else {
                ((wp) this).a(param2, false, param0, pi.field_e, ko.field_p, param3);
                return;
              }
            } else {
              ((wp) this).a(param2, false, param0, pi.field_e, ko.field_p, param3);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_z = null;
        field_A = null;
        int var1 = 124 % ((param0 - -16) / 53);
    }

    wp(String param0, mh param1, qm param2) {
        super(param0, param1, param2);
        ((wp) this).field_D = false;
        ((wp) this).field_B = 0;
        ((wp) this).field_y = true;
        ((wp) this).field_x = true;
    }

    final boolean d(int param0) {
        if (param0 != -1) {
            ((wp) this).field_x = false;
            return ((wp) this).field_D;
        }
        return ((wp) this).field_D;
    }

    void b(int param0, int param1, boolean param2, int param3) {
        L0: {
          ((wp) this).field_B = param0;
          if (((wp) this).field_o == null) {
            break L0;
          } else {
            if (((wp) this).field_o instanceof ai) {
              ((ai) (Object) ((wp) this).field_o).a(param0, 710, (wp) this, param1, param3);
              break L0;
            } else {
              if (param2) {
                return;
              } else {
                ((wp) this).field_y = true;
                return;
              }
            }
          }
        }
        if (!param2) {
          ((wp) this).field_y = true;
          return;
        } else {
          return;
        }
    }

    public wp() {
        ((wp) this).field_D = false;
        ((wp) this).field_B = 0;
        ((wp) this).field_y = true;
        ((wp) this).field_x = true;
        ((wp) this).field_w = ks.field_x.field_n;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Return to main menu";
        field_z = new boolean[64];
    }
}
