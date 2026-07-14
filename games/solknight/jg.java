/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int field_b;
    static int field_e;
    volatile boolean field_a;
    java.awt.Frame field_c;
    static boolean field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((jg) this).field_a = true;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, byte param1) {
        int var3 = SolKnight.field_L ? 1 : 0;
        qc var4 = (qc) (Object) sb.field_c.a((byte) 51);
        while (var4 != null) {
            ah.a(false, param0, var4);
            var4 = (qc) (Object) sb.field_c.b(-121);
        }
        if (param1 >= -25) {
            field_e = -52;
        }
        sd var5 = (sd) (Object) r.field_b.a((byte) 51);
        while (var5 != null) {
            fi.a(var5, param0, -24045);
            var5 = (sd) (Object) r.field_b.b(-119);
        }
    }

    final void a(int param0, dl param1) {
        if (param0 != -3680) {
            return;
        }
        de.a(param1, ((jg) this).field_c, (byte) 126);
    }

    final static void a(rl param0, int param1, boolean param2) {
        int var3 = -44 / ((param1 - 35) / 40);
        uf.a(param2, 123, 256, param0);
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!ck.a(param0.charAt(var2), true)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!ck.a(param0.charAt(var3 - 1), true)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = var3 - var2;
              if (var4 <= param1) {
                if (-13 >= var4) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L4: while (true) {
                    if (var3 <= var6) {
                      if (0 != var5.length()) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (c.a(param1 + 2, (char) var7)) {
                        var8 = we.a(2, (char) var7);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L4;
                        } else {
                          var6++;
                          continue L4;
                        }
                      } else {
                        var6++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
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

    final static void a(byte param0) {
        fb.a(param0 + 174);
        if (param0 != 81) {
            field_d = false;
        }
    }

    jg() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = -1;
        field_d = false;
    }
}
