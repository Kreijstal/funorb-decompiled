/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo extends jd {
    static int[] field_j;

    final static void g(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        var1 = (Object) (Object) nr.field_q;
        synchronized (var1) {
          L0: {
            L1: {
              wl.field_n = vb.field_b;
              fj.field_c = fj.field_c + 1;
              if (param0 > rc.field_d) {
                var5 = 0;
                var2 = var5;
                L2: while (true) {
                  if (-113 <= var5) {
                    rc.field_d = tv.field_i;
                    break L1;
                  } else {
                    ne.field_G[var5] = false;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                L3: while (true) {
                  if (rc.field_d == tv.field_i) {
                    break L1;
                  } else {
                    var2 = mp.field_j[tv.field_i];
                    tv.field_i = 1 + tv.field_i & 127;
                    if (-1 >= (var2 ^ -1)) {
                      ne.field_G[var2] = true;
                      continue L3;
                    } else {
                      ne.field_G[var2] = false;
                      continue L3;
                    }
                  }
                }
              }
            }
            vb.field_b = du.field_j;
            break L0;
          }
        }
    }

    public static void c(byte param0) {
        field_j = null;
        if (param0 < 16) {
            fo.c((byte) -116);
        }
    }

    final static void a(boolean param0, int param1, String param2, java.awt.Color param3, int param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        java.awt.Graphics var9_ref = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -62) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            L2: {
              var9_ref = ic.field_d.getGraphics();
              if (null != ar.field_b) {
                break L2;
              } else {
                ar.field_b = new java.awt.Font("Helvetica", 1, 13);
                break L2;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                var9_ref.setColor(java.awt.Color.black);
                var9_ref.fillRect(0, 0, f.field_d, vc.field_B);
                break L3;
              }
            }
            L4: {
              if (param3 != null) {
                break L4;
              } else {
                param3 = new java.awt.Color(140, 17, 17);
                break L4;
              }
            }
            try {
              L5: {
                L6: {
                  if (bt.field_i != null) {
                    break L6;
                  } else {
                    bt.field_i = ic.field_d.createImage(304, 34);
                    break L6;
                  }
                }
                var10 = bt.field_i.getGraphics();
                var10.setColor(param3);
                var10.drawRect(0, 0, 303, 33);
                var10.fillRect(2, 2, param4 * 3, 30);
                var10.setColor(java.awt.Color.black);
                var10.drawRect(1, 1, 301, 31);
                var10.fillRect(2 + 3 * param4, 2, -(3 * param4) + 300, 30);
                var10.setFont(ar.field_b);
                var10.setColor(java.awt.Color.white);
                var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                boolean discarded$1 = var9_ref.drawImage(bt.field_i, f.field_d / 2 + -152, vc.field_B / 2 - 18, (java.awt.image.ImageObserver) null);
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var7 = f.field_d / 2 + -152;
                var8 = vc.field_B / 2 + -18;
                var9_ref.setColor(param3);
                var9_ref.drawRect(var7, var8, 303, 33);
                var9_ref.fillRect(var7 + 2, 2 + var8, param4 * 3, 30);
                var9_ref.setColor(java.awt.Color.black);
                var9_ref.drawRect(var7 - -1, 1 + var8, 301, 31);
                var9_ref.fillRect(3 * param4 + (2 + var7), 2 + var8, 300 + -(param4 * 3), 30);
                var9_ref.setFont(ar.field_b);
                var9_ref.setColor(java.awt.Color.white);
                var9_ref.drawString(param2, var7 + (304 + -(6 * param2.length())) / 2, var8 + 22);
                break L7;
              }
            }
            if (wf.field_I != null) {
              var9_ref.setFont(ar.field_b);
              var9_ref.setColor(java.awt.Color.white);
              var9_ref.drawString(wf.field_I, f.field_d / 2 + -(wf.field_I.length() * 6 / 2), -26 + vc.field_B / 2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (Exception) (Object) decompiledCaughtException;
          ic.field_d.repaint();
          return;
        }
    }

    final rv a(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        if (param1 == -5) {
          var4 = (CharSequence) (Object) param0;
          if (gr.a((byte) 15, var4)) {
            var5 = (CharSequence) (Object) param0;
            var3 = rr.a(10, var5);
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return jt.field_Bb;
              } else {
                return he.field_yb;
              }
            } else {
              return jt.field_Bb;
            }
          } else {
            return jt.field_Bb;
          }
        } else {
          return null;
        }
    }

    fo(ga param0) {
        super(param0);
    }

    final String a(byte param0, String param1) {
        if (param0 != 25) {
            return null;
        }
        if (((fo) this).a(param1, -5) != jt.field_Bb) {
            return null;
        }
        return qp.field_F;
    }

    static {
    }
}
