/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class ek extends ce {
    boolean field_H;
    boolean field_I;
    private boolean field_G;
    private boolean field_J;

    boolean a(boolean param0, ce param1) {
        if (((ek) this).field_I) {
          if (((ek) this).field_J) {
            if (!param0) {
              param1.d((byte) -95);
              ((ek) this).field_G = true;
              if (((ek) this).field_v != null) {
                if (!(((ek) this).field_v instanceof m)) {
                  return true;
                } else {
                  ((m) (Object) ((ek) this).field_v).a(-28841, ((ek) this).field_G, (ce) this);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((ek) this).d((byte) 59);
              param1.d((byte) -95);
              ((ek) this).field_G = true;
              if (((ek) this).field_v != null) {
                if (!(((ek) this).field_v instanceof m)) {
                  return true;
                } else {
                  ((m) (Object) ((ek) this).field_v).a(-28841, ((ek) this).field_G, (ce) this);
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

    void b(int param0, int param1, int param2, int param3) {
        if (param3 == 520) {
          if (null != ((ek) this).field_v) {
            if (!(((ek) this).field_v instanceof vn)) {
              return;
            } else {
              ((vn) (Object) ((ek) this).field_v).a((byte) 67, param2, (ek) this, param0, param1);
              return;
            }
          } else {
            return;
          }
        } else {
          ((ek) this).field_J = false;
          if (null != ((ek) this).field_v) {
            if (!(((ek) this).field_v instanceof vn)) {
              return;
            } else {
              ((vn) (Object) ((ek) this).field_v).a((byte) 67, param2, (ek) this, param0, param1);
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        if (param6 == -55) {
          if (((ek) this).field_I) {
            if (((ek) this).a(param1, (byte) -48, param4, param0, param5)) {
              boolean discarded$2 = ((ek) this).a(false, param2);
              ((ek) this).field_o = param3;
              if (null != ((ek) this).field_v) {
                if (!(((ek) this).field_v instanceof sj)) {
                  return true;
                } else {
                  ((sj) (Object) ((ek) this).field_v).a(param3, -4040, (ek) this, param5, param0, param4, param1);
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
        } else {
          ((ek) this).field_G = true;
          if (((ek) this).field_I) {
            if (((ek) this).a(param1, (byte) -48, param4, param0, param5)) {
              boolean discarded$3 = ((ek) this).a(false, param2);
              ((ek) this).field_o = param3;
              if (null != ((ek) this).field_v) {
                if (!(((ek) this).field_v instanceof sj)) {
                  return true;
                } else {
                  ((sj) (Object) ((ek) this).field_v).a(param3, -4040, (ek) this, param5, param0, param4, param1);
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
    }

    final void d(byte param0) {
        Object var3 = null;
        if (((ek) this).field_G) {
          ((ek) this).field_G = false;
          if (((ek) this).field_v != null) {
            if (!(((ek) this).field_v instanceof m)) {
              if (param0 != -95) {
                var3 = null;
                ((ek) this).a((ce) null, -106, -89, 48);
                return;
              } else {
                return;
              }
            } else {
              ((m) (Object) ((ek) this).field_v).a(-28841, ((ek) this).field_G, (ce) this);
              if (param0 != -95) {
                var3 = null;
                ((ek) this).a((ce) null, -106, -89, 48);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != -95) {
              var3 = null;
              ((ek) this).a((ce) null, -106, -89, 48);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -95) {
            var3 = null;
            ((ek) this).a((ce) null, -106, -89, 48);
            return;
          } else {
            return;
          }
        }
    }

    final static ck[] a(String param0, String param1, int param2, ji param3) {
        ck[] var4 = null;
        Object var5 = null;
        ck[] var6 = null;
        var6 = bb.a(18064, param1, param3, param0);
        var4 = var6;
        if (param2 > -43) {
          var5 = null;
          ck[] discarded$2 = ek.a((String) null, (String) null, -51, (ji) null);
          var6[1].field_C = var6[1].field_H;
          var6[7].field_C = var6[7].field_H;
          return var4;
        } else {
          var6[1].field_C = var6[1].field_H;
          var6[7].field_C = var6[7].field_H;
          return var4;
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        if (param3) {
          if (((ek) this).a(0, param1, param0, param2)) {
            L0: {
              ((ek) this).a((byte) 72, param2, param0, param1);
              if (((ek) this).field_H) {
                StringBuilder discarded$8 = param2.append(" active");
                break L0;
              } else {
                break L0;
              }
            }
            if (((ek) this).field_I) {
              return param2;
            } else {
              StringBuilder discarded$9 = param2.append(" disabled");
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          ((ek) this).field_I = true;
          if (((ek) this).a(0, param1, param0, param2)) {
            L1: {
              ((ek) this).a((byte) 72, param2, param0, param1);
              if (((ek) this).field_H) {
                StringBuilder discarded$10 = param2.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (((ek) this).field_I) {
              return param2;
            } else {
              StringBuilder discarded$11 = param2.append(" disabled");
              return param2;
            }
          } else {
            return param2;
          }
        }
    }

    final static void g(int param0) {
        if (param0 != -1209) {
            return;
        }
        ph.field_Ab = false;
    }

    void a(ce param0, int param1, int param2, int param3) {
        if (param1 >= 38) {
          super.a(param0, 94, param2, param3);
          if (((ek) this).field_o != 0) {
            if (be.field_n != ((ek) this).field_o) {
              if (((ek) this).a(bh.field_g, (byte) -124, param2, pm.field_f, param3)) {
                if (be.field_n == 0) {
                  ((ek) this).b(-param3 + bh.field_g, pm.field_f + -param2, ((ek) this).field_o, 520);
                  ((ek) this).a(pm.field_f, 64, param3, param0, param2, bh.field_g);
                  return;
                } else {
                  ((ek) this).a(pm.field_f, 64, param3, param0, param2, bh.field_g);
                  return;
                }
              } else {
                ((ek) this).a(pm.field_f, 64, param3, param0, param2, bh.field_g);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((ek) this).field_H = true;
          super.a(param0, 94, param2, param3);
          if (((ek) this).field_o != 0) {
            if (be.field_n != ((ek) this).field_o) {
              if (((ek) this).a(bh.field_g, (byte) -124, param2, pm.field_f, param3)) {
                if (be.field_n == 0) {
                  ((ek) this).b(-param3 + bh.field_g, pm.field_f + -param2, ((ek) this).field_o, 520);
                  ((ek) this).a(pm.field_f, 64, param3, param0, param2, bh.field_g);
                  return;
                } else {
                  ((ek) this).a(pm.field_f, 64, param3, param0, param2, bh.field_g);
                  return;
                }
              } else {
                ((ek) this).a(pm.field_f, 64, param3, param0, param2, bh.field_g);
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

    ek(String param0, kg param1) {
        this(param0, bf.field_x.field_b, param1);
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var5 = 0;
        var5 = -127 / ((param0 - -22) / 49);
        if (((ek) this).a(true)) {
          if (-85 != (param1 ^ -1)) {
            if ((param1 ^ -1) != -84) {
              return false;
            } else {
              ((ek) this).b(-1, -1, 1, 520);
              return true;
            }
          } else {
            ((ek) this).b(-1, -1, 1, 520);
            return true;
          }
        } else {
          return false;
        }
    }

    final static ke a(boolean param0, boolean param1, int param2) {
        ec var4 = null;
        ec var5 = null;
        ec var6 = null;
        ke var7 = null;
        ke var8 = null;
        ke stackIn_1_0 = null;
        ec stackIn_1_1 = null;
        ec stackIn_1_2 = null;
        int stackIn_1_3 = 0;
        ke stackIn_2_0 = null;
        ec stackIn_2_1 = null;
        ec stackIn_2_2 = null;
        int stackIn_2_3 = 0;
        ke stackIn_3_0 = null;
        ec stackIn_3_1 = null;
        ec stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        String stackIn_3_4 = null;
        ke stackOut_0_0 = null;
        ec stackOut_0_1 = null;
        ec stackOut_0_2 = null;
        int stackOut_0_3 = 0;
        ke stackOut_2_0 = null;
        ec stackOut_2_1 = null;
        ec stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        String stackOut_2_4 = null;
        ke stackOut_1_0 = null;
        ec stackOut_1_1 = null;
        ec stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        String stackOut_1_4 = null;
        L0: {
          var7 = new ke(3);
          var8 = var7;
          var8.a(new ec(25, jb.field_h, (mm) (Object) a.field_t), 110);
          stackOut_0_0 = (ke) var8;
          stackOut_0_1 = null;
          stackOut_0_2 = null;
          stackOut_0_3 = 13;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (!param1) {
            stackOut_2_0 = (ke) (Object) stackIn_2_0;
            stackOut_2_1 = null;
            stackOut_2_2 = null;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = pc.field_f;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (ke) (Object) stackIn_1_0;
            stackOut_1_1 = null;
            stackOut_1_2 = null;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = on.field_c;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        new ec(stackIn_3_3, stackIn_3_4, (mm) (Object) a.field_t);
        ((ke) (Object) stackIn_3_0).a(stackIn_3_1, 120);
        var8.a(new ec(26, og.field_hb, (mm) (Object) a.field_t), 122);
        var7.field_f[1].field_n = 40 + a.field_t.a(var7.field_f[1].field_o);
        var4 = var7.field_f[0];
        var7.field_f[2].field_n = 120;
        var4.field_n = 120;
        var7.field_f[1].field_l = -(var7.field_f[1].field_n / 2) + 320;
        var7.field_f[0].field_l = 32;
        var7.field_f[2].field_l = param2 + (-var7.field_f[2].field_n + -32);
        var5 = var7.field_f[0];
        var7.field_f[2].field_m = 400;
        var6 = var7.field_f[1];
        var6.field_m = 400;
        var8.field_y = 520;
        var8.field_w = 60;
        var8.field_q = 284;
        var5.field_m = 400;
        var8.field_z = 96;
        var8.a(1, param0, param2 ^ -513);
        ac.f((byte) -119);
        return var8;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            ((ek) this).field_I = false;
            return ((ek) this).field_G;
        }
        return ((ek) this).field_G;
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        if (null != ((ek) this).field_v) {
          if (((ek) this).field_v instanceof sj) {
            ((sj) (Object) ((ek) this).field_v).a(param0, param2, param4, param5, (ek) this, param1 + 19001);
            ((ek) this).field_o = 0;
            if (param1 != 64) {
              ((ek) this).field_G = false;
              return;
            } else {
              return;
            }
          } else {
            ((ek) this).field_o = 0;
            if (param1 != 64) {
              ((ek) this).field_G = false;
              return;
            } else {
              return;
            }
          }
        } else {
          ((ek) this).field_o = 0;
          if (param1 != 64) {
            ((ek) this).field_G = false;
            return;
          } else {
            return;
          }
        }
    }

    ek(String param0, gl param1, kg param2) {
        super(param0, param1, param2);
        ((ek) this).field_G = false;
        ((ek) this).field_I = true;
        ((ek) this).field_J = true;
    }

    protected ek() {
        ((ek) this).field_G = false;
        ((ek) this).field_I = true;
        ((ek) this).field_J = true;
        ((ek) this).field_p = bf.field_x.field_g;
    }

    static {
    }
}
