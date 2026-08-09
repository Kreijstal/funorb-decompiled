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
        int fieldTemp$5 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        lk stackIn_15_0 = null;
        lk stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            fieldTemp$5 = param1.field_c - 1;
            param1.field_c = param1.field_c - 1;
            var2_int = fieldTemp$5;
            var3 = new StringBuilder();
            var4 = param1.b(-123);
            discarded$6 = var3.append((char) var4);
            var5 = 0;
            L1: while (true) {
              L2: {
                if (param1.a((byte) 82)) {
                  break L2;
                } else {
                  var6 = param1.b(-51);
                  if (var5 != 0) {
                    discarded$7 = var3.append((char) var6);
                    var5 = 0;
                    continue L1;
                  } else {
                    L3: {
                      if (var6 == 92) {
                        var5 = 1;
                        break L3;
                      } else {
                        discarded$8 = var3.append((char) var6);
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
                  stackIn_13_0 = v.field_d;
                  break L4;
                } else {
                  stackIn_13_0 = rb.field_Mb;
                  break L4;
                }
              }
              var6 = stackIn_13_0;
              if (param0 == -9323) {
                stackIn_17_0 = new lk(var6, var2_int, var3.toString());
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_15_0 = (lk) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("cf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_17_0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
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
        int var2;
        int var3;
        int stackIn_3_0 = 0;
        L0: {
          if ((this.field_yb & 1) == 0) {
            stackIn_3_0 = 196;
            break L0;
          } else {
            stackIn_3_0 = 0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        on.a(this.field_F, this.field_T, 40, this.field_mb, 0, var2);
        on.a(46 + this.field_F, this.field_T, 196, this.field_mb, 0, var2);
        on.a(248 + this.field_F, this.field_T, 70, this.field_mb, 0, var2);
        if (null != this.field_Hb) {
          if (null == this.field_Eb) {
            q.field_d.a(uf.field_a, this.field_F + 60, 4 + (this.field_T - -(this.field_mb / 2)), this.field_Jb, -1);
            var3 = 52 % ((-31 - param0) / 59);
            return;
          } else {
            L1: {
              q.field_d.a(this.field_Bb, this.field_F + 5, 4 + this.field_mb / 2 + this.field_T, this.field_Jb, -1);
              q.field_d.a(this.field_Eb.toUpperCase(), 60 + this.field_F, this.field_mb / 2 + this.field_T - -4, this.field_Jb, -1);
              var3 = this.field_Jb;
              if ((this.field_Ab ^ -1) == -7) {
                var3 = 16777028;
                break L1;
              } else {
                break L1;
              }
            }
            q.field_d.a(this.field_zb, 258 + this.field_F, 4 + this.field_mb / 2 + this.field_T, var3, -1);
            var3 = 52 % ((-31 - param0) / 59);
            return;
          }
        } else {
          q.field_d.a(uf.field_a, this.field_F + 60, 4 + (this.field_T - -(this.field_mb / 2)), this.field_Jb, -1);
          var3 = 52 % ((-31 - param0) / 59);
          return;
        }
    }

    final void c(boolean param0) {
        if (!param0) {
          this.field_Bb = (String) null;
          this.h((byte) 103);
          cu.field_a.a((gn) (this), 3);
          return;
        } else {
          this.h((byte) 103);
          cu.field_a.a((gn) (this), 3);
          return;
        }
    }

    final void h(byte param0) {
        this.field_Fb = false;
        if (param0 <= 100) {
            return;
        }
        this.field_Eb = null;
        this.field_zb = null;
        this.field_Hb = null;
    }

    final void a(byte param0, bc param1) {
        Object stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        Object stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Object stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        bc var4 = null;
        try {
          L0: {
            L1: {
              if (param1.field_g != this.field_yb) {
                break L1;
              } else {
                if (param1.field_j == this.field_Ab) {
                  L2: {
                    this.field_Eb = param1.field_c;
                    this.field_Hb = param1.field_f;
                    stackIn_6_0 = this;

                    stackIn_6_1 = new StringBuilder().append("");

                    if (!param1.field_i) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                      stackIn_7_2 = Integer.toString(1 + param1.field_g);
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                      stackIn_7_2 = "=";
                      break L2;
                    }
                  }
                  L3: {
                    ((cf) (this)).field_Bb = stackIn_7_2;
                    stackIn_9_0 = this;

                    stackIn_9_1 = new StringBuilder().append("");

                    if (-7 == (param1.field_j ^ -1)) {
                      stackIn_10_0 = this;
                      stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                      stackIn_10_2 = Integer.toString(param1.field_h);
                      break L3;
                    } else {
                      stackIn_10_0 = this;
                      stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                      stackIn_10_2 = Integer.toString(param1.field_e);
                      break L3;
                    }
                  }
                  L4: {
                    ((cf) (this)).field_zb = stackIn_10_2;
                    this.field_Jb = 16777215;
                    if (param1.field_b) {
                      this.field_Jb = 16711680;
                      break L4;
                    } else {
                      if (param1.field_a) {
                        this.field_Jb = 65280;
                        break L4;
                      } else {
                        if (null == this.field_Hb) {
                          break L4;
                        } else {
                          if (null == bg.field_r) {
                            break L4;
                          } else {
                            if (!this.field_Hb.equalsIgnoreCase(bg.field_r)) {
                              break L4;
                            } else {
                              this.field_Jb = 65280;
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
                    var4 = (bc) null;
                    this.a((byte) 88, (bc) null);
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
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("cf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    cf() {
        this.field_Jb = 16777215;
    }

    static {
        field_Ib = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_Cb = "<%0> has withdrawn the request to join.";
    }
}
