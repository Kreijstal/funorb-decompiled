/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ag extends qm {
    private boolean field_y;
    static Random field_D;
    int field_F;
    static boolean field_E;
    boolean field_z;
    boolean field_B;
    static ij field_C;
    static String field_A;
    private boolean field_G;
    static String field_x;

    ag(String param0, pf param1, wc param2) {
        super(param0, param1, param2);
        ((ag) this).field_F = 0;
        ((ag) this).field_B = true;
        ((ag) this).field_G = true;
        ((ag) this).field_y = false;
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        if (param1 < -120) {
          if (((ag) this).d(-2116)) {
            if (-85 != (param3 ^ -1)) {
              if ((param3 ^ -1) != -84) {
                return false;
              } else {
                ((ag) this).a(-122, -1, 1, -1);
                return true;
              }
            } else {
              ((ag) this).a(-122, -1, 1, -1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        ((ag) this).field_F = param2;
        if (param0 < -99) {
          if (null != ((ag) this).field_o) {
            if (!(((ag) this).field_o instanceof vb)) {
              return;
            } else {
              ((vb) (Object) ((ag) this).field_o).a(true, param3, param1, param2, (ag) this);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = 48 / ((-42 - param4) / 35);
        if (((ag) this).field_B) {
          if (((ag) this).a((byte) -47, param3, param0, param6, param5)) {
            boolean discarded$2 = ((ag) this).a(0, param2);
            ((ag) this).field_t = param1;
            if (null != ((ag) this).field_o) {
              if (!(((ag) this).field_o instanceof cl)) {
                return true;
              } else {
                ((cl) (Object) ((ag) this).field_o).a(31017, (ag) this, param0, param3, param6, param5, param1);
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

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        if (param1 == -20592) {
          if (((ag) this).field_o != null) {
            if (!(((ag) this).field_o instanceof cl)) {
              ((ag) this).field_t = 0;
              return;
            } else {
              ((cl) (Object) ((ag) this).field_o).a(param0, false, param4, param2, (ag) this, param3);
              ((ag) this).field_t = 0;
              return;
            }
          } else {
            ((ag) this).field_t = 0;
            return;
          }
        } else {
          field_A = null;
          if (((ag) this).field_o != null) {
            if (!(((ag) this).field_o instanceof cl)) {
              ((ag) this).field_t = 0;
              return;
            } else {
              ((cl) (Object) ((ag) this).field_o).a(param0, false, param4, param2, (ag) this, param3);
              ((ag) this).field_t = 0;
              return;
            }
          } else {
            ((ag) this).field_t = 0;
            return;
          }
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        this.a(param0, param1, param2, param3);
        ((ag) this).field_F = 0;
        if (0 == ((ag) this).field_t) {
            return;
        }
        if (wk.field_m == ((ag) this).field_t) {
            return;
        }
        if (!((ag) this).a((byte) -47, param3, me.field_I, param1, an.field_g)) {
            ((ag) this).a(me.field_I, -20592, an.field_g, param3, param1, param0);
            return;
        }
        if (wk.field_m != 0) {
            ((ag) this).a(me.field_I, -20592, an.field_g, param3, param1, param0);
            return;
        }
        ((ag) this).a(-102, -param1 + an.field_g, ((ag) this).field_t, me.field_I + -param3);
        ((ag) this).a(me.field_I, -20592, an.field_g, param3, param1, param0);
    }

    ag(String param0, wc param1) {
        this(param0, io.field_n.field_u, param1);
    }

    ag(int param0, int param1, int param2, int param3, pf param4, wc param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((ag) this).field_F = 0;
        ((ag) this).field_B = true;
        ((ag) this).field_G = true;
        ((ag) this).field_y = false;
    }

    boolean a(int param0, qm param1) {
        Object var4 = null;
        if (((ag) this).field_B) {
          if (((ag) this).field_G) {
            param1.d((byte) 29);
            ((ag) this).field_y = true;
            if (param0 == 0) {
              if (((ag) this).field_o != null) {
                if (!(((ag) this).field_o instanceof wb)) {
                  return true;
                } else {
                  ((wb) (Object) ((ag) this).field_o).a(false, ((ag) this).field_y, (qm) this);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              var4 = null;
              boolean discarded$7 = ((ag) this).a((qm) null, (byte) 125, 'B', 9);
              if (((ag) this).field_o != null) {
                if (!(((ag) this).field_o instanceof wb)) {
                  return true;
                } else {
                  ((wb) (Object) ((ag) this).field_o).a(false, ((ag) this).field_y, (qm) this);
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

    final static void a(byte param0) {
        sb.field_h[92] = 74;
        sb.field_h[46] = 72;
        sb.field_h[93] = 43;
        sb.field_h[59] = 57;
        sb.field_h[91] = 42;
        sb.field_h[61] = 27;
        sb.field_h[222] = 58;
        sb.field_h[192] = 28;
        if (param0 != -60) {
          ag.a((byte) -28);
          sb.field_h[520] = 59;
          sb.field_h[44] = 71;
          sb.field_h[47] = 73;
          sb.field_h[45] = 26;
          return;
        } else {
          sb.field_h[520] = 59;
          sb.field_h[44] = 71;
          sb.field_h[47] = 73;
          sb.field_h[45] = 26;
          return;
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5 = 0;
        if (((ag) this).a(param0, (byte) -90, param2, param1)) {
          ((ag) this).a(param0, param1, param2, 1);
          if (!((ag) this).field_z) {
            if (!((ag) this).field_B) {
              StringBuilder discarded$3 = param0.append(" disabled");
              var5 = -113 / ((param3 - 50) / 60);
              return param0;
            } else {
              var5 = -113 / ((param3 - 50) / 60);
              return param0;
            }
          } else {
            StringBuilder discarded$4 = param0.append(" active");
            if (((ag) this).field_B) {
              var5 = -113 / ((param3 - 50) / 60);
              return param0;
            } else {
              StringBuilder discarded$5 = param0.append(" disabled");
              var5 = -113 / ((param3 - 50) / 60);
              return param0;
            }
          }
        } else {
          var5 = -113 / ((param3 - 50) / 60);
          return param0;
        }
    }

    final void d(byte param0) {
        if (param0 == 29) {
          if (((ag) this).field_y) {
            ((ag) this).field_y = false;
            if (null != ((ag) this).field_o) {
              if (!(((ag) this).field_o instanceof wb)) {
                return;
              } else {
                ((wb) (Object) ((ag) this).field_o).a(false, ((ag) this).field_y, (qm) this);
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

    final static void a(ij param0, byte param1) {
        if (param0 != null) {
          nn.field_q = param0;
          co.field_f.field_G.c(param1 + 185);
          if (param1 != -104) {
            return;
          } else {
            co.field_f.a((kc) (Object) nn.field_q, 60);
            oj.field_i = true;
            return;
          }
        } else {
          return;
        }
    }

    final boolean d(int param0) {
        if (param0 != -2116) {
            field_x = null;
            return ((ag) this).field_y;
        }
        return ((ag) this).field_y;
    }

    public static void e(int param0) {
        field_C = null;
        field_x = null;
        if (param0 >= -97) {
            return;
        }
        field_D = null;
        field_A = null;
    }

    public ag() {
        ((ag) this).field_F = 0;
        ((ag) this).field_B = true;
        ((ag) this).field_G = true;
        ((ag) this).field_y = false;
        ((ag) this).field_r = io.field_n.field_y;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new Random();
        field_A = "Off";
        field_x = "As you see, you performed a mighty leap when you pressed 'Enter'.<br>Try it again.";
    }
}
