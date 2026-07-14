/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ig extends rj {
    private boolean field_A;
    static String field_C;
    boolean field_E;
    boolean field_z;
    static int field_D;
    private boolean field_B;
    static int field_y;

    final StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        if (!param1) {
          if (((ig) this).a((byte) -125, param3, param2, param0)) {
            L0: {
              ((ig) this).a((byte) 117, param0, param2, param3);
              if (((ig) this).field_z) {
                StringBuilder discarded$4 = param2.append(" active");
                break L0;
              } else {
                break L0;
              }
            }
            if (((ig) this).field_E) {
              return param2;
            } else {
              StringBuilder discarded$5 = param2.append(" disabled");
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          ig.a(78);
          if (!((ig) this).a((byte) -125, param3, param2, param0)) {
            return param2;
          } else {
            L1: {
              ((ig) this).a((byte) 117, param0, param2, param3);
              if (((ig) this).field_z) {
                StringBuilder discarded$6 = param2.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!((ig) this).field_E) {
                StringBuilder discarded$7 = param2.append(" disabled");
                break L2;
              } else {
                break L2;
              }
            }
            return param2;
          }
        }
    }

    boolean a(int param0, int param1, char param2, rj param3) {
        Object var6 = null;
        if (param0 == 29657) {
          if (((ig) this).e(0)) {
            if (84 != param1) {
              if (83 != param1) {
                return false;
              } else {
                ((ig) this).a(-1, -1, 1, 108);
                return true;
              }
            } else {
              ((ig) this).a(-1, -1, 1, 108);
              return true;
            }
          } else {
            return false;
          }
        } else {
          var6 = null;
          boolean discarded$4 = ((ig) this).a(68, (rj) null);
          if (((ig) this).e(0)) {
            if (84 != param1) {
              if (83 != param1) {
                return false;
              } else {
                ((ig) this).a(-1, -1, 1, 108);
                return true;
              }
            } else {
              ((ig) this).a(-1, -1, 1, 108);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        int var7 = 0;
        var7 = -87 % ((param1 - -50) / 57);
        if (((ig) this).field_v != null) {
          if (!(((ig) this).field_v instanceof r)) {
            ((ig) this).field_o = 0;
            return;
          } else {
            ((r) (Object) ((ig) this).field_v).a(-6774, param5, (ig) this, param4, param0, param3);
            ((ig) this).field_o = 0;
            return;
          }
        } else {
          ((ig) this).field_o = 0;
          return;
        }
    }

    final void c(boolean param0) {
        Object var3 = null;
        ik stackIn_12_0 = null;
        ik stackIn_13_0 = null;
        ik stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ik stackOut_11_0 = null;
        ik stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ik stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        if (((ig) this).field_B) {
          ((ig) this).field_B = false;
          if (((ig) this).field_v != null) {
            L0: {
              if (!(((ig) this).field_v instanceof ik)) {
                break L0;
              } else {
                L1: {
                  stackOut_11_0 = (ik) (Object) ((ig) this).field_v;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (param0) {
                    stackOut_13_0 = (ik) (Object) stackIn_13_0;
                    stackOut_13_1 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L1;
                  } else {
                    stackOut_12_0 = (ik) (Object) stackIn_12_0;
                    stackOut_12_1 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    break L1;
                  }
                }
                ((ik) (Object) stackIn_14_0).a(stackIn_14_1 != 0, (rj) this, ((ig) this).field_B);
                break L0;
              }
            }
            if (!param0) {
              var3 = null;
              ((ig) this).a(-21, 2, (rj) null, 96, 23, 47);
              return;
            } else {
              return;
            }
          } else {
            if (!param0) {
              var3 = null;
              ((ig) this).a(-21, 2, (rj) null, 96, 23, 47);
              return;
            } else {
              return;
            }
          }
        } else {
          if (!param0) {
            var3 = null;
            ((ig) this).a(-21, 2, (rj) null, 96, 23, 47);
            return;
          } else {
            return;
          }
        }
    }

    boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        if (param5 > 24) {
          if (((ig) this).field_E) {
            if (((ig) this).a((byte) 126, param6, param3, param1, param4)) {
              boolean discarded$2 = ((ig) this).a(-2147483648, param0);
              ((ig) this).field_o = param2;
              if (null != ((ig) this).field_v) {
                if (!(((ig) this).field_v instanceof r)) {
                  return true;
                } else {
                  ((r) (Object) ((ig) this).field_v).a((ig) this, param3, (byte) -98, param4, param2, param1, param6);
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
          return false;
        }
    }

    ig(String param0, lf param1) {
        this(param0, n.field_i.field_b, param1);
    }

    public static void a(int param0) {
        if (param0 != -8278) {
            ig.a(-27);
            field_C = null;
            return;
        }
        field_C = null;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ((ig) this).field_B;
    }

    ig(String param0, uk param1, lf param2) {
        super(param0, param1, param2);
        ((ig) this).field_A = true;
        ((ig) this).field_B = false;
        ((ig) this).field_E = true;
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (null == ((ig) this).field_v) {
            break L0;
          } else {
            if (((ig) this).field_v instanceof oi) {
              ((oi) (Object) ((ig) this).field_v).a(param2, param0, (ig) this, false, param1);
              break L0;
            } else {
              if (param3 >= 39) {
                return;
              } else {
                ((ig) this).a(-95, -122, 120, 45);
                return;
              }
            }
          }
        }
        if (param3 < 39) {
          ((ig) this).a(-95, -122, 120, 45);
          return;
        } else {
          return;
        }
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        super.a(param0, param1, param2, param3);
        if (!param1) {
          if (((ig) this).field_o != 0) {
            if (fb.field_n != ((ig) this).field_o) {
              if (!((ig) this).a((byte) 126, param0, eb.field_a, ni.field_e, param2)) {
                ((ig) this).a(eb.field_a, -128, param3, param2, param0, ni.field_e);
                return;
              } else {
                if (fb.field_n == 0) {
                  ((ig) this).a(eb.field_a + -param0, ni.field_e - param2, ((ig) this).field_o, 119);
                  ((ig) this).a(eb.field_a, -128, param3, param2, param0, ni.field_e);
                  return;
                } else {
                  ((ig) this).a(eb.field_a, -128, param3, param2, param0, ni.field_e);
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
          ((ig) this).field_E = false;
          if (((ig) this).field_o != 0) {
            if (fb.field_n != ((ig) this).field_o) {
              if (!((ig) this).a((byte) 126, param0, eb.field_a, ni.field_e, param2)) {
                ((ig) this).a(eb.field_a, -128, param3, param2, param0, ni.field_e);
                return;
              } else {
                if (fb.field_n == 0) {
                  ((ig) this).a(eb.field_a + -param0, ni.field_e - param2, ((ig) this).field_o, 119);
                  ((ig) this).a(eb.field_a, -128, param3, param2, param0, ni.field_e);
                  return;
                } else {
                  ((ig) this).a(eb.field_a, -128, param3, param2, param0, ni.field_e);
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
    }

    boolean a(int param0, rj param1) {
        if (((ig) this).field_E) {
          if (((ig) this).field_A) {
            param1.c(true);
            if (param0 == -2147483648) {
              ((ig) this).field_B = true;
              if (((ig) this).field_v != null) {
                if (!(((ig) this).field_v instanceof ik)) {
                  return true;
                } else {
                  ((ik) (Object) ((ig) this).field_v).a(false, (rj) this, ((ig) this).field_B);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((ig) this).field_A = true;
              ((ig) this).field_B = true;
              if (((ig) this).field_v != null) {
                if (!(((ig) this).field_v instanceof ik)) {
                  return true;
                } else {
                  ((ik) (Object) ((ig) this).field_v).a(false, (rj) this, ((ig) this).field_B);
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

    protected ig() {
        ((ig) this).field_A = true;
        ((ig) this).field_B = false;
        ((ig) this).field_E = true;
        ((ig) this).field_u = n.field_i.field_u;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Instructions";
        field_y = -1;
    }
}
