/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends hd {
    private ji field_Kb;
    hd field_Gb;
    hd field_Db;
    ji field_Eb;
    static tf field_Ab;
    static String field_yb;
    static String field_Hb;
    static String field_Lb;
    static int field_zb;
    static String field_Jb;
    static String field_Cb;
    static String field_Bb;
    static int field_Ib;
    static ot[][] field_Fb;

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        ((tk) this).field_mb = param4;
        ((tk) this).field_q = param5;
        int var8 = 78 / ((param3 - -62) / 37);
        ((tk) this).field_J = param6;
        ((tk) this).field_s = param1;
        ((tk) this).a(param0, param2, 0);
    }

    tk(String param0, hd param1, hd param2, ji param3) {
        this(vb.a(0, (CharSequence) (Object) param0), param1, param2, param3);
    }

    final void a(int param0, boolean param1, byte param2, int param3) {
        this.a(param1, param0, param3, ((tk) this).field_Gb.field_mb, -71, ((tk) this).field_Gb.field_q);
        if (param2 > -76) {
            field_Ib = 29;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var6 = Kickabout.field_G;
          ((tk) this).field_Db.field_s = param2;
          ((tk) this).field_Gb.field_q = ((tk) this).field_q;
          ((tk) this).field_Db.field_J = 0;
          ((tk) this).field_Gb.field_mb = ((tk) this).field_mb;
          ((tk) this).field_Eb.c((byte) -109);
          ((tk) this).field_Kb.c((byte) -109);
          if (((tk) this).field_Gb.field_q >= ((tk) this).field_Db.field_q) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (((tk) this).field_Gb.field_mb >= ((tk) this).field_Db.field_mb) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var5 = stackIn_6_0;
            if (var4 == 0) {
              break L3;
            } else {
              if (var5 == 0) {
                break L3;
              } else {
                ((tk) this).a((byte) -113, (hd) (Object) ((tk) this).field_Kb);
                ((tk) this).a((byte) -125, (hd) (Object) ((tk) this).field_Eb);
                ((tk) this).field_Gb.field_mb = ((tk) this).field_Gb.field_mb - (param0 + param1);
                ((tk) this).field_Gb.field_q = ((tk) this).field_Gb.field_q - (param1 + param0);
                ((tk) this).field_Kb.a(true, -param0 + ((tk) this).field_q, 0, ((tk) this).field_mb - param0, param0);
                ((tk) this).field_Kb.b(-((tk) this).field_Db.field_s, ((tk) this).field_Db.field_q, param2 + 112, ((tk) this).field_Gb.field_q);
                ((tk) this).field_Eb.a(true, param0, ((tk) this).field_q - param0, 0, ((tk) this).field_mb - param0);
                ((tk) this).field_Eb.b(-((tk) this).field_Db.field_J, ((tk) this).field_Db.field_mb, 20, ((tk) this).field_Gb.field_mb);
                break L2;
              }
            }
          }
          if (var4 == 0) {
            if (var5 == 0) {
              break L2;
            } else {
              ((tk) this).a((byte) -124, (hd) (Object) ((tk) this).field_Eb);
              ((tk) this).field_Gb.field_q = ((tk) this).field_Gb.field_q - (param1 + param0);
              ((tk) this).field_Eb.a(true, param0, ((tk) this).field_q + -param0, 0, ((tk) this).field_mb);
              ((tk) this).field_Eb.b(-((tk) this).field_Db.field_J, ((tk) this).field_Db.field_mb, 65, ((tk) this).field_Gb.field_mb);
              break L2;
            }
          } else {
            ((tk) this).a((byte) -120, (hd) (Object) ((tk) this).field_Kb);
            ((tk) this).field_Gb.field_mb = ((tk) this).field_Gb.field_mb - (param0 + param1);
            ((tk) this).field_Kb.a(true, ((tk) this).field_q, 0, -param0 + ((tk) this).field_mb, param0);
            ((tk) this).field_Kb.b(-((tk) this).field_Db.field_s, ((tk) this).field_Db.field_q, 77, ((tk) this).field_Gb.field_q);
            break L2;
          }
        }
    }

    final static void h(byte param0) {
        ku.field_c = null;
        lt.field_a = null;
        pq.field_O = null;
        aq.field_f = null;
        fc.field_g = null;
        lo.field_j = null;
        if (param0 >= -69) {
            tk.i((byte) 118);
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        L0: {
          var8 = Kickabout.field_G;
          if (((tk) this).field_Eb.b(-74)) {
            ((tk) this).field_Db.field_v = ((tk) this).field_Db.field_v + param2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((tk) this).field_Eb.h(0)) {
            ((tk) this).field_Db.field_v = ((tk) this).field_Db.field_v - param2;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((tk) this).field_Eb.c(true)) {
            ((tk) this).field_Db.field_v = ((tk) this).field_Db.field_v + param5;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((tk) this).field_Eb.i(-59)) {
            ((tk) this).field_Db.field_v = ((tk) this).field_Db.field_v - param5;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((tk) this).field_Kb.b(-52)) {
            ((tk) this).field_Db.field_fb = ((tk) this).field_Db.field_fb + param2;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!((tk) this).field_Kb.h(0)) {
            break L5;
          } else {
            ((tk) this).field_Db.field_fb = ((tk) this).field_Db.field_fb - param2;
            break L5;
          }
        }
        L6: {
          if (param4 < -61) {
            break L6;
          } else {
            ((tk) this).a(84, -119, -123);
            break L6;
          }
        }
        L7: {
          if (!((tk) this).field_Kb.c(true)) {
            break L7;
          } else {
            ((tk) this).field_Db.field_fb = ((tk) this).field_Db.field_fb + param3;
            break L7;
          }
        }
        L8: {
          if (((tk) this).field_Kb.i(-74)) {
            ((tk) this).field_Db.field_fb = ((tk) this).field_Db.field_fb - param3;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (((tk) this).field_gb) {
            if (((tk) this).field_Db.field_mb >= ((tk) this).field_Gb.field_mb) {
              ((tk) this).field_Db.field_v = ((tk) this).field_Db.field_v - param1;
              break L9;
            } else {
              ((tk) this).field_Db.field_fb = ((tk) this).field_Db.field_fb - param1;
              break L9;
            }
          } else {
            break L9;
          }
        }
        L10: {
          if (param0) {
            L11: {
              if (-1 >= (-(((tk) this).field_Db.field_v + ((tk) this).field_Db.field_J) ^ -1)) {
                break L11;
              } else {
                ((tk) this).field_Db.field_v = -((tk) this).field_Db.field_J;
                break L11;
              }
            }
            L12: {
              if ((-(((tk) this).field_Db.field_fb + ((tk) this).field_Db.field_s) ^ -1) <= -1) {
                break L12;
              } else {
                ((tk) this).field_Db.field_fb = -((tk) this).field_Db.field_s;
                break L12;
              }
            }
            L13: {
              if (((tk) this).field_Db.field_mb - -((tk) this).field_Db.field_L + -((tk) this).field_Gb.field_mb >= -(((tk) this).field_Db.field_J - -((tk) this).field_Db.field_v)) {
                break L13;
              } else {
                ((tk) this).field_Db.field_v = -((tk) this).field_Db.field_J + -(-((tk) this).field_Gb.field_mb + ((tk) this).field_Db.field_mb - -((tk) this).field_Db.field_L);
                break L13;
              }
            }
            if (-((tk) this).field_Gb.field_q + (((tk) this).field_Db.field_G + ((tk) this).field_Db.field_q) >= -(((tk) this).field_Db.field_fb + ((tk) this).field_Db.field_s)) {
              break L10;
            } else {
              ((tk) this).field_Db.field_fb = -(((tk) this).field_Db.field_q - (-((tk) this).field_Db.field_G - -((tk) this).field_Gb.field_q)) - ((tk) this).field_Db.field_s;
              break L10;
            }
          } else {
            L14: {
              if (-(((tk) this).field_Db.field_v + ((tk) this).field_Db.field_J) > ((tk) this).field_Db.field_L + (((tk) this).field_Db.field_mb - ((tk) this).field_Gb.field_mb)) {
                ((tk) this).field_Db.field_v = -(-((tk) this).field_Gb.field_mb + ((tk) this).field_Db.field_L + ((tk) this).field_Db.field_mb) + -((tk) this).field_Db.field_J;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-(((tk) this).field_Db.field_v + ((tk) this).field_Db.field_J) >= 0) {
                break L15;
              } else {
                ((tk) this).field_Db.field_v = -((tk) this).field_Db.field_J;
                break L15;
              }
            }
            L16: {
              if (-(((tk) this).field_Db.field_fb + ((tk) this).field_Db.field_s) <= -((tk) this).field_Gb.field_q + ((tk) this).field_Db.field_q + ((tk) this).field_Db.field_G) {
                break L16;
              } else {
                ((tk) this).field_Db.field_fb = -(((tk) this).field_Db.field_G + (((tk) this).field_Db.field_q + -((tk) this).field_Gb.field_q)) - ((tk) this).field_Db.field_s;
                break L16;
              }
            }
            if (-1 >= (-(((tk) this).field_Db.field_fb + ((tk) this).field_Db.field_s) ^ -1)) {
              break L10;
            } else {
              ((tk) this).field_Db.field_fb = -((tk) this).field_Db.field_s;
              break L10;
            }
          }
        }
        L17: {
          if (((tk) this).field_Eb.j(0)) {
            ((tk) this).field_Db.field_J = -((tk) this).field_Eb.a(((tk) this).field_Db.field_mb, param0, (byte) -95, ((tk) this).field_Gb.field_mb);
            ((tk) this).field_Db.field_v = 0;
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          if (((tk) this).field_Kb.j(0)) {
            ((tk) this).field_Db.field_s = -((tk) this).field_Kb.a(((tk) this).field_Db.field_q, 0, param0, ((tk) this).field_Gb.field_q);
            ((tk) this).field_Db.field_fb = 0;
            break L18;
          } else {
            break L18;
          }
        }
        ((tk) this).field_Eb.b(-((tk) this).field_Db.field_J, ((tk) this).field_Db.field_mb, 126, ((tk) this).field_Gb.field_mb);
        ((tk) this).field_Kb.b(-((tk) this).field_Db.field_s, ((tk) this).field_Db.field_q, 54, ((tk) this).field_Gb.field_q);
    }

    tk(long param0, hd param1, hd param2, ji param3) {
        super(param0, (hd) null);
        ((tk) this).field_Gb = new hd(0L, param2);
        ((tk) this).field_Eb = new ji(0L, param3, true);
        ((tk) this).field_Kb = new ji(0L, param3, false);
        ((tk) this).a((byte) -126, ((tk) this).field_Gb);
        ((tk) this).a((byte) -115, (hd) (Object) ((tk) this).field_Eb);
        ((tk) this).a((byte) -128, (hd) (Object) ((tk) this).field_Kb);
        ((tk) this).field_Db = param1;
        ((tk) this).field_Gb.a((byte) -117, param1);
    }

    tk(long param0, hd param1, hd param2, ji param3, ji param4) {
        super(param0, (hd) null);
        ((tk) this).field_Gb = new hd(0L, param2);
        ((tk) this).field_Eb = new ji(0L, param3, true);
        ((tk) this).field_Kb = new ji(0L, param4, false);
        ((tk) this).a((byte) -115, ((tk) this).field_Gb);
        ((tk) this).a((byte) -105, (hd) (Object) ((tk) this).field_Eb);
        ((tk) this).a((byte) -117, (hd) (Object) ((tk) this).field_Kb);
        ((tk) this).field_Db = param1;
        ((tk) this).field_Gb.a((byte) -110, param1);
    }

    public static void i(byte param0) {
        field_Jb = null;
        field_Bb = null;
        field_Hb = null;
        field_Ab = null;
        field_Cb = null;
        field_Fb = null;
        field_yb = null;
        field_Lb = null;
        if (param0 != -69) {
            field_Ab = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ab = new tf();
        field_Jb = "Members";
        field_Cb = "Please check if address is correct";
        field_Lb = "You have <%0> unread messages!";
        field_Hb = "Security";
        field_Bb = "View Leagues";
    }
}
