/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static double field_b;
    static String field_c;
    static int field_d;
    static int field_a;

    final static va a(byte param0, String param1) {
        int var5 = 0;
        String var6 = null;
        va var7 = null;
        int var8 = Confined.field_J ? 1 : 0;
        if (param0 != 57) {
            Object var9 = null;
            ll.a(-57, -32, (java.awt.Canvas) null, 90);
        }
        int var2 = param1.length();
        if (var2 == 0) {
            return vf.field_q;
        }
        if (!(var2 <= 255)) {
            return m.field_g;
        }
        String[] var3 = ij.a(0, '.', param1);
        if (-3 < (var3.length ^ -1)) {
            return vf.field_q;
        }
        String[] var4 = var3;
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = ik.a((byte) -126, var6);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return ck.a(var3[var3.length + -1], (byte) 127);
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        if (param3 >= -35) {
            return;
        }
        try {
            var4 = param2.getGraphics();
            pi.field_S.a((byte) 91, var4, param1, param0);
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
    }

    final static boolean a(int param0, int param1) {
        if ((param1 << param0 & i.field_o) != 0) {
            return false;
        }
        pn.field_a.b(hl.field_b, 320, 100, 9805732, -1);
        tf.a((byte) 59, param0, 105, i.field_o);
        return true;
    }

    public static void a(boolean param0) {
        if (param0) {
            ll.a(false);
        }
        field_c = null;
    }

    final static va a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var6 = Confined.field_J ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var2 = param0.length();
        if (0 == var2) {
          return vf.field_q;
        } else {
          if ((var2 ^ -1) < -65) {
            return m.field_g;
          } else {
            if (param0.charAt(0) != 34) {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 < var2) {
                  var5 = param0.charAt(var4);
                  if (46 == var5) {
                    L2: {
                      if (-1 == (var4 ^ -1)) {
                        break L2;
                      } else {
                        if (-1 + var2 == var4) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    return ql.field_k;
                  } else {
                    if (ji.field_b.indexOf(var5) != -1) {
                      var3 = 0;
                      var4++;
                      continue L1;
                    } else {
                      return ql.field_k;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              if (param0.charAt(-1 + var2) != 34) {
                return ql.field_k;
              } else {
                var3 = 0;
                var4 = 1;
                L3: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L4: {
                        if (var3 != 0) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L4;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L4;
                        }
                      }
                      var3 = stackIn_20_0;
                      var4++;
                      continue L3;
                    } else {
                      L5: {
                        if (var5 != 34) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            return ql.field_k;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L3;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Level";
    }
}
