/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp {
    private er[] field_e;
    static String field_c;
    static fe field_a;
    static cr field_g;
    static ch field_f;
    static int field_d;
    static int field_b;

    public static void a(int param0) {
        if (param0 >= -122) {
            return;
        }
        field_c = null;
        field_g = null;
        field_a = null;
        field_f = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        bc.a(param0, param2, (byte) 116, this.field_e, param3, param1);
        if (param4 > -55) {
            mp.a(-42, 20);
        }
    }

    mp(er[] param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "mp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          if (param2 == 19297) {
            break L0;
          } else {
            mp.a(-127, -8);
            break L0;
          }
        }
        L1: {
          if (null == sj.field_d) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var3 = stackIn_5_0;
        if (de.field_f != 9) {
          if ((de.field_f ^ -1) == -11) {
            if (var3 != 0) {
              return false;
            } else {
              g.a((byte) -10);
              return true;
            }
          } else {
            L2: {
              if (-12 != (de.field_f ^ -1)) {
                break L2;
              } else {
                if (!ff.field_m) {
                  break L2;
                } else {
                  L3: {
                    if ((nm.field_E ^ -1) != -3) {
                      break L3;
                    } else {
                      if (rm.a((byte) -126, ba.field_a, qi.field_b)) {
                        break L3;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (nm.field_E == 2) {
                    L4: {
                      if (mf.b(-6390)) {
                        var4 = (String) null;
                        tf.a(nm.field_E, qi.field_b, -84, (String) null, param0, ap.field_c);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return true;
                  } else {
                    if (var3 != 0) {
                      return false;
                    } else {
                      L5: {
                        if (mf.b(-6390)) {
                          var4 = (String) null;
                          tf.a(nm.field_E, qi.field_b, -84, (String) null, param0, ap.field_c);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return true;
                    }
                  }
                }
              }
            }
            return false;
          }
        } else {
          if (lk.a(1, tg.field_a, uo.field_d, jo.field_b, fj.field_lb)) {
            if ((jo.field_b ^ -1) == -3) {
              return qm.a(fj.field_lb, uo.field_d, (byte) 83, jo.field_b, tg.field_a);
            } else {
              if (var3 != 0) {
                return false;
              } else {
                return qm.a(fj.field_lb, uo.field_d, (byte) 83, jo.field_b, tg.field_a);
              }
            }
          } else {
            if ((de.field_f ^ -1) == -11) {
              if (var3 != 0) {
                return false;
              } else {
                g.a((byte) -10);
                return true;
              }
            } else {
              if (-12 == (de.field_f ^ -1)) {
                if (ff.field_m) {
                  L6: {
                    if ((nm.field_E ^ -1) != -3) {
                      break L6;
                    } else {
                      if (rm.a((byte) -126, ba.field_a, qi.field_b)) {
                        break L6;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (nm.field_E == 2) {
                    if (mf.b(-6390)) {
                      var4 = (String) null;
                      tf.a(nm.field_E, qi.field_b, -84, (String) null, param0, ap.field_c);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if (var3 == 0) {
                      if (!mf.b(-6390)) {
                        return true;
                      } else {
                        var4 = (String) null;
                        tf.a(nm.field_E, qi.field_b, -84, (String) null, param0, ap.field_c);
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        mi var2 = null;
        if (param1 <= 17) {
          mp.a(-79, -52);
          var2 = uh.field_Wb;
          var2.j(param0, 118);
          var2.f(1, 112);
          var2.f(0, 99);
          return;
        } else {
          var2 = uh.field_Wb;
          var2.j(param0, 118);
          var2.f(1, 112);
          var2.f(0, 99);
          return;
        }
    }

    static {
        field_c = "Cancel";
    }
}
