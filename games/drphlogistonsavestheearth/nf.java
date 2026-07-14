/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends ei {
    static vd field_x;
    private kl field_r;
    static he[] field_p;
    static int field_w;
    static String[] field_q;
    static he[] field_s;
    static int field_u;
    static he field_v;
    static int field_t;

    final vh a(int param0, String param1) {
        qi var3 = null;
        vh stackIn_5_0 = null;
        vh stackIn_13_0 = null;
        vh stackIn_22_0 = null;
        vh stackOut_21_0 = null;
        vh stackOut_20_0 = null;
        vh stackOut_12_0 = null;
        vh stackOut_11_0 = null;
        vh stackOut_4_0 = null;
        vh stackOut_3_0 = null;
        if (((nf) this).field_r instanceof ud) {
          var3 = ((ud) (Object) ((nf) this).field_r).a((byte) 87);
          if (var3 != null) {
            if (var3.a(-12317) == ce.field_e) {
              if (param0 != 8192) {
                return null;
              } else {
                L0: {
                  if (!param1.equals((Object) (Object) ((nf) this).field_r.field_p)) {
                    stackOut_21_0 = u.field_b;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = ce.field_e;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                return stackIn_22_0;
              }
            } else {
              return u.field_b;
            }
          } else {
            if (param0 != 8192) {
              return null;
            } else {
              L1: {
                if (!param1.equals((Object) (Object) ((nf) this).field_r.field_p)) {
                  stackOut_12_0 = u.field_b;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                } else {
                  stackOut_11_0 = ce.field_e;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
              }
              return stackIn_13_0;
            }
          }
        } else {
          if (param0 != 8192) {
            return null;
          } else {
            L2: {
              if (!param1.equals((Object) (Object) ((nf) this).field_r.field_p)) {
                stackOut_4_0 = u.field_b;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = ce.field_e;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    nf(kl param0, kl param1) {
        super(param0);
        ((nf) this).field_r = param1;
    }

    final static int c(boolean param0) {
        if (param0) {
            field_x = null;
            return dk.field_c;
        }
        return dk.field_c;
    }

    final static String e(byte param0) {
        if (hg.field_ub == fk.field_q) {
          return bg.field_q;
        } else {
          if (!ib.field_f.a(false)) {
            return ib.field_f.a((byte) -58);
          } else {
            if (hg.field_ub != lc.field_h) {
              if (param0 < 125) {
                field_x = null;
                return qf.field_c;
              } else {
                return qf.field_c;
              }
            } else {
              return ib.field_f.a((byte) -58);
            }
          }
        }
    }

    final String a(byte param0, String param1) {
        qi var3 = null;
        if (((nf) this).field_r instanceof ud) {
          var3 = ((ud) (Object) ((nf) this).field_r).a((byte) 74);
          if (var3 != null) {
            if (var3.a(-12317) == ce.field_e) {
              if (param1.equals((Object) (Object) ((nf) this).field_r.field_p)) {
                return var3.b(-16034);
              } else {
                return ih.field_N;
              }
            } else {
              return var3.b(-16034);
            }
          } else {
            if (param1.equals((Object) (Object) ((nf) this).field_r.field_p)) {
              if (param0 >= 47) {
                return null;
              } else {
                nf.d((byte) -95);
                return null;
              }
            } else {
              return ih.field_N;
            }
          }
        } else {
          if (param1.equals((Object) (Object) ((nf) this).field_r.field_p)) {
            if (param0 >= 47) {
              return null;
            } else {
              nf.d((byte) -95);
              return null;
            }
          } else {
            return ih.field_N;
          }
        }
    }

    public static void d(byte param0) {
        field_s = null;
        field_x = null;
        if (param0 != -95) {
          java.awt.Container discarded$2 = nf.b(true);
          field_p = null;
          field_v = null;
          field_q = null;
          return;
        } else {
          field_p = null;
          field_v = null;
          field_q = null;
          return;
        }
    }

    final static java.awt.Container b(boolean param0) {
        if (!param0) {
          if (null != bb.field_a) {
            return (java.awt.Container) (Object) bb.field_a;
          } else {
            return (java.awt.Container) (Object) nb.a(119);
          }
        } else {
          field_v = null;
          if (null != bb.field_a) {
            return (java.awt.Container) (Object) bb.field_a;
          } else {
            return (java.awt.Container) (Object) nb.a(119);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
        field_x = new vd();
        field_q = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
