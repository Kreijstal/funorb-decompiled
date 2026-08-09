/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    private hm field_b;
    static String field_a;
    static String field_d;
    static hj field_c;
    static String field_e;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_55_0 = 0;
        int var3;
        int var4;
        var4 = Pool.field_O;
        if (param2 >= 91) {
          var3 = param1;
          if (-1 != var3) {
            if (1 != var3) {
              if ((var3 ^ -1) != -3) {
                if (var3 != 0) {
                  if (var3 == 3) {
                    L0: {
                      if (param0 != un.field_e) {
                        stackIn_50_0 = 0;
                        break L0;
                      } else {
                        stackIn_50_0 = 1;
                        break L0;
                      }
                    }
                    return stackIn_50_0 != 0;
                  } else {
                    return true;
                  }
                } else {
                  L1: {
                    if (la.field_a != param0) {
                      stackIn_55_0 = 0;
                      break L1;
                    } else {
                      stackIn_55_0 = 1;
                      break L1;
                    }
                  }
                  return stackIn_55_0 != 0;
                }
              } else {
                L2: {
                  if (param0 != re.field_f) {
                    stackIn_42_0 = 0;
                    break L2;
                  } else {
                    stackIn_42_0 = 1;
                    break L2;
                  }
                }
                return stackIn_42_0 != 0;
              }
            } else {
              L3: {
                if (param0 != er.field_W) {
                  stackIn_37_0 = 0;
                  break L3;
                } else {
                  stackIn_37_0 = 1;
                  break L3;
                }
              }
              return stackIn_37_0 != 0;
            }
          } else {
            L4: {
              if (fr.field_n != param0) {
                stackIn_32_0 = 0;
                break L4;
              } else {
                stackIn_32_0 = 1;
                break L4;
              }
            }
            return stackIn_32_0 != 0;
          }
        } else {
          en.a(93, 66, 62);
          var3 = param1;
          if (-1 != var3) {
            if (1 != var3) {
              if ((var3 ^ -1) != -3) {
                if (var3 != 0) {
                  if (var3 == 3) {
                    L5: {
                      if (param0 != un.field_e) {
                        stackIn_26_0 = 0;
                        break L5;
                      } else {
                        stackIn_26_0 = 1;
                        break L5;
                      }
                    }
                    return stackIn_26_0 != 0;
                  } else {
                    return true;
                  }
                } else {
                  L6: {
                    if (la.field_a != param0) {
                      stackIn_20_0 = 0;
                      break L6;
                    } else {
                      stackIn_20_0 = 1;
                      break L6;
                    }
                  }
                  return stackIn_20_0 != 0;
                }
              } else {
                L7: {
                  if (param0 != re.field_f) {
                    stackIn_15_0 = 0;
                    break L7;
                  } else {
                    stackIn_15_0 = 1;
                    break L7;
                  }
                }
                return stackIn_15_0 != 0;
              }
            } else {
              L8: {
                if (param0 != er.field_W) {
                  stackIn_10_0 = 0;
                  break L8;
                } else {
                  stackIn_10_0 = 1;
                  break L8;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L9: {
              if (fr.field_n != param0) {
                stackIn_5_0 = 0;
                break L9;
              } else {
                stackIn_5_0 = 1;
                break L9;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        if (ne.field_w != sq.field_b) {
            qh.f(0, 0, qh.field_l, qh.field_f, 0);
            return;
        }
        qh.d();
    }

    private en() throws Throwable {
        throw new Error();
    }

    final void a(boolean param0, int param1, int param2) {
        hm var4;
        var4 = new hm();
        if (param0) {
          return;
        } else {
          var4.a(66, 0, 0, 65536, 64);
          var4.b(true);
          this.field_b.a(3, var4);
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 8352) {
          field_a = (String) null;
          field_c = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    static {
        field_e = "<%0>";
        field_a = "<%0> has not yet unlocked this option for use.";
        field_d = "When in shot mode, the power bar will appear on the right. <u=ffffff>Rotating the cue</u> is the same as rotating around the table: <col=99ff99>Hold</col> the <img=2> <col=99ff99>right mouse button</col> (or <img=9>+<img=0> left mouse button) and <col=99ff99>drag the mouse</col>. Alternatively, you can use <img=6> and <img=5>, or <img=13> and <img=15>.";
        field_c = new hj(6, 0, 4, 2);
    }
}
