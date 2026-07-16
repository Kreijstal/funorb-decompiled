/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends hd {
    private String field_Hb;
    boolean field_Fb;
    static int field_Db;
    int field_Ab;
    int field_yb;
    String field_Bb;
    static hd field_Gb;
    private int field_Jb;
    static String field_Ib;
    static String field_Cb;
    private String field_Eb;
    private String field_zb;

    public static void a(int param0) {
        field_Cb = null;
        int var1 = -62 % ((-82 - param0) / 35);
        field_Ib = null;
        field_Gb = null;
    }

    final static lk a(int param0, sb param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var7 = Kickabout.field_G;
        int fieldTemp$4 = param1.field_c - 1;
        param1.field_c = param1.field_c - 1;
        var2 = fieldTemp$4;
        var3 = new StringBuilder();
        var4 = param1.b(-123);
        StringBuilder discarded$5 = var3.append(var4);
        var5 = 0;
        L0: while (true) {
          if (param1.a((byte) 82)) {
            L1: {
              if (var4 != 34) {
                stackOut_17_0 = v.field_d;
                stackIn_18_0 = stackOut_17_0;
                break L1;
              } else {
                stackOut_16_0 = rb.field_Mb;
                stackIn_18_0 = stackOut_16_0;
                break L1;
              }
            }
            var6 = stackIn_18_0;
            if (param0 != -9323) {
              return null;
            } else {
              return new lk(var6, var2, var3.toString());
            }
          } else {
            var6 = param1.b(-51);
            if (var5 != 0) {
              StringBuilder discarded$6 = var3.append(var6);
              var5 = 0;
              continue L0;
            } else {
              L2: {
                if (var6 == 92) {
                  var5 = 1;
                  break L2;
                } else {
                  StringBuilder discarded$7 = var3.append(var6);
                  break L2;
                }
              }
              if (var6 != var4) {
                continue L0;
              } else {
                L3: {
                  if (var4 != 34) {
                    stackOut_9_0 = v.field_d;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = rb.field_Mb;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                var6 = stackIn_10_0;
                if (param0 != -9323) {
                  return null;
                } else {
                  return new lk(var6, var2, var3.toString());
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        qa.field_E.a(true, param2, param3, param6, param5);
        if (null != dr.field_g) {
          dr.field_g.a(false, param4, param4 + -fb.field_I, param1, param5, param5);
          var7 = 80 / ((68 - param0) / 48);
          return;
        } else {
          var7 = 80 / ((68 - param0) / 48);
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if ((((cf) this).field_yb & 1) == 0) {
            stackOut_2_0 = 196;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        on.a(((cf) this).field_F, ((cf) this).field_T, 40, ((cf) this).field_mb, 0, var2);
        on.a(46 + ((cf) this).field_F, ((cf) this).field_T, 196, ((cf) this).field_mb, 0, var2);
        on.a(248 + ((cf) this).field_F, ((cf) this).field_T, 70, ((cf) this).field_mb, 0, var2);
        if (null != ((cf) this).field_Hb) {
          if (null == ((cf) this).field_Eb) {
            q.field_d.a(uf.field_a, ((cf) this).field_F + 60, 4 + (((cf) this).field_T - -(((cf) this).field_mb / 2)), ((cf) this).field_Jb, -1);
            var3 = 52 % ((-31 - param0) / 59);
            return;
          } else {
            L1: {
              q.field_d.a(((cf) this).field_Bb, ((cf) this).field_F + 5, 4 + ((cf) this).field_mb / 2 + ((cf) this).field_T, ((cf) this).field_Jb, -1);
              q.field_d.a(((cf) this).field_Eb.toUpperCase(), 60 + ((cf) this).field_F, ((cf) this).field_mb / 2 + ((cf) this).field_T - -4, ((cf) this).field_Jb, -1);
              var3 = ((cf) this).field_Jb;
              if ((((cf) this).field_Ab ^ -1) == -7) {
                var3 = 16777028;
                break L1;
              } else {
                break L1;
              }
            }
            q.field_d.a(((cf) this).field_zb, 258 + ((cf) this).field_F, 4 + ((cf) this).field_mb / 2 + ((cf) this).field_T, var3, -1);
            var3 = 52 % ((-31 - param0) / 59);
            return;
          }
        } else {
          q.field_d.a(uf.field_a, ((cf) this).field_F + 60, 4 + (((cf) this).field_T - -(((cf) this).field_mb / 2)), ((cf) this).field_Jb, -1);
          var3 = 52 % ((-31 - param0) / 59);
          return;
        }
    }

    final void c(boolean param0) {
        if (!param0) {
          ((cf) this).field_Bb = null;
          ((cf) this).h((byte) 103);
          cu.field_a.a((gn) this, 3);
          return;
        } else {
          ((cf) this).h((byte) 103);
          cu.field_a.a((gn) this, 3);
          return;
        }
    }

    final void h(byte param0) {
        ((cf) this).field_Fb = false;
        if (param0 <= 100) {
            return;
        }
        ((cf) this).field_Eb = null;
        ((cf) this).field_zb = null;
        ((cf) this).field_Hb = null;
    }

    final void a(byte param0, bc param1) {
        Object var4 = null;
        Object stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        Object stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        Object stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        Object stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Object stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        Object stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        Object stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        Object stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        Object stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        if (param1.field_g == ((cf) this).field_yb) {
          if (param1.field_j == ((cf) this).field_Ab) {
            L0: {
              ((cf) this).field_Eb = param1.field_c;
              ((cf) this).field_Hb = param1.field_f;
              stackOut_5_0 = this;
              stackOut_5_1 = new StringBuilder().append("");
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (!param1.field_i) {
                stackOut_7_0 = this;
                stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                stackOut_7_2 = Integer.toString(1 + param1.field_g);
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L0;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                stackOut_6_2 = "=";
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                break L0;
              }
            }
            L1: {
              ((cf) this).field_Bb = stackIn_8_2;
              stackOut_8_0 = this;
              stackOut_8_1 = new StringBuilder().append("");
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (-7 == (param1.field_j ^ -1)) {
                stackOut_10_0 = this;
                stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                stackOut_10_2 = Integer.toString(param1.field_h);
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L1;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                stackOut_9_2 = Integer.toString(param1.field_e);
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                break L1;
              }
            }
            ((cf) this).field_zb = stackIn_11_2;
            ((cf) this).field_Jb = 16777215;
            if (param1.field_b) {
              ((cf) this).field_Jb = 16711680;
              if (param0 != 59) {
                var4 = null;
                ((cf) this).a((byte) 88, (bc) null);
                return;
              } else {
                return;
              }
            } else {
              if (param1.field_a) {
                ((cf) this).field_Jb = 65280;
                if (param0 != 59) {
                  var4 = null;
                  ((cf) this).a((byte) 88, (bc) null);
                  return;
                } else {
                  return;
                }
              } else {
                if (null != ((cf) this).field_Hb) {
                  if (null != bg.field_r) {
                    if (!((cf) this).field_Hb.equalsIgnoreCase(bg.field_r)) {
                      if (param0 != 59) {
                        var4 = null;
                        ((cf) this).a((byte) 88, (bc) null);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((cf) this).field_Jb = 65280;
                      if (param0 != 59) {
                        var4 = null;
                        ((cf) this).a((byte) 88, (bc) null);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param0 != 59) {
                      var4 = null;
                      ((cf) this).a((byte) 88, (bc) null);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param0 != 59) {
                    var4 = null;
                    ((cf) this).a((byte) 88, (bc) null);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    cf() {
        ((cf) this).field_Jb = 16777215;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ib = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_Cb = "<%0> has withdrawn the request to join.";
    }
}
