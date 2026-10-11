/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends i {
    static int[] field_L;
    private mf field_H;
    static String field_G;
    static byte[][] field_O;
    static em field_N;
    static boolean field_K;
    static long field_I;
    static hd field_P;
    static int field_J;
    static String field_M;
    static ut field_Q;

    final static void a(int param0, String param1, boolean param2) {
        int fieldTemp$0 = 0;
        int var3_int = 0;
        if (la.a(100)) {
          return;
        }
        if (uv.field_f) {
          return;
        }
        try {
          bg.field_r = param1;
          or.field_d.b(54, (byte) 89);
          fieldTemp$0 = or.field_d.field_n + 1;
          or.field_d.field_n = or.field_d.field_n + 1;
          var3_int = fieldTemp$0;
          or.field_d.a(param1, (byte) -127);
          or.field_d.a(102, param0);
          or.field_d.c(62, -var3_int + or.field_d.field_n);
          ri.field_t = 500;
          uv.field_f = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "pq.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1) {
        super.a(70, param1);
        if (param0 < 60) {
          field_M = (String) null;
          if (param1 != 0) {
            this.field_H.c(true);
            return;
          }
          if (this.field_H.field_Fb == -1) {
            this.field_H.c(true);
            return;
          }
          if (tu.field_E.a((byte) 95, tu.field_E.field_q[this.field_H.field_Fb])) {
            this.field_H.c(true);
            return;
          }
          oj.b(-121, tu.field_E.field_q[this.field_H.field_Fb]);
          this.field_H.c(true);
          return;
        }
        if (param1 != 0) {
          this.field_H.c(true);
          return;
        }
        if (this.field_H.field_Fb == -1) {
          this.field_H.c(true);
          return;
        }
        if (tu.field_E.a((byte) 95, tu.field_E.field_q[this.field_H.field_Fb])) {
          this.field_H.c(true);
          return;
        }
        oj.b(-121, tu.field_E.field_q[this.field_H.field_Fb]);
        this.field_H.c(true);
    }

    final int a(byte param0) {
        if (param0 < 75) {
          pq.g(1);
          return 346;
        }
        return 346;
    }

    final static int b(int param0, int param1) {
        param1 = (1431655765 & param1) + ((-1431655765 & param1) >>> 1);
        param1 = (858993459 & param1) + (1932735283 & param1 >>> 2);
        param1 = 252645135 & (param1 >>> 4) + param1;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        if (param0 == 170) {
          return 255 & param1;
        }
        String var3 = (String) null;
        pq.a(12, (String) null, false);
        return 255 & param1;
    }

    final void a(byte param0, int param1, int param2) {
        int var5;
        var5 = Kickabout.field_G;
        if (param0 < -11) {
          super.a((byte) -119, param1, param2);
          this.field_H.field_J = 35 + param2 + 20;
          this.field_H.field_s = 20 + param1;
          this.field_H.a(101, false);
          this.field_H.k((byte) 84);
          if (-1 != this.field_H.field_Fb) {
            tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]].a(param2 + 35 + 105, 23, param1 + 320);
            if (!tu.field_E.a((byte) -102, tu.field_E.field_q[this.field_H.field_Fb])) {
              if (cq.e(15137) &&
                !np.h((byte) 5)) {
                pb.field_C.a("Sorry, Moderators can't auction people...", param1 + 170, 210 + param2 + 35, 300, 40, 16777215, -1, 1, 1, 0);
                return;
              }
              if (this.field_H.field_Fb != -1 &&
                gp.a(tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]], -576054046) == 0) {
                pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 + 35), 300, 40, 16777215, -1, 1, 1, 0);
                return;
              }
              pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
              return;
            }
            pb.field_C.d(iw.field_j, 315 + param1, 245 + param2, 16777215, -1);
          }
          if (!cq.e(15137)) {
            if (this.field_H.field_Fb == -1) {
              pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
            } else {
              if (gp.a(tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]], -576054046) != 0) {
                pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
              } else {
                pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 + 35), 300, 40, 16777215, -1, 1, 1, 0);
              }
            }
            return;
          }
          if (!np.h((byte) 5)) {
            pb.field_C.a("Sorry, Moderators can't auction people...", param1 + 170, 210 + param2 + 35, 300, 40, 16777215, -1, 1, 1, 0);
            return;
          }
          if (this.field_H.field_Fb != -1 &&
            gp.a(tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]], -576054046) == 0) {
            pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 + 35), 300, 40, 16777215, -1, 1, 1, 0);
            return;
          }
          pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
          return;
        }
        field_J = -68;
        super.a((byte) -119, param1, param2);
        this.field_H.field_J = 35 + param2 + 20;
        this.field_H.field_s = 20 + param1;
        this.field_H.a(101, false);
        this.field_H.k((byte) 84);
        if (-1 != this.field_H.field_Fb) {
          tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]].a(param2 + 35 + 105, 23, param1 + 320);
          if (!tu.field_E.a((byte) -102, tu.field_E.field_q[this.field_H.field_Fb])) {
            if (!cq.e(15137)) {
              if (this.field_H.field_Fb != -1 &&
                gp.a(tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]], -576054046) == 0) {
                pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 + 35), 300, 40, 16777215, -1, 1, 1, 0);
                return;
              }
              pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
              return;
            }
            if (!np.h((byte) 5)) {
              pb.field_C.a("Sorry, Moderators can't auction people...", param1 + 170, 210 + param2 + 35, 300, 40, 16777215, -1, 1, 1, 0);
            } else {
              if (this.field_H.field_Fb == -1) {
                pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
              } else {
                if (gp.a(tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]], -576054046) != 0) {
                  pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
                } else {
                  pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 + 35), 300, 40, 16777215, -1, 1, 1, 0);
                }
              }
            }
            return;
          }
          pb.field_C.d(iw.field_j, 315 + param1, 245 + param2, 16777215, -1);
        }
        if (!cq.e(15137)) {
          if (this.field_H.field_Fb == -1) {
            pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
          } else {
            if (gp.a(tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]], -576054046) == 0) {
              pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 + 35), 300, 40, 16777215, -1, 1, 1, 0);
            } else {
              pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
            }
          }
        } else {
          if (!np.h((byte) 5)) {
            pb.field_C.a("Sorry, Moderators can't auction people...", param1 + 170, 210 + param2 + 35, 300, 40, 16777215, -1, 1, 1, 0);
          } else {
            if (this.field_H.field_Fb == -1) {
              pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
            } else {
              if (gp.a(tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]], -576054046) != 0) {
                pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 + 35, 300, 40, 16729156, -1, 1, 1, 0);
              } else {
                pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 + 35), 300, 40, 16777215, -1, 1, 1, 0);
              }
            }
          }
        }
    }

    pq() {
        super(11);
        this.field_H = new mf(tu.field_E);
    }

    final static void g(byte param0) {
        if (!nb.field_f) {
          throw new IllegalStateException();
        }
        aw.field_H = true;
        hm.a(false, -112);
        vj.field_c = 0;
        if (param0 == 66) {
          return;
        }
        field_N = (em) null;
    }

    public static void g(int param0) {
        field_N = null;
        field_L = null;
        field_O = (byte[][]) null;
        if (param0 == -14948) {
          field_P = null;
          field_M = null;
          field_G = null;
          field_Q = null;
          return;
        }
        pq.b(19, 71);
        field_P = null;
        field_M = null;
        field_G = null;
        field_Q = null;
    }

    final void a(int param0, boolean param1) {
        if (1 != this.field_n) {
          return;
        }
        this.field_H.b(param0 ^ param0, param1);
        this.field_H.a(param0 + 45);
        if (this.field_H.field_Fb == -1) {
          this.field_i[0].field_lb = false;
        } else {
          if (tu.field_E.a((byte) 90, tu.field_E.field_q[this.field_H.field_Fb])) {
            this.field_i[0].field_lb = false;
          } else {
            if (gp.a(tu.field_E.field_i[tu.field_E.field_q[this.field_H.field_Fb]], -576054046) != 0) {
              this.field_i[0].field_lb = true;
            } else {
              this.field_i[0].field_lb = false;
            }
          }
        }
        if (!cq.e(15137)) {
          return;
        }
        if (np.h((byte) -128)) {
          return;
        }
        this.field_i[0].field_lb = false;
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
          this.a((byte) 85);
          return 470;
        }
        return 470;
    }

    static {
        field_G = "No spectators";
        field_I = 0L;
        field_L = new int[]{0, 1200, 2300, 3300, 4000, 4300, 4400, 4300, 4100, 3940, 3900, 3980, 4096};
        field_K = false;
        field_J = 0;
        field_M = "Strong stagger";
    }
}
