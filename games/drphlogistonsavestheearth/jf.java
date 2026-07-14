/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jf extends ca {
    private vg field_hb;
    private int field_lb;
    static String field_fb;
    private int field_jb;
    private int field_mb;
    private cd field_ob;
    private dl field_gb;
    static Random field_nb;
    private int field_pb;
    private int field_qb;
    static int[] field_ib;
    static String field_kb;

    boolean a(int param0, char param1, vg param2, int param3) {
        if (param3 >= 63) {
          if (super.a(param0, param1, param2, 113)) {
            return true;
          } else {
            if (((jf) this).field_gb != null) {
              L0: {
                if (98 == param0) {
                  boolean discarded$4 = ((jf) this).field_gb.a(false, param2);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (param0 != 99) {
                return false;
              } else {
                boolean discarded$5 = ((jf) this).field_gb.a(false, param2);
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    private final void a(byte param0, vg param1) {
        if (((jf) this).field_gb == null) {
          if (param0 == -52) {
            if (param1 == null) {
              ((jf) this).field_gb = new dl();
              ((jf) this).b((vg) (Object) ((jf) this).field_gb, (byte) 104);
              ((jf) this).field_hb = null;
              return;
            } else {
              param1.a(6 - -((jf) this).field_jb, param1.field_k, 6, 16535, param1.field_w);
              ((jf) this).field_gb = new dl(param1);
              ((jf) this).b((vg) (Object) ((jf) this).field_gb, (byte) 104);
              ((jf) this).field_hb = null;
              return;
            }
          } else {
            field_nb = null;
            if (param1 == null) {
              ((jf) this).field_gb = new dl();
              ((jf) this).b((vg) (Object) ((jf) this).field_gb, (byte) 104);
              ((jf) this).field_hb = null;
              return;
            } else {
              param1.a(6 - -((jf) this).field_jb, param1.field_k, 6, 16535, param1.field_w);
              ((jf) this).field_gb = new dl(param1);
              ((jf) this).b((vg) (Object) ((jf) this).field_gb, (byte) 104);
              ((jf) this).field_hb = null;
              return;
            }
          }
        } else {
          ((jf) this).field_gb.a(param0 ^ 16157);
          if (param0 != -52) {
            field_nb = null;
            if (param1 == null) {
              ((jf) this).field_gb = new dl();
              ((jf) this).b((vg) (Object) ((jf) this).field_gb, (byte) 104);
              ((jf) this).field_hb = null;
              return;
            } else {
              param1.a(6 - -((jf) this).field_jb, param1.field_k, 6, 16535, param1.field_w);
              ((jf) this).field_gb = new dl(param1);
              ((jf) this).b((vg) (Object) ((jf) this).field_gb, (byte) 104);
              ((jf) this).field_hb = null;
              return;
            }
          } else {
            if (param1 == null) {
              ((jf) this).field_gb = new dl();
              ((jf) this).b((vg) (Object) ((jf) this).field_gb, (byte) 104);
              ((jf) this).field_hb = null;
              return;
            } else {
              param1.a(6 - -((jf) this).field_jb, param1.field_k, 6, 16535, param1.field_w);
              ((jf) this).field_gb = new dl(param1);
              ((jf) this).b((vg) (Object) ((jf) this).field_gb, (byte) 104);
              ((jf) this).field_hb = null;
              return;
            }
          }
        }
    }

    jf(k param0, vg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_w, param1.field_k + param2 + 12);
        ((jf) this).field_mb = param4;
        ((jf) this).field_jb = param2;
        ((jf) this).field_qb = param3;
        ((jf) this).field_lb = param3;
        this.a((byte) -52, param1);
    }

    public static void h(byte param0) {
        field_kb = null;
        if (param0 < 90) {
            return;
        }
        field_nb = null;
        field_fb = null;
        field_ib = null;
    }

    boolean k(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null == ((jf) this).field_ob) {
          if (param0 != 2968) {
            var4 = null;
            this.a((byte) -80, (vg) null);
            return super.k(2968);
          } else {
            return super.k(2968);
          }
        } else {
          if (((jf) this).field_ob == oe.field_c) {
            ((jf) this).field_pb = ((jf) this).field_pb + 1;
            if (((jf) this).field_lb != ((jf) this).field_pb + 1) {
              ((jf) this).field_gb.field_K = 256 - (((jf) this).field_pb << 2026743272) / ((jf) this).field_lb;
              if (param0 != 2968) {
                var4 = null;
                this.a((byte) -80, (vg) null);
                return super.k(2968);
              } else {
                return super.k(2968);
              }
            } else {
              ((jf) this).field_ob = ni.field_s;
              ((jf) this).a(((jf) this).field_mb, ((jf) this).field_hb.field_k + (12 + ((jf) this).field_jb), ((jf) this).field_hb.field_w + 12, (byte) 104);
              ((jf) this).field_pb = 0;
              ((jf) this).field_gb.field_K = 0;
              if (param0 != 2968) {
                var4 = null;
                this.a((byte) -80, (vg) null);
                return super.k(2968);
              } else {
                return super.k(2968);
              }
            }
          } else {
            if (((jf) this).field_ob == kh.field_h) {
              ((jf) this).field_pb = ((jf) this).field_pb + 1;
              if (((jf) this).field_pb + 1 == ((jf) this).field_qb) {
                ((jf) this).field_ob = null;
                ((jf) this).field_gb.field_K = 256;
                if (param0 != 2968) {
                  var4 = null;
                  this.a((byte) -80, (vg) null);
                  return super.k(2968);
                } else {
                  return super.k(2968);
                }
              } else {
                ((jf) this).field_gb.field_K = (((jf) this).field_pb << 459970472) / ((jf) this).field_qb;
                if (param0 == 2968) {
                  return super.k(2968);
                } else {
                  var4 = null;
                  this.a((byte) -80, (vg) null);
                  return super.k(2968);
                }
              }
            } else {
              if (param0 == 2968) {
                return super.k(2968);
              } else {
                var4 = null;
                this.a((byte) -80, (vg) null);
                return super.k(2968);
              }
            }
          }
        }
    }

    final void g(byte param0) {
        if (param0 >= -111) {
          return;
        } else {
          L0: {
            if (((jf) this).field_ob == null) {
              break L0;
            } else {
              L1: {
                if (((jf) this).field_ob != kh.field_h) {
                  ((jf) this).b(((jf) this).field_hb.field_w + 12, 1688990433, ((jf) this).field_hb.field_k + (12 + ((jf) this).field_jb));
                  this.a((byte) -52, ((jf) this).field_hb);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((jf) this).field_gb.field_K = 256;
              ((jf) this).field_ob = null;
              break L0;
            }
          }
          super.g((byte) -118);
          return;
        }
    }

    final void l(int param0) {
        if (oe.field_c == ((jf) this).field_ob) {
          return;
        } else {
          ((jf) this).field_pb = 0;
          ((jf) this).field_ob = kh.field_h;
          this.a((byte) -52, ((jf) this).field_hb);
          if (param0 != -24626) {
            boolean discarded$2 = ((jf) this).k(-41);
            ((jf) this).field_gb.field_K = 0;
            ((jf) this).field_hb = null;
            return;
          } else {
            ((jf) this).field_gb.field_K = 0;
            ((jf) this).field_hb = null;
            return;
          }
        }
    }

    final boolean j(int param0) {
        ((jf) this).g((byte) -120);
        if (param0 != 0) {
            return true;
        }
        return super.j(0);
    }

    void a(int param0, vg param1) {
        ((jf) this).field_hb = param1;
        if (((jf) this).field_ob == ni.field_s) {
          ((jf) this).a(((jf) this).field_mb, 12 + ((jf) this).field_jb + ((jf) this).field_hb.field_k, 12 + ((jf) this).field_hb.field_w, (byte) 66);
          ((jf) this).field_pb = 0;
          if (param0 != 33) {
            ((jf) this).field_jb = -14;
            return;
          } else {
            return;
          }
        } else {
          if (oe.field_c != ((jf) this).field_ob) {
            ((jf) this).field_ob = oe.field_c;
            ((jf) this).field_pb = 0;
            if (param0 == 33) {
              return;
            } else {
              ((jf) this).field_jb = -14;
              return;
            }
          } else {
            if (param0 == 33) {
              return;
            } else {
              ((jf) this).field_jb = -14;
              return;
            }
          }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        Object var3 = null;
        if (param1 != 7552) {
          var3 = null;
          boolean discarded$2 = jf.a((CharSequence) null, 52);
          return fc.a(true, -44, param0, 10);
        } else {
          return fc.a(true, -44, param0, 10);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Reload game";
        field_nb = new Random();
        field_kb = "Please enter your age in years";
        field_ib = new int[75];
    }
}
