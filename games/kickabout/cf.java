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

    public static void a() {
        field_Cb = null;
        int var1 = 0;
        field_Ib = null;
        field_Gb = null;
    }

    final static lk a(int param0, sb param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        lk stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        lk stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            int fieldTemp$9 = param1.field_c - 1;
            param1.field_c = param1.field_c - 1;
            var2_int = fieldTemp$9;
            var3 = new StringBuilder();
            var4 = param1.b(-123);
            StringBuilder discarded$10 = var3.append((char) var4);
            var5 = 0;
            L1: while (true) {
              L2: {
                if (param1.a((byte) 82)) {
                  break L2;
                } else {
                  var6 = param1.b(-51);
                  if (var5 != 0) {
                    StringBuilder discarded$11 = var3.append((char) var6);
                    var5 = 0;
                    continue L1;
                  } else {
                    L3: {
                      if (var6 == 92) {
                        var5 = 1;
                        break L3;
                      } else {
                        StringBuilder discarded$12 = var3.append((char) var6);
                        break L3;
                      }
                    }
                    if (var6 != var4) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (var4 != 34) {
                  stackOut_12_0 = v.field_d;
                  stackIn_13_0 = stackOut_12_0;
                  break L4;
                } else {
                  stackOut_11_0 = rb.field_Mb;
                  stackIn_13_0 = stackOut_11_0;
                  break L4;
                }
              }
              var6 = stackIn_13_0;
              stackOut_15_0 = new lk(var6, var2_int, var3.toString());
              stackIn_16_0 = stackOut_15_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("cf.D(").append(-9323).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        qa.field_E.a(true, 640, 5, 0, param5);
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
              if (((cf) this).field_Ab == 6) {
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
        RuntimeException var3 = null;
        Object var4 = null;
        Object stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        Object stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        Object stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Object stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        Object stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        Object stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        Object stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        Object stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        Object stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        Object stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_g != ((cf) this).field_yb) {
                break L1;
              } else {
                if (param1.field_j == ((cf) this).field_Ab) {
                  L2: {
                    ((cf) this).field_Eb = param1.field_c;
                    ((cf) this).field_Hb = param1.field_f;
                    stackOut_4_0 = this;
                    stackOut_4_1 = new StringBuilder().append("");
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (!param1.field_i) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                      stackOut_6_2 = Integer.toString(1 + param1.field_g);
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                      stackOut_5_2 = "=";
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L2;
                    }
                  }
                  L3: {
                    ((cf) this).field_Bb = stackIn_7_2;
                    stackOut_7_0 = this;
                    stackOut_7_1 = new StringBuilder().append("");
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (param1.field_j == 6) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                      stackOut_9_2 = Integer.toString(param1.field_h);
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L3;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                      stackOut_8_2 = Integer.toString(param1.field_e);
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L3;
                    }
                  }
                  L4: {
                    ((cf) this).field_zb = stackIn_10_2;
                    ((cf) this).field_Jb = 16777215;
                    if (param1.field_b) {
                      ((cf) this).field_Jb = 16711680;
                      break L4;
                    } else {
                      if (param1.field_a) {
                        ((cf) this).field_Jb = 65280;
                        break L4;
                      } else {
                        if (null == ((cf) this).field_Hb) {
                          break L4;
                        } else {
                          if (null == bg.field_r) {
                            break L4;
                          } else {
                            if (!((cf) this).field_Hb.equalsIgnoreCase(bg.field_r)) {
                              break L4;
                            } else {
                              ((cf) this).field_Jb = 65280;
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param0 == 59) {
                    break L0;
                  } else {
                    var4 = null;
                    ((cf) this).a((byte) 88, (bc) null);
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("cf.B(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
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
