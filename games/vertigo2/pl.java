/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends jq {
    static String field_p;
    static er field_h;
    private int field_m;
    static int field_q;
    static boolean field_i;
    static int field_n;
    private int field_l;
    private int field_o;
    static String field_j;
    private int field_k;

    public static void a(boolean param0) {
        field_j = null;
        if (!param0) {
          return;
        }
        field_h = null;
        field_p = null;
    }

    final void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param1 >= 26) {
          var4 = param0 * this.field_k >> 12;
          var5 = param0 * this.field_l >> 12;
          var6 = param2 * this.field_m >> 12;
          var7 = param2 * this.field_o >> 12;
          eh.a(var4, var7, var6, this.field_a, 16711680, this.field_f, this.field_g, var5);
          return;
        }
    }

    final static int a(byte param0, int param1) {
        int var3 = Vertigo2.field_L ? 1 : 0;
        al.field_t = 0;
        pq.field_f = null;
        fn.field_y = null;
        int var2 = rf.field_l;
        if (param0 != 11) {
          field_j = (String) null;
          rf.field_l = md.field_D;
          kb.field_e.field_m = kb.field_e.field_m + 1;
          md.field_D = var2;
          if (param1 != 51) {
            if (param1 != 50) {
              kb.field_e.field_j = 1;
              if (kb.field_e.field_m < 2) {
                if (kb.field_e.field_m < 2) {
                  if (!(kb.field_e.field_m < 4)) {
                    return 1;
                  }
                  return -1;
                }
                if (50 == param1) {
                  return 5;
                }
                if (!(kb.field_e.field_m < 4)) {
                  return 1;
                }
                return -1;
              }
              if (param1 == 51) {
                return 2;
              }
              if (kb.field_e.field_m >= 2 &&
                50 == param1) {
                return 5;
              }
              if (!(kb.field_e.field_m < 4)) {
                return 1;
              }
              return -1;
            }
            kb.field_e.field_j = 5;
            if (kb.field_e.field_m < 2) {
              if (kb.field_e.field_m >= 2 &&
                50 == param1) {
                return 5;
              }
              if (!(kb.field_e.field_m < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 51) {
              return 2;
            }
            if (kb.field_e.field_m >= 2 &&
              50 == param1) {
              return 5;
            }
            if (!(kb.field_e.field_m < 4)) {
              return 1;
            }
            return -1;
          }
          kb.field_e.field_j = 2;
          if (kb.field_e.field_m < 2) {
            if (kb.field_e.field_m >= 2 &&
              50 == param1) {
              return 5;
            }
            if (!(kb.field_e.field_m < 4)) {
              return 1;
            }
            return -1;
          }
          if (param1 == 51) {
            return 2;
          }
          if (kb.field_e.field_m >= 2 &&
            50 == param1) {
            return 5;
          }
          if (!(kb.field_e.field_m < 4)) {
            return 1;
          }
          return -1;
        }
        rf.field_l = md.field_D;
        kb.field_e.field_m = kb.field_e.field_m + 1;
        md.field_D = var2;
        if (param1 != 51) {
          if (param1 != 50) {
            kb.field_e.field_j = 1;
            if (kb.field_e.field_m >= 2 &&
              param1 == 51) {
              return 2;
            }
            if (kb.field_e.field_m >= 2 &&
              50 == param1) {
              return 5;
            }
            if (!(kb.field_e.field_m < 4)) {
              return 1;
            }
            return -1;
          }
          kb.field_e.field_j = 5;
          if (kb.field_e.field_m >= 2 &&
            param1 == 51) {
            return 2;
          }
          if (kb.field_e.field_m >= 2 &&
            50 == param1) {
            return 5;
          }
          if (!(kb.field_e.field_m < 4)) {
            return 1;
          }
          return -1;
        }
        kb.field_e.field_j = 2;
        if (kb.field_e.field_m >= 2 &&
          param1 == 51) {
          return 2;
        }
        if (kb.field_e.field_m >= 2 &&
          50 == param1) {
          return 5;
        }
        if (!(kb.field_e.field_m < 4)) {
          return 1;
        }
        return -1;
    }

    final void a(int param0, byte param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var4 = param2 * this.field_k >> 12;
        int var5 = param2 * this.field_l >> 12;
        if (param1 < -31) {
          var6 = param0 * this.field_m >> 12;
          var7 = this.field_o * param0 >> 12;
          bm.a(var7, var6, this.field_g, (byte) 116, var5, var4);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 45) {
          pl.a((byte) -97, -32);
        }
    }

    pl(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_m = param1;
        this.field_o = param3;
        this.field_l = param2;
        this.field_k = param0;
    }

    static {
        field_j = "Orb points: ";
        field_p = "More suggestions";
        field_h = new er(270, 70);
    }
}
