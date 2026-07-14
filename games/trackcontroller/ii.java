/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ii extends gb {
    static qj field_p;
    static int field_o;
    static int[] field_q;
    static qj[] field_r;
    static java.awt.Frame field_s;

    final static int b(boolean param0) {
        if (param0) {
            ii.a((byte) 79);
            return oi.field_b;
        }
        return oi.field_b;
    }

    final static void a(byte param0) {
        Object var1 = null;
        li var1_ref = null;
        int var2 = 0;
        var1 = null;
        var2 = TrackController.field_F ? 1 : 0;
        sb.field_b.b();
        if (param0 <= -57) {
          g.field_x.b();
          id.field_e = id.field_e - 1;
          if (0 == id.field_e) {
            id.field_e = 200;
            var1_ref = (li) (Object) kd.field_a.b(2);
            L0: while (true) {
              if (var1_ref == null) {
                L1: {
                  if (jk.field_c == null) {
                    break L1;
                  } else {
                    var1_ref = (li) (Object) jk.field_c.b(2);
                    L2: while (true) {
                      if (var1_ref == null) {
                        break L1;
                      } else {
                        if (var1_ref.field_k.b(10000536)) {
                          var1_ref = (li) (Object) jk.field_c.a(10);
                          continue L2;
                        } else {
                          var1_ref.a(-29);
                          var1_ref = (li) (Object) jk.field_c.a(10);
                          continue L2;
                        }
                      }
                    }
                  }
                }
                L3: {
                  if (null == fj.field_P) {
                    break L3;
                  } else {
                    if (!fj.field_P.c((byte) -64)) {
                      ch.field_n = null;
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L4: {
                  if (!var1_ref.field_k.b(10000536)) {
                    var1_ref.a(-40);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var1_ref = (li) (Object) kd.field_a.a(10);
                continue L0;
              }
            }
          } else {
            L5: {
              if (null == fj.field_P) {
                break L5;
              } else {
                if (!fj.field_P.c((byte) -64)) {
                  ch.field_n = null;
                  break L5;
                } else {
                  return;
                }
              }
            }
            return;
          }
        } else {
          field_o = 87;
          g.field_x.b();
          id.field_e = id.field_e - 1;
          if (0 == id.field_e) {
            id.field_e = 200;
            var1_ref = (li) (Object) kd.field_a.b(2);
            L6: while (true) {
              if (var1_ref == null) {
                if (jk.field_c != null) {
                  var1_ref = (li) (Object) jk.field_c.b(2);
                  L7: while (true) {
                    if (var1_ref != null) {
                      if (var1_ref.field_k.b(10000536)) {
                        var1_ref = (li) (Object) jk.field_c.a(10);
                        continue L7;
                      } else {
                        var1_ref.a(-29);
                        var1_ref = (li) (Object) jk.field_c.a(10);
                        continue L7;
                      }
                    } else {
                      L8: {
                        if (null == fj.field_P) {
                          break L8;
                        } else {
                          if (!fj.field_P.c((byte) -64)) {
                            ch.field_n = null;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L9: {
                    if (null == fj.field_P) {
                      break L9;
                    } else {
                      if (!fj.field_P.c((byte) -64)) {
                        ch.field_n = null;
                        break L9;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  if (!var1_ref.field_k.b(10000536)) {
                    var1_ref.a(-40);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var1_ref = (li) (Object) kd.field_a.a(10);
                continue L6;
              }
            }
          } else {
            L11: {
              if (null == fj.field_P) {
                break L11;
              } else {
                if (!fj.field_P.c((byte) -64)) {
                  ch.field_n = null;
                  break L11;
                } else {
                  return;
                }
              }
            }
            return;
          }
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_p = null;
        if (param0 != -5146) {
            field_s = null;
            field_q = null;
            field_r = null;
            return;
        }
        field_q = null;
        field_r = null;
    }

    ii() {
    }

    static {
    }
}
