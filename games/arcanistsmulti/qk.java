/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qk extends ob {
    private int field_kb;
    private dm field_sb;
    static String field_qb;
    private int field_jb;
    private qm field_V;
    private int field_nb;
    private int field_mb;
    private int field_ob;
    private db field_rb;
    static qb[] field_lb;
    static String field_pb;

    final static boolean k(byte param0) {
        if (param0 < 57) {
            field_qb = null;
        }
        return qf.field_a == wi.field_f.field_Bb ? true : false;
    }

    private final void d(int param0, qm param1) {
        if (!(null == ((qk) this).field_sb)) {
            ((qk) this).field_sb.a(true);
        }
        if (param1 == null) {
            ((qk) this).field_sb = new dm();
        } else {
            param1.a(param1.field_k, ((qk) this).field_mb + 6, param1.field_v, 6, param0 ^ -55);
            ((qk) this).field_sb = new dm(param1);
        }
        ((qk) this).c(-126, (qm) (Object) ((qk) this).field_sb);
        ((qk) this).field_V = null;
        if (param0 != 12) {
            ((qk) this).field_rb = null;
        }
    }

    qk(h param0, qm param1, int param2, int param3, int param4) {
        super(param0, param1.field_v + 12, 12 + param2 - -param1.field_k);
        ((qk) this).field_mb = param2;
        ((qk) this).field_nb = param4;
        ((qk) this).field_ob = param3;
        ((qk) this).field_kb = param3;
        this.d(12, param1);
    }

    boolean a(byte param0) {
        int var3 = 0;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 >= 19) {
            break L0;
          } else {
            boolean discarded$2 = ((qk) this).a((byte) 113);
            break L0;
          }
        }
        L1: {
          if (null != ((qk) this).field_rb) {
            if (((qk) this).field_rb == hc.field_i) {
              ((qk) this).field_jb = ((qk) this).field_jb + 1;
              if (((qk) this).field_jb + 1 == ((qk) this).field_kb) {
                ((qk) this).field_rb = hc.field_h;
                ((qk) this).b(((qk) this).field_V.field_v + 12, 116, ((qk) this).field_nb, ((qk) this).field_V.field_k + 12 + ((qk) this).field_mb);
                ((qk) this).field_jb = 0;
                ((qk) this).field_sb.field_K = 0;
                break L1;
              } else {
                ((qk) this).field_sb.field_K = 256 - (((qk) this).field_jb << 740201736) / ((qk) this).field_kb;
                break L1;
              }
            } else {
              if (mj.field_u == ((qk) this).field_rb) {
                ((qk) this).field_jb = ((qk) this).field_jb + 1;
                if (((qk) this).field_ob == ((qk) this).field_jb + 1) {
                  ((qk) this).field_sb.field_K = 256;
                  ((qk) this).field_rb = null;
                  break L1;
                } else {
                  ((qk) this).field_sb.field_K = (((qk) this).field_jb << -1935303192) / ((qk) this).field_ob;
                  break L1;
                }
              } else {
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        return this.a((byte) 57);
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        if (!(!this.a(param0, (byte) -123, param2, param3))) {
            return true;
        }
        if (!(null == ((qk) this).field_sb)) {
            if (!((param3 ^ -1) != -99)) {
                boolean discarded$0 = ((qk) this).field_sb.a(0, param0);
            }
            if (param3 == 99) {
                boolean discarded$1 = ((qk) this).field_sb.a(0, param0);
            }
        }
        if (param1 >= -120) {
            field_lb = null;
            return false;
        }
        return false;
    }

    final void e(boolean param0) {
        if (((qk) this).field_rb == hc.field_i) {
            return;
        }
        ((qk) this).field_rb = mj.field_u;
        if (param0) {
            ((qk) this).field_kb = 82;
        }
        ((qk) this).field_jb = 0;
        this.d(12, ((qk) this).field_V);
        ((qk) this).field_V = null;
        ((qk) this).field_sb.field_K = 0;
    }

    final void a(int param0) {
        if (param0 < 89) {
            Object var3 = null;
            ((qk) this).a((byte) -74, (qm) null);
        }
        if (!(((qk) this).field_rb == null)) {
            if (!(((qk) this).field_rb == mj.field_u)) {
                ((qk) this).a(((qk) this).field_V.field_v + 12, 0, ((qk) this).field_V.field_k + (((qk) this).field_mb + 12));
                this.d(12, ((qk) this).field_V);
            }
            ((qk) this).field_rb = null;
            ((qk) this).field_sb.field_K = 256;
        }
        this.a(126);
    }

    public static void g(int param0) {
        field_lb = null;
        field_qb = null;
        field_pb = null;
        if (param0 != 0) {
            field_qb = null;
        }
    }

    final boolean g(byte param0) {
        if (param0 != 45) {
            ((qk) this).field_ob = -74;
        }
        ((qk) this).a(127);
        return this.g((byte) 45);
    }

    void a(byte param0, qm param1) {
        ((qk) this).field_V = param1;
        if (((qk) this).field_rb == hc.field_h) {
            ((qk) this).b(((qk) this).field_V.field_v + 12, 117, ((qk) this).field_nb, ((qk) this).field_mb + (12 + ((qk) this).field_V.field_k));
            ((qk) this).field_jb = 0;
        } else {
            if (!(hc.field_i == ((qk) this).field_rb)) {
                ((qk) this).field_jb = 0;
                ((qk) this).field_rb = hc.field_i;
            }
        }
        if (param0 != -92) {
            Object var4 = null;
            this.d(106, (qm) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = "This option cannot be combined with the current settings for:  ";
        field_pb = "(1 player wants to join)";
    }
}
