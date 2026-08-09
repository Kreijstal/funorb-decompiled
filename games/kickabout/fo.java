/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo extends jd {
    static int[] field_j;

    final static void g(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = Kickabout.field_G;
        try {
          var1 = nr.field_q;
          synchronized (var1) {
            L0: {
              L1: {
                wl.field_n = vb.field_b;
                fj.field_c = fj.field_c + 1;
                if (param0 > rc.field_d) {
                  var5 = 0;
                  var2 = var5;
                  L2: while (true) {
                    if (-113 >= (var5 ^ -1)) {
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
                        ne.field_G[var2 ^ -1] = false;
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
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "fo.C(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        field_j = null;
        if (param0 < 16) {
            fo.c((byte) -116);
        }
    }

    final static void a(boolean param0, int param1, String param2, java.awt.Color param3, int param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            L0: {
              L1: {
                if (param1 < -62) {
                  break L1;
                } else {
                  field_j = (int[]) null;
                  break L1;
                }
              }
              L2: {
                var9 = ic.field_d.getGraphics();
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
                  var9.setColor(java.awt.Color.black);
                  var9.fillRect(0, 0, f.field_d, vc.field_B);
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
                  var9.drawImage(bt.field_i, f.field_d / 2 + -152, vc.field_B / 2 - 18, (java.awt.image.ImageObserver) null);
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L7: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  var7 = f.field_d / 2 + -152;
                  var8 = vc.field_B / 2 + -18;
                  var9.setColor(param3);
                  var9.drawRect(var7, var8, 303, 33);
                  var9.fillRect(var7 + 2, 2 + var8, param4 * 3, 30);
                  var9.setColor(java.awt.Color.black);
                  var9.drawRect(var7 - -1, 1 + var8, 301, 31);
                  var9.fillRect(3 * param4 + (2 + var7), 2 + var8, 300 + -(param4 * 3), 30);
                  var9.setFont(ar.field_b);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(param2, var7 + (304 + -(6 * param2.length())) / 2, var8 + 22);
                  break L7;
                }
              }
              if (wf.field_I != null) {
                var9.setFont(ar.field_b);
                var9.setColor(java.awt.Color.white);
                var9.drawString(wf.field_I, f.field_d / 2 + -(wf.field_I.length() * 6 / 2), -26 + vc.field_B / 2);
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
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("fo.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param4 + ')');
        }
    }

    final rv a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        rv stackIn_2_0 = null;
        rv stackIn_5_0 = null;
        rv stackIn_10_0 = null;
        rv stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -5) {
              var4 = (CharSequence) ((Object) param0);
              if (gr.a((byte) 15, var4)) {
                L1: {
                  var5 = (CharSequence) ((Object) param0);
                  var3_int = rr.a(10, var5);
                  if (-1 <= (var3_int ^ -1)) {
                    break L1;
                  } else {
                    if (130 >= var3_int) {
                      stackIn_12_0 = he.field_yb;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_10_0 = jt.field_Bb;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = jt.field_Bb;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (rv) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("fo.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    fo(ga param0) {
        super(param0);
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 25) {
              if (this.a(param1, -5) == jt.field_Bb) {
                stackIn_6_0 = qp.field_F;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("fo.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
    }
}
