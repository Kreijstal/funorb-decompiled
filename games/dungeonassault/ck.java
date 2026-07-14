/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ck extends lm {
    private boolean field_C;
    boolean field_B;
    static cn field_G;
    static fm field_H;
    static String field_D;
    boolean field_E;
    private boolean field_F;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        if (!(!((ck) this).a(param1, param0, 108, param2))) {
            ((ck) this).a(param0, param2, param1, 1);
            if (!(!((ck) this).field_E)) {
                StringBuilder discarded$0 = param2.append(" active");
            }
            if (!((ck) this).field_B) {
                StringBuilder discarded$1 = param2.append(" disabled");
            }
        }
        if (param3 > -76) {
            ck.e((byte) 58);
        }
        return param2;
    }

    ck(String param0, ca param1, pg param2) {
        super(param0, param1, param2);
        ((ck) this).field_C = true;
        ((ck) this).field_B = true;
        ((ck) this).field_F = false;
    }

    final static void h(int param0) {
        jb.k((byte) -82);
        int var1 = 28 / ((param0 - -14) / 61);
    }

    final void e(int param0) {
        if (((ck) this).field_F) {
            ((ck) this).field_F = false;
            if (null != ((ck) this).field_n) {
                if (!(!(((ck) this).field_n instanceof io))) {
                    ((io) (Object) ((ck) this).field_n).a(((ck) this).field_F, 124, (lm) this);
                }
            }
        }
        if (param0 <= 1) {
            Object var3 = null;
            ck.a((String) null, 62, (String) null);
        }
    }

    boolean a(int param0, lm param1) {
        L0: {
          if (param0 == 34) {
            break L0;
          } else {
            ((ck) this).field_E = true;
            break L0;
          }
        }
        if (!((ck) this).field_B) {
          return false;
        } else {
          if (((ck) this).field_C) {
            L1: {
              param1.e(53);
              ((ck) this).field_F = true;
              if (((ck) this).field_n == null) {
                break L1;
              } else {
                if (((ck) this).field_n instanceof io) {
                  ((io) (Object) ((ck) this).field_n).a(((ck) this).field_F, -71, (lm) this);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            return true;
          } else {
            return false;
          }
        }
    }

    boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 108 / ((param5 - -80) / 35);
        if (((ck) this).field_B) {
            if (((ck) this).a(param4, param3, param6, -1, param2)) {
                boolean discarded$0 = ((ck) this).a(34, param0);
                ((ck) this).field_y = param1;
                if (((ck) this).field_n != null) {
                    if (!(((ck) this).field_n instanceof si)) {
                        return true;
                    }
                    ((si) (Object) ((ck) this).field_n).a(param2, (ck) this, param3, -100, param1, param6, param4);
                }
                return true;
            }
        }
        return false;
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        super.a(param0, param1, param2, param3);
        if (((ck) this).field_y != 0) {
            if (!(la.field_g == ((ck) this).field_y)) {
                if (((ck) this).a(hj.field_S, param0, param1, -1, eh.field_h)) {
                    if (0 == la.field_g) {
                        ((ck) this).b(-param1 + eh.field_h, ((ck) this).field_y, 1, -param0 + hj.field_S);
                    }
                }
                ((ck) this).a(param1, true, eh.field_h, param2, param0, hj.field_S);
            }
        }
    }

    ck(String param0, pg param1) {
        this(param0, hl.field_a.field_o, param1);
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
        if (((ck) this).a((byte) 93)) {
            if (param2 != 84) {
                // if_icmpeq L26
            } else {
                ((ck) this).b(-1, 1, 1, -1);
                return true;
            }
        }
        if (param3 <= 55) {
            ((ck) this).b(56, -107, -73, -111);
        }
        return false;
    }

    final static void e(byte param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = DungeonAssault.field_K;
        re.b();
        jk.field_Bb = new int[260];
        lh.field_t = 11;
        if (param0 != 65) {
            return;
        }
        for (var1 = 0; var1 < 256; var1++) {
            var2 = 15.0;
            jk.field_Bb[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < jk.field_Bb.length) {
            jk.field_Bb[var5] = 255;
            var5++;
        }
    }

    final void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        if (((ck) this).field_n != null) {
            if (((ck) this).field_n instanceof si) {
                ((si) (Object) ((ck) this).field_n).a((byte) 42, param2, param0, param4, (ck) this, param5);
            }
        }
        if (!param1) {
            return;
        }
        ((ck) this).field_y = 0;
    }

    final boolean a(byte param0) {
        if (param0 <= 6) {
            boolean discarded$0 = ((ck) this).a((byte) -101);
        }
        return ((ck) this).field_F;
    }

    final static void a(String param0, int param1, String param2) {
        if (param1 != 11) {
            field_D = null;
        }
        lp.a(param0, -74, false, param2);
    }

    public static void b(boolean param0) {
        field_D = null;
        if (!param0) {
            boolean discarded$0 = ck.g(50);
        }
        field_G = null;
        field_H = null;
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            ((ck) this).field_C = false;
        }
        if (((ck) this).field_n != null) {
            if (((ck) this).field_n instanceof vg) {
                ((vg) (Object) ((ck) this).field_n).a((ck) this, (byte) 98, param1, param0, param3);
            }
        }
    }

    final static boolean g(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (nk.field_Ib != null) {
                break L1;
              } else {
                if (!td.field_c) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    protected ck() {
        ((ck) this).field_C = true;
        ((ck) this).field_B = true;
        ((ck) this).field_F = false;
        ((ck) this).field_o = hl.field_a.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
