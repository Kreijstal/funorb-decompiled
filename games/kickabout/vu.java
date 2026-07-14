/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu extends hd {
    private hd field_Bb;
    static sj field_Eb;
    static int[] field_zb;
    static int field_Ab;
    static volatile int field_Fb;
    static int field_Cb;
    static boolean field_Db;
    static tk field_Ib;
    hd field_yb;
    static String field_Gb;
    static int field_Hb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((vu) this).a(true, param2, param4, param3, param6);
        this.a(param0, -90, param1);
        if (param5 != 15114) {
            field_Hb = -18;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Kickabout.field_G;
        var1 = 0;
        L0: while (true) {
          if (vb.field_j <= var1) {
            vb.field_j = 0;
            if (param0 < 84) {
              vu.a(12);
              return;
            } else {
              return;
            }
          } else {
            fu.field_b[var1] = null;
            var1++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -15410) {
          vu.a(-117);
          field_Eb = null;
          field_zb = null;
          field_Gb = null;
          field_Ib = null;
          return;
        } else {
          field_Eb = null;
          field_zb = null;
          field_Gb = null;
          field_Ib = null;
          return;
        }
    }

    vu(long param0, hd param1, hd param2, hd param3, ut param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((vu) this).field_Bb = new hd(0L, param2);
            ((vu) this).field_Bb.field_N = param4;
            ((vu) this).a((byte) -112, ((vu) this).field_Bb);
        }
        if (param5 != null) {
            ((vu) this).field_yb = new hd(0L, param3, param5);
            ((vu) this).a((byte) -104, ((vu) this).field_yb);
        }
        ((vu) this).b(false);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = -param0;
          if (((vu) this).field_Bb == null) {
            break L0;
          } else {
            var4 = ((vu) this).field_Bb.g((byte) -74);
            break L0;
          }
        }
        L1: {
          if (param1 <= -61) {
            break L1;
          } else {
            vu.a(-96);
            break L1;
          }
        }
        L2: {
          var5 = -param0;
          if (null != ((vu) this).field_yb) {
            var5 = ((vu) this).field_yb.a(((vu) this).field_q - param2 + -var4 - (param0 + param2), 0);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var6 = param2 + (var4 - (-param0 + -var5)) + param2;
          if (var6 <= ((vu) this).field_q) {
            break L3;
          } else {
            var5 = var5 + (-var6 + ((vu) this).field_q);
            var6 = ((vu) this).field_q;
            break L3;
          }
        }
        L4: {
          if (-2 == (((vu) this).field_A ^ -1)) {
            param2 = param2 + (-var6 + ((vu) this).field_q) / 2;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (2 == ((vu) this).field_A) {
            param2 = param2 + (((vu) this).field_q + -var6);
            break L5;
          } else {
            break L5;
          }
        }
        if (((vu) this).field_Bb != null) {
          ((vu) this).field_Bb.a(true, var4, param2, 0, ((vu) this).field_mb);
          ((vu) this).field_Bb.field_p = ((vu) this).field_p;
          if (null != ((vu) this).field_yb) {
            ((vu) this).field_yb.a(true, var5, param0 + var4 + param2, 0, ((vu) this).field_mb);
            ((vu) this).field_yb.field_p = ((vu) this).field_p;
            if (((vu) this).field_Bb == null) {
              ((vu) this).field_yb.field_A = ((vu) this).field_A;
              return;
            } else {
              ((vu) this).field_yb.field_A = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          L6: {
            if (null != ((vu) this).field_yb) {
              ((vu) this).field_yb.a(true, var5, param0 + var4 + param2, 0, ((vu) this).field_mb);
              ((vu) this).field_yb.field_p = ((vu) this).field_p;
              if (((vu) this).field_Bb != null) {
                ((vu) this).field_yb.field_A = 0;
                break L6;
              } else {
                ((vu) this).field_yb.field_A = ((vu) this).field_A;
                break L6;
              }
            } else {
              break L6;
            }
          }
          return;
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (param1 != 0) {
          L0: {
            ((vu) this).a(-30, -44, -56, 15, -21, -62, 40);
            var4 = -param0;
            if (null != ((vu) this).field_Bb) {
              var4 = ((vu) this).field_Bb.g((byte) -92);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = -param0;
            if (((vu) this).field_yb != null) {
              var5 = ((vu) this).field_yb.g((byte) -23);
              break L1;
            } else {
              break L1;
            }
          }
          return param2 + param0 + (param2 - -var4 + var5);
        } else {
          L2: {
            var4 = -param0;
            if (null != ((vu) this).field_Bb) {
              var4 = ((vu) this).field_Bb.g((byte) -92);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var5 = -param0;
            if (((vu) this).field_yb != null) {
              var5 = ((vu) this).field_yb.g((byte) -23);
              break L3;
            } else {
              break L3;
            }
          }
          return param2 + param0 + (param2 - -var4 + var5);
        }
    }

    final static void a(boolean param0, boolean param1) {
        L0: {
          if (null != sn.field_e) {
            ar.a(15707, sn.field_e);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          L1: {
            field_Db = true;
            if (wi.field_v != null) {
              wi.field_v.a(param1, false);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            nj.a(param1, -128);
            if (null != ck.field_b) {
              ck.field_b.a(104, param1);
              break L2;
            } else {
              break L2;
            }
          }
          fb.a(30521, param1);
          return;
        } else {
          L3: {
            if (wi.field_v != null) {
              wi.field_v.a(param1, false);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            nj.a(param1, -128);
            if (null != ck.field_b) {
              ck.field_b.a(104, param1);
              break L4;
            } else {
              break L4;
            }
          }
          fb.a(30521, param1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = new int[128];
        field_Ab = 3;
        field_Fb = 0;
        field_Gb = "This kit is unlocked by a <col=ffff55>Hidden Achievement</col>.<br>";
        field_Hb = 2;
    }
}
