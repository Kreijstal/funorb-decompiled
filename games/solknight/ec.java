/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ec extends gg {
    static String field_j;
    long field_l;
    static int field_h;
    ec field_k;
    ec field_i;

    final static aj b(boolean param0) {
        if (param0) {
            field_j = null;
        }
        if (null == ji.field_b) {
            ji.field_b = new aj();
            ji.field_b.a(87, ua.field_G);
            ji.field_b.field_n = 2763306;
            ji.field_b.field_f = 14;
            ji.field_b.field_b = 7697781;
            ji.field_b.field_d = 5;
            ji.field_b.field_e = 0;
            ji.field_b.field_j = 6;
            ji.field_b.field_q = 4;
            ji.field_b.field_k = jh.field_g;
        }
        return ji.field_b;
    }

    final void a(int param0) {
        if (param0 != 97) {
            ((ec) this).field_l = 11L;
        }
        if (!(null != ((ec) this).field_k)) {
            return;
        }
        ((ec) this).field_k.field_i = ((ec) this).field_i;
        ((ec) this).field_i.field_k = ((ec) this).field_k;
        ((ec) this).field_i = null;
        ((ec) this).field_k = null;
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            field_h = 22;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 < 65) {
                break L3;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (97 > param0) {
                break L4;
              } else {
                if (param0 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          if (param2) {
            if (qg.field_c[param0] < qg.field_c[param3]) {
              return true;
            } else {
              if (qg.field_c[param3] >= qg.field_c[param0]) {
                if (l.field_a[param0] < l.field_a[param3]) {
                  return true;
                } else {
                  if (l.field_a[param3] < l.field_a[param0]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              } else {
                return false;
              }
            }
          } else {
            if (l.field_a[param0] < l.field_a[param3]) {
              return true;
            } else {
              if (l.field_a[param0] > l.field_a[param3]) {
                return false;
              } else {
                if (qg.field_c[param0] < qg.field_c[param3]) {
                  return true;
                } else {
                  if (qg.field_c[param3] >= qg.field_c[param0]) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
        }
        var4 = eh.field_a[param0] - -ld.field_M[param0] + ma.field_n[param0];
        var5 = eh.field_a[param3] - -ld.field_M[param3] - -ma.field_n[param3];
        if (var4 >= var5) {
          L1: {
            if (param1 == -66) {
              break L1;
            } else {
              field_j = null;
              break L1;
            }
          }
          if (var4 > var5) {
            return false;
          } else {
            L2: {
              if (param0 >= param3) {
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                break L2;
              } else {
                stackOut_31_0 = 1;
                stackIn_33_0 = stackOut_31_0;
                break L2;
              }
            }
            return stackIn_33_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static boolean e(int param0) {
        di var1 = null;
        int var2 = 0;
        int var3 = 0;
        di var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        var4 = (di) (Object) ga.field_E.a((byte) 51);
        var1 = var4;
        if (var1 != null) {
          var2 = 0;
          if (param0 == 7697781) {
            L0: while (true) {
              if (var2 >= var1.field_h) {
                return true;
              } else {
                L1: {
                  if (null != var4.field_k[var2]) {
                    if (var4.field_k[var2].field_c != 0) {
                      break L1;
                    } else {
                      return false;
                    }
                  } else {
                    break L1;
                  }
                }
                if (var4.field_s[var2] != null) {
                  if (var4.field_s[var2].field_c == 0) {
                    return false;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != 30418) {
            field_j = null;
        }
        return wi.a(-913, true, param1, 10);
    }

    protected ec() {
    }

    public static void d(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = ec.e(-35);
        }
        field_j = null;
    }

    static {
    }
}
