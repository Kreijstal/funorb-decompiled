/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fi extends qg implements pb {
    static int field_x;
    static sh field_w;
    qg field_v;
    static int[] field_t;
    static rc field_u;

    boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        Object var9 = null;
        if (param4 == -30386) {
          if (((fi) this).field_v != null) {
            if (!((fi) this).field_v.b(param0, param1, param2, param3 + ((fi) this).field_p, -30386, param5, ((fi) this).field_n + param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var9 = null;
          boolean discarded$8 = ((fi) this).b(113, -82, (qg) null, -14, -67, 9, 85);
          if (((fi) this).field_v != null) {
            if (!((fi) this).field_v.b(param0, param1, param2, param3 + ((fi) this).field_p, -30386, param5, ((fi) this).field_n + param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    fi(int param0, int param1, int param2, int param3, ui param4, ma param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(byte param0) {
        int var2 = 91 % ((74 - param0) / 49);
        if (((fi) this).field_v == null) {
            return;
        }
        ((fi) this).field_v.c((byte) 85);
    }

    private final boolean b(qg param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 32) {
          if (((fi) this).field_v != null) {
            if (((fi) this).field_v.b((byte) 102)) {
              return false;
            } else {
              L0: {
                if (!((fi) this).field_v.a(param0, param1 + -140)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_x = 106;
          if (((fi) this).field_v != null) {
            if (((fi) this).field_v.b((byte) 102)) {
              return false;
            } else {
              L1: {
                if (!((fi) this).field_v.a(param0, param1 + -140)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final int g(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -41) {
          L0: {
            field_w = null;
            if (((fi) this).field_v == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ((fi) this).field_v.g(-116);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((fi) this).field_v == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((fi) this).field_v.g(-116);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        if (param1 >= -20) {
          return null;
        } else {
          L0: {
            if (((fi) this).a((byte) -93, param3, param2, param0)) {
              ((fi) this).a(param2, 69, param0, param3);
              ((fi) this).a(param2, param0, param3, false);
              break L0;
            } else {
              break L0;
            }
          }
          return param2;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-126, param1, param2, param3, param4);
        ((fi) this).a((byte) 126);
        int var6 = 67 % ((-29 - param0) / 53);
    }

    final boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param5 == -17) {
          if (null != ((fi) this).field_v) {
            if (!((fi) this).field_v.b((byte) 53)) {
              return false;
            } else {
              L0: {
                if (!((fi) this).field_v.a(param0, param1, param2, param3, param4, param5 + 0, param6)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void c(boolean param0) {
        ia var1_ref = null;
        Object var1 = null;
        if (!param0) {
            fi.c(false);
            var1_ref = (ia) (Object) uj.field_c.a(-9424);
            if (!(var1_ref != null)) {
                throw new IllegalStateException();
            }
            sb.a(var1_ref.field_o, var1_ref.field_h, var1_ref.field_n);
            sb.a(var1_ref.field_k, var1_ref.field_g, var1_ref.field_p, var1_ref.field_m);
            var1_ref.field_o = null;
            kk.field_f.a((wf) (Object) var1_ref, -128);
            return;
        }
        var1_ref = (ia) (Object) uj.field_c.a(-9424);
        if (!(var1_ref != null)) {
            throw new IllegalStateException();
        }
        sb.a(var1_ref.field_o, var1_ref.field_h, var1_ref.field_n);
        sb.a(var1_ref.field_k, var1_ref.field_g, var1_ref.field_p, var1_ref.field_m);
        var1_ref.field_o = null;
        kk.field_f.a((wf) (Object) var1_ref, -128);
    }

    public static void h(int param0) {
        if (param0 != 30381) {
          fi.h(-100);
          field_w = null;
          field_u = null;
          field_t = null;
          return;
        } else {
          field_w = null;
          field_u = null;
          field_t = null;
          return;
        }
    }

    String f(int param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.f(param0);
        if (((fi) this).field_v != null) {
          var3 = ((fi) this).field_v.f(4);
          if (var3 == null) {
            return var2;
          } else {
            return var3;
          }
        } else {
          return var2;
        }
    }

    final void e(int param0) {
        Object var3 = null;
        if (param0 == -29113) {
          if (((fi) this).field_v == null) {
            return;
          } else {
            ((fi) this).field_v.e(-29113);
            return;
          }
        } else {
          var3 = null;
          ((fi) this).a(101, (byte) 111, (qg) null, 40);
          if (((fi) this).field_v == null) {
            return;
          } else {
            ((fi) this).field_v.e(-29113);
            return;
          }
        }
    }

    final boolean a(qg param0, int param1) {
        if (param1 < -11) {
          if (((fi) this).field_v != null) {
            if (!((fi) this).field_v.a(param0, -119)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_t = null;
          if (((fi) this).field_v != null) {
            if (!((fi) this).field_v.a(param0, -119)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static uk b(String param0, byte param1) {
        String var2 = null;
        Object var3 = null;
        uk var3_ref = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var3 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (null != rb.field_b) {
          var6 = (CharSequence) (Object) param0;
          var2 = hj.a((byte) -126, var6);
          if (param1 == 51) {
            L0: {
              if (var2 != null) {
                break L0;
              } else {
                var2 = (String) (Object) var3_ref;
                break L0;
              }
            }
            var3_ref = (uk) (Object) rb.field_b.a((long)var2.hashCode(), (byte) -50);
            L1: while (true) {
              if (var3_ref != null) {
                L2: {
                  var8 = (CharSequence) (Object) var3_ref.field_eb;
                  var4 = hj.a((byte) -126, var8);
                  if (var4 == null) {
                    var4 = var3_ref.field_eb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3_ref = (uk) (Object) rb.field_b.a(93);
                  continue L1;
                } else {
                  return var3_ref;
                }
              } else {
                return null;
              }
            }
          } else {
            L3: {
              field_t = null;
              if (var2 != null) {
                break L3;
              } else {
                var2 = (String) (Object) var6;
                break L3;
              }
            }
            var3_ref = (uk) (Object) rb.field_b.a((long)var2.hashCode(), (byte) -50);
            L4: while (true) {
              if (var3_ref != null) {
                L5: {
                  var7 = (CharSequence) (Object) var3_ref.field_eb;
                  var4 = hj.a((byte) -126, var7);
                  if (var4 == null) {
                    var4 = var3_ref.field_eb;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3_ref = (uk) (Object) rb.field_b.a(93);
                  continue L4;
                } else {
                  return var3_ref;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5 = 0;
        if (null == ((fi) this).field_v) {
            var5 = param0;
            if (!(80 != var5)) {
                return ve.field_B[81] ? this.b(param1, 32) : this.a(param1, (byte) -128);
            }
            var5 = 55 % ((65 - param2) / 55);
            return false;
        }
        if (!((fi) this).field_v.b((byte) -114)) {
            var5 = param0;
            if (!(80 != var5)) {
                return ve.field_B[81] ? this.b(param1, 32) : this.a(param1, (byte) -128);
            }
            var5 = 55 % ((65 - param2) / 55);
            return false;
        }
        if (((fi) this).field_v.a(param0, param1, (byte) 122, param3)) {
            return true;
        }
        var5 = param0;
        if (!(80 != var5)) {
            return ve.field_B[81] ? this.b(param1, 32) : this.a(param1, (byte) -128);
        }
        var5 = 55 % ((65 - param2) / 55);
        return false;
    }

    final void a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        StringBuilder discarded$9 = param0.append(10);
        var5 = 0;
        if (!param3) {
          L0: while (true) {
            if (param1 < var5) {
              if (null == ((fi) this).field_v) {
                StringBuilder discarded$10 = param0.append("null");
                return;
              } else {
                StringBuilder discarded$11 = ((fi) this).field_v.a(param1 + 1, -74, param0, param2);
                return;
              }
            } else {
              StringBuilder discarded$12 = param0.append(32);
              var5++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        int var2 = 50 % ((param0 - -57) / 46);
        return ((fi) this).d((byte) 104) != null ? true : false;
    }

    void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        if (param3 == -1) {
          if (null == ((fi) this).field_v) {
            return;
          } else {
            ((fi) this).field_v.a(((fi) this).field_n + param0, param1, param2, -1, param4, ((fi) this).field_p + param5);
            return;
          }
        } else {
          ((fi) this).a(-91, -31, -117, -62, -38);
          if (null == ((fi) this).field_v) {
            return;
          } else {
            ((fi) this).field_v.a(((fi) this).field_n + param0, param1, param2, -1, param4, ((fi) this).field_p + param5);
            return;
          }
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = 0;
        nc.field_t = nc.field_t + param1;
        ud.field_b = ud.field_b + (param2 + -255);
        if (!mg.field_d) {
          var3 = 1 << param2;
          if (param0 != (var3 & rh.field_n)) {
            return false;
          } else {
            L0: {
              rh.field_n = rh.field_n | var3;
              hc.field_u = hc.field_u | var3;
              oj.field_u.a((wf) (Object) new pi(param2), -99);
              if (qj.b((byte) 78)) {
                rh.field_n = rh.field_n | var3;
                break L0;
              } else {
                break L0;
              }
            }
            if (!dk.field_b) {
              if (qj.b((byte) 74)) {
                mc.field_c.a((wf) (Object) new gd(param2, param1, nc.field_t, ud.field_b, jk.field_B, gh.field_l), -94);
                return true;
              } else {
                gd discarded$2 = nh.a(jk.field_B, ud.field_b, param1, nc.field_t, param2, gh.field_l, 4, 75);
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (null == ((fi) this).field_v) {
          return;
        } else {
          ((fi) this).field_v.a(((fi) this).field_n + param0, (byte) -12, param2, param3 + ((fi) this).field_p);
          return;
        }
    }

    private final boolean a(qg param0, byte param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = 27 % ((-15 - param1) / 59);
        if (null != ((fi) this).field_v) {
          if (((fi) this).field_v.b((byte) -117)) {
            return false;
          } else {
            L0: {
              if (!((fi) this).field_v.a(param0, -77)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    qg d(byte param0) {
        int var2 = 47 / ((51 - param0) / 48);
        qg var3 = ((fi) this).field_v;
        if (var3 == null) {
            return null;
        }
        if (!(!var3.b((byte) 36))) {
            return var3;
        }
        return null;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        if (0 == param2) {
          if (null == ((fi) this).field_q) {
            L0: {
              if (null != ((fi) this).field_v) {
                ((fi) this).field_v.a(((fi) this).field_p + param0, param1 - -((fi) this).field_n, param2, (byte) 112);
                break L0;
              } else {
                break L0;
              }
            }
            var5 = 66 % ((param3 - 77) / 34);
            return;
          } else {
            L1: {
              ((fi) this).field_q.a(param0, param1, true, (byte) 99, (qg) this);
              if (null != ((fi) this).field_v) {
                ((fi) this).field_v.a(((fi) this).field_p + param0, param1 - -((fi) this).field_n, param2, (byte) 112);
                break L1;
              } else {
                break L1;
              }
            }
            var5 = 66 % ((param3 - 77) / 34);
            return;
          }
        } else {
          L2: {
            if (null != ((fi) this).field_v) {
              ((fi) this).field_v.a(((fi) this).field_p + param0, param1 - -((fi) this).field_n, param2, (byte) 112);
              break L2;
            } else {
              break L2;
            }
          }
          var5 = 66 % ((param3 - 77) / 34);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[4];
        field_w = new sh();
        field_u = new rc();
    }
}
