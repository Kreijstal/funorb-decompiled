/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends k {
    static String field_l;
    static boolean field_k;
    static boolean field_n;
    static java.awt.Frame field_o;
    static int field_q;
    static String field_p;
    private vb field_m;

    final static void e(byte param0) {
        String var1 = null;
        if (!cg.field_l) {
          throw new IllegalStateException();
        } else {
          if (param0 < -34) {
            if (null != ej.field_I) {
              ej.field_I.m(17);
              var1 = p.a(-123);
              eo.field_k = new hk(var1, (String) null, true, false, false);
              mf.field_f.a(-126, (oc) (Object) rj.field_c);
              rj.field_c.b((byte) 108, (oc) (Object) eo.field_k);
              rj.field_c.j(20);
              return;
            } else {
              var1 = p.a(-123);
              eo.field_k = new hk(var1, (String) null, true, false, false);
              mf.field_f.a(-126, (oc) (Object) rj.field_c);
              rj.field_c.b((byte) 108, (oc) (Object) eo.field_k);
              rj.field_c.j(20);
              return;
            }
          } else {
            return;
          }
        }
    }

    final String a(int param0, String param1) {
        int var3_int = 0;
        ia var3 = null;
        if (((cb) this).field_m instanceof je) {
          var3 = ((je) (Object) ((cb) this).field_m).a(-11011);
          if (var3 != null) {
            if (var3.b((byte) -31) == ae.field_c) {
              if (param1.equals((Object) (Object) ((cb) this).field_m.field_A)) {
                return var3.a(45);
              } else {
                return bh.field_sb;
              }
            } else {
              return var3.a(45);
            }
          } else {
            var3_int = 55 % ((-16 - param0) / 50);
            if (!param1.equals((Object) (Object) ((cb) this).field_m.field_A)) {
              return bh.field_sb;
            } else {
              return null;
            }
          }
        } else {
          var3_int = 55 % ((-16 - param0) / 50);
          if (!param1.equals((Object) (Object) ((cb) this).field_m.field_A)) {
            return bh.field_sb;
          } else {
            return null;
          }
        }
    }

    public static void f(int param0) {
        field_o = null;
        int var1 = 55 / ((58 - param0) / 54);
        field_p = null;
        field_l = null;
    }

    final static void b(boolean param0) {
        k.field_h.e(-13413, 9);
        vh.field_L = param0 ? true : false;
    }

    final qh a(String param0, byte param1) {
        ia var4 = null;
        ia var5 = null;
        qh stackIn_5_0 = null;
        qh stackIn_10_0 = null;
        qh stackIn_17_0 = null;
        qh stackIn_22_0 = null;
        qh stackIn_27_0 = null;
        qh stackIn_33_0 = null;
        qh stackOut_32_0;
        qh stackOut_31_0;
        qh stackOut_26_0;
        qh stackOut_25_0;
        qh stackOut_21_0;
        qh stackOut_20_0;
        qh stackOut_16_0;
        qh stackOut_15_0;
        qh stackOut_9_0;
        qh stackOut_8_0;
        qh stackOut_4_0;
        qh stackOut_3_0;
        if (param1 == 106) {
          if (((cb) this).field_m instanceof je) {
            var5 = ((je) (Object) ((cb) this).field_m).a(param1 + -11117);
            if (var5 != null) {
              if (var5.b((byte) -31) == ae.field_c) {
                L0: {
                  if (param0.equals((Object) (Object) ((cb) this).field_m.field_A)) {
                    stackOut_32_0 = ae.field_c;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    stackOut_31_0 = lp.field_xb;
                    stackIn_33_0 = stackOut_31_0;
                    break L0;
                  }
                }
                return (qh) (Object) stackIn_33_0;
              } else {
                return lp.field_xb;
              }
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((cb) this).field_m.field_A)) {
                  stackOut_26_0 = ae.field_c;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = lp.field_xb;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return (qh) (Object) stackIn_27_0;
            }
          } else {
            L2: {
              if (param0.equals((Object) (Object) ((cb) this).field_m.field_A)) {
                stackOut_21_0 = ae.field_c;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = lp.field_xb;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return (qh) (Object) stackIn_22_0;
          }
        } else {
          field_k = false;
          if (((cb) this).field_m instanceof je) {
            var4 = ((je) (Object) ((cb) this).field_m).a(param1 + -11117);
            if (var4 != null) {
              if (var4.b((byte) -31) != ae.field_c) {
                return lp.field_xb;
              } else {
                L3: {
                  if (param0.equals((Object) (Object) ((cb) this).field_m.field_A)) {
                    stackOut_16_0 = ae.field_c;
                    stackIn_17_0 = stackOut_16_0;
                    break L3;
                  } else {
                    stackOut_15_0 = lp.field_xb;
                    stackIn_17_0 = stackOut_15_0;
                    break L3;
                  }
                }
                return (qh) (Object) stackIn_17_0;
              }
            } else {
              L4: {
                if (param0.equals((Object) (Object) ((cb) this).field_m.field_A)) {
                  stackOut_9_0 = ae.field_c;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = lp.field_xb;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return (qh) (Object) stackIn_10_0;
            }
          } else {
            L5: {
              if (param0.equals((Object) (Object) ((cb) this).field_m.field_A)) {
                stackOut_4_0 = ae.field_c;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = lp.field_xb;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return (qh) (Object) stackIn_5_0;
          }
        }
    }

    cb(vb param0, vb param1) {
        super(param0);
        ((cb) this).field_m = param1;
    }

    final static boolean e(int param0) {
        if (param0 < -90) {
          if (!ld.field_s) {
            return false;
          } else {
            if (ng.field_b != 0) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        ni.field_Sb = true;
        if (param1 != 9) {
          cb.f(-31);
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          sj.a(param0, (byte) 117, var3, var2, var4);
          return;
        } else {
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          sj.a(param0, (byte) 117, var3, var2, var4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Searching for an opponent";
        field_k = false;
        field_q = 0;
        field_p = "To Customer Support";
    }
}
