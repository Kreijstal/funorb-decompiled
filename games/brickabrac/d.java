/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class d extends oc {
    private boolean field_I;
    static String field_C;
    private boolean field_E;
    static String field_D;
    boolean field_F;
    static String field_G;
    static int field_H;
    boolean field_J;

    public static void g(int param0) {
        if (param0 > -22) {
            return;
        }
        field_G = null;
        field_C = null;
        field_D = null;
    }

    final void b(boolean param0) {
        Object var3 = null;
        if (!param0) {
          if (((d) this).field_E) {
            ((d) this).field_E = false;
            if (((d) this).field_i != null) {
              if (((d) this).field_i instanceof gm) {
                ((gm) (Object) ((d) this).field_i).a(((d) this).field_E, (oc) this, 19365);
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
          var3 = null;
          ((d) this).a((oc) null, (byte) -52, -45, 104);
          if (((d) this).field_E) {
            ((d) this).field_E = false;
            if (((d) this).field_i != null) {
              if (((d) this).field_i instanceof gm) {
                ((gm) (Object) ((d) this).field_i).a(((d) this).field_E, (oc) this, 19365);
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
    }

    d(String param0, uh param1) {
        this(param0, bj.field_T.field_q, param1);
    }

    d(String param0, ub param1, uh param2) {
        super(param0, param1, param2);
        ((d) this).field_I = true;
        ((d) this).field_E = false;
        ((d) this).field_J = true;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        L0: {
          if (!((d) this).a(param3, 1595637992, param0, param1)) {
            break L0;
          } else {
            L1: {
              ((d) this).a(param1, param0, 0, param3);
              if (((d) this).field_F) {
                StringBuilder discarded$4 = param3.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (!((d) this).field_J) {
              StringBuilder discarded$5 = param3.append(" disabled");
              break L0;
            } else {
              if (param2 == 24) {
                return param3;
              } else {
                ((d) this).field_E = true;
                return param3;
              }
            }
          }
        }
        if (param2 != 24) {
          ((d) this).field_E = true;
          return param3;
        } else {
          return param3;
        }
    }

    boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (!((d) this).field_J) {
          if (param6 != 0) {
            return true;
          } else {
            return false;
          }
        } else {
          if (((d) this).a(param5, param3, param2, param6 + 3, param1)) {
            boolean discarded$2 = ((d) this).a(true, param0);
            ((d) this).field_n = param4;
            if (((d) this).field_i != null) {
              if (!(((d) this).field_i instanceof ca)) {
                return true;
              } else {
                ((ca) (Object) ((d) this).field_i).a(param2, param4, (d) this, param5, param1, param3, -13469);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param6 != 0) {
              return true;
            } else {
              return false;
            }
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (((d) this).field_i != null) {
          if (((d) this).field_i instanceof en) {
            ((en) (Object) ((d) this).field_i).a(param0, param1, (byte) -60, param3, (d) this);
            if (param2 >= -8) {
              boolean discarded$6 = ((d) this).f(-13);
              return;
            } else {
              return;
            }
          } else {
            if (param2 >= -8) {
              boolean discarded$7 = ((d) this).f(-13);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 >= -8) {
            boolean discarded$8 = ((d) this).f(-13);
            return;
          } else {
            return;
          }
        }
    }

    boolean a(boolean param0, oc param1) {
        oc stackIn_5_0 = null;
        oc stackIn_6_0 = null;
        oc stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        oc stackOut_4_0;
        oc stackOut_6_0;
        int stackOut_6_1;
        oc stackOut_5_0;
        int stackOut_5_1;
        Object stackOut_7_0;
        Object stackOut_9_0;
        int stackOut_9_1;
        Object stackOut_8_0;
        int stackOut_8_1;
        if (((d) this).field_J) {
          if (((d) this).field_I) {
            L0: {
              stackOut_4_0 = (oc) param1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param0) {
                stackOut_6_0 = (oc) (Object) stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = (oc) (Object) stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            L1: {
              ((oc) (Object) stackIn_7_0).b(stackIn_7_1 != 0);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param0) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((d) this).field_E = stackIn_10_1 != 0;
            if (null != ((d) this).field_i) {
              if (!(((d) this).field_i instanceof gm)) {
                return true;
              } else {
                ((gm) (Object) ((d) this).field_i).a(((d) this).field_E, (oc) this, 19365);
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

    void a(oc param0, byte param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (((d) this).field_n == 0) {
            return;
        }
        if (cb.field_q == ((d) this).field_n) {
            return;
        }
        if (!((d) this).a(po.field_a, param3, param2, param1 + 3, pq.field_k)) {
            ((d) this).a(po.field_a, pq.field_k, param3, param0, 19223, param2);
            return;
        }
        if (-1 != (cb.field_q ^ -1)) {
            ((d) this).a(po.field_a, pq.field_k, param3, param0, 19223, param2);
            return;
        }
        ((d) this).a(po.field_a + -param3, ((d) this).field_n, -79, -param2 + pq.field_k);
        ((d) this).a(po.field_a, pq.field_k, param3, param0, 19223, param2);
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        if (param1 == 110) {
          if (((d) this).f(-103)) {
            if (param0 != 84) {
              if (param0 != 83) {
                return false;
              } else {
                ((d) this).a(-1, 1, -18, -1);
                return true;
              }
            } else {
              ((d) this).a(-1, 1, -18, -1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        if (null != ((d) this).field_i) {
          if (((d) this).field_i instanceof ca) {
            ((ca) (Object) ((d) this).field_i).a((byte) 10, param2, param0, (d) this, param5, param1);
            if (param4 != 19223) {
              boolean discarded$6 = ((d) this).f(87);
              ((d) this).field_n = 0;
              return;
            } else {
              ((d) this).field_n = 0;
              return;
            }
          } else {
            if (param4 != 19223) {
              boolean discarded$7 = ((d) this).f(87);
              ((d) this).field_n = 0;
              return;
            } else {
              ((d) this).field_n = 0;
              return;
            }
          }
        } else {
          if (param4 != 19223) {
            boolean discarded$8 = ((d) this).f(87);
            ((d) this).field_n = 0;
            return;
          } else {
            ((d) this).field_n = 0;
            return;
          }
        }
    }

    final boolean f(int param0) {
        Object var3 = null;
        if (param0 >= -49) {
          var3 = null;
          boolean discarded$2 = ((d) this).a((oc) null, -26, 22, -12, 8, -95, 39);
          return ((d) this).field_E;
        } else {
          return ((d) this).field_E;
        }
    }

    protected d() {
        ((d) this).field_I = true;
        ((d) this).field_E = false;
        ((d) this).field_J = true;
        ((d) this).field_l = bj.field_T.field_r;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Achievements";
        field_H = 0;
        field_G = "Join <%0>'s game";
    }
}
