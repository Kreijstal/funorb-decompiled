/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po {
    int field_h;
    String field_g;
    mf field_b;
    String field_d;
    static ad field_e;
    static String field_c;
    static int field_a;
    String field_f;

    final static void a(boolean param0) {
        if (!param0) {
            return;
        }
        sq.field_c = new kb(re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t);
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        int var1 = -88 % ((param0 - 44) / 45);
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 != 13) {
            return;
        }
        if (224 <= ul.field_p) {
            wp.a(1, 256);
        } else {
            var1 = ul.field_p % 32;
            wp.a(param0 ^ 12, 32 + (ul.field_p - var1));
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = kj.field_D.getGraphics();
                  if (eo.field_g != null) {
                    break L2;
                  } else {
                    eo.field_g = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (!param3) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, to.field_b, be.field_g);
                    break L3;
                  }
                }
                L4: {
                  if (param1 != null) {
                    break L4;
                  } else {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null == oj.field_r) {
                        oj.field_r = kj.field_D.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = oj.field_r.getGraphics();
                    var10.setColor(param1);
                    var10.drawRect(0, param4, 303, 33);
                    var10.fillRect(2, 2, param2 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(2 + 3 * param2, 2, -(3 * param2) + 300, 30);
                    var10.setFont(eo.field_g);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param0, (-(param0.length() * 6) + 304) / 2, 22);
                    var9.drawImage(oj.field_r, to.field_b / 2 - 152, be.field_g / 2 + -18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + to.field_b / 2;
                    var8 = be.field_g / 2 + -18;
                    var9.setColor(param1);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 + 2, param2 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 - -1, var8 - -1, 301, 31);
                    var9.fillRect(2 + var7 + param2 * 3, var8 + 2, 300 - param2 * 3, 30);
                    var9.setFont(eo.field_g);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param0, var7 - -((-(param0.length() * 6) + 304) / 2), 22 + var8);
                    break L7;
                  }
                }
                L8: {
                  if (oi.field_g != null) {
                    var9.setFont(eo.field_g);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(oi.field_g, to.field_b / 2 - 6 * oi.field_g.length() / 2, -26 + be.field_g / 2);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                kj.field_D.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5_ref);

            stackIn_20_1 = new StringBuilder().append("po.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L10;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L11;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L11;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        int stackIn_13_0 = 0;
        boolean stackIn_18_0 = false;
        boolean stackIn_19_0 = false;
        int stackIn_19_1 = 0;
        String[] stackIn_25_0 = null;
        tp[] stackIn_28_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ak var4 = null;
        ak var5 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = pe.field_o.field_w;
            var5 = var4;
            ec.field_Q = oa.field_Sb;
            ci.field_r = pe.field_o.field_p;
            eg.field_k = pe.field_o.c(124);
            cb.field_n = pe.field_o.field_n;
            sk.field_I = pe.field_o.field_w.field_k;
            fh.field_h = new String[sk.field_I];
            var2 = 0;
            L1: while (true) {
              if (var2 >= sk.field_I) {
                pi.field_o = new int[var5.field_m.length];
                var2 = 0;
                L2: while (true) {
                  if (var5.field_m.length <= var2) {
                    da.field_C = new int[sk.field_I];
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= sk.field_I) {
                        L4: {
                          if (ci.field_r) {
                            stackIn_13_0 = 0;
                            break L4;
                          } else {
                            stackIn_13_0 = 1;
                            break L4;
                          }
                        }
                        L5: {
                          wk.field_p = stackIn_13_0 != 0;
                          if (eg.field_k) {
                            break L5;
                          } else {
                            var2 = 0;
                            L6: while (true) {
                              if (pi.field_o.length <= var2) {
                                break L5;
                              } else {
                                L7: {
                                  stackIn_18_0 = wk.field_p;

                                  if ((pe.field_o.field_k ^ -1) != (var5.field_m[var2] ^ -1)) {
                                    stackIn_19_0 = stackIn_18_0;
                                    stackIn_19_1 = 0;
                                    break L7;
                                  } else {
                                    stackIn_19_0 = stackIn_18_0;
                                    stackIn_19_1 = 1;
                                    break L7;
                                  }
                                }
                                wk.field_p = stackIn_19_0 | stackIn_19_1 != 0;
                                var2++;
                                continue L6;
                              }
                            }
                          }
                        }
                        L8: {
                          if (ci.field_r) {
                            if (cb.field_n) {
                              stackIn_25_0 = hm.field_b;
                              break L8;
                            } else {
                              stackIn_25_0 = ih.field_j;
                              break L8;
                            }
                          } else {
                            stackIn_25_0 = ar.field_a;
                            break L8;
                          }
                        }
                        L9: {
                          sj.field_c = stackIn_25_0;
                          var2 = 57 % ((-7 - param0) / 42);
                          if (sk.field_I == 2) {
                            stackIn_28_0 = me.field_a;
                            break L9;
                          } else {
                            stackIn_28_0 = pl.field_f;
                            break L9;
                          }
                        }
                        qp.field_e = stackIn_28_0;
                        break L0;
                      } else {
                        da.field_C[var2] = var5.field_l[var2].field_H;
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    pi.field_o[var2] = var5.field_m[var2];
                    var2++;
                    continue L2;
                  }
                }
              } else {
                fh.field_h[var2] = var4.field_f[var2];
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "po.A(" + param0 + ')');
        }
    }

    static {
        field_a = 0;
        field_c = "Not yet achieved";
    }
}
