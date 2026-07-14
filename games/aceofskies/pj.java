/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pj {
    static es field_a;
    int[] field_e;
    static eg field_f;
    int field_b;
    int field_c;
    java.awt.Image field_d;

    final static tp c(byte param0) {
        if (param0 > -61) {
            pj.a((byte) 38);
            return qn.field_b;
        }
        return qn.field_b;
    }

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final void a(int param0) {
        vp.a(((pj) this).field_e, ((pj) this).field_c, ((pj) this).field_b);
        if (param0 != -12595) {
            field_f = (eg) null;
        }
    }

    public static void a(byte param0) {
        int var1 = 18 % ((param0 - -44) / 47);
        field_f = null;
        field_a = null;
    }

    final static void b(byte param0) {
        ak.field_d.d((ea) (Object) new tn(), -30244);
        if (param0 >= -21) {
            s var2 = (s) null;
            pj.a(19, (s) null);
        }
    }

    final static void a(int param0, s param1) {
        int var2 = 0;
        int var4 = 0;
        s var5 = null;
        s var6 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (null != ((s) param1).field_j) {
          if (param0 != ((s) param1).field_a) {
            var2 = 0;
            L0: while (true) {
              if (dd.field_a > var2) {
                var6 = ve.field_b[var2];
                if (2 == ((s) var6).field_f) {
                  if (((s) param1).field_a == ((s) var6).field_a) {
                    if (((s) var6).field_b == ((s) param1).field_b) {
                      return;
                    } else {
                      var2++;
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                L1: {
                  if (((s) param1).field_k == null) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
                tr.a(param1, param0 + -96);
                return;
              }
            }
          } else {
            if (0 != ((s) param1).field_b) {
              var2 = 0;
              if (dd.field_a > var2) {
                var5 = ve.field_b[var2];
                if (2 == ((s) var5).field_f) {
                  if (((s) param1).field_a == ((s) var5).field_a) {
                    if (((s) var5).field_b == ((s) param1).field_b) {
                      return;
                    } else {
                      L2: {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        if (((s) param1).field_k == null) {
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      tr.a(param1, param0 + -96);
                      return;
                    }
                  } else {
                    L3: {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      if (((s) param1).field_k == null) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    tr.a(param1, param0 + -96);
                    return;
                  }
                } else {
                  var2++;
                  L4: {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    if (((s) param1).field_k == null) {
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  tr.a(param1, param0 + -96);
                  return;
                }
              } else {
                L5: {
                  if (((s) param1).field_k == null) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                tr.a(param1, param0 + -96);
                return;
              }
            } else {
              L6: {
                if (((s) param1).field_k == null) {
                  break L6;
                } else {
                  break L6;
                }
              }
              tr.a(param1, param0 + -96);
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract void a(byte param0, int param1, int param2, java.awt.Component param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new eg();
    }
}
