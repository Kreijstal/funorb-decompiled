/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    private int field_e;
    pb field_b;
    private int field_h;
    static int field_g;
    private boolean field_j;
    private int field_i;
    private int field_a;
    static int field_c;
    pb[] field_d;
    private int field_f;

    final db a(byte param0, pb[] param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 72) {
                break L1;
              } else {
                ((db) this).field_a = -127;
                break L1;
              }
            }
            ((db) this).field_d = param1;
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("db.I(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return (db) this;
    }

    final db a(byte param0, boolean param1) {
        ((db) this).field_j = param1 ? true : false;
        if (param0 <= 123) {
            return null;
        }
        return (db) this;
    }

    final void a(tc param0, db param1, int param2, int param3, rj param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (((db) this).field_j) {
                param1.a(param3, param0, param4, 2, param5);
                param1.a((byte) 120);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 <= ((db) this).field_e) {
                param1.field_e = ((db) this).field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((db) this).field_h >= -1) {
                param1.field_h = ((db) this).field_h;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != ((db) this).field_d) {
                param1.field_d = ((db) this).field_d;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var7_int = 64 / ((-22 - param2) / 60);
              if (-2147483648 == ((db) this).field_a) {
                break L5;
              } else {
                param1.field_a = ((db) this).field_a;
                break L5;
              }
            }
            L6: {
              if (-2147483648 == ((db) this).field_f) {
                break L6;
              } else {
                param1.field_f = ((db) this).field_f;
                break L6;
              }
            }
            L7: {
              if (-2147483648 != ((db) this).field_i) {
                param1.field_i = ((db) this).field_i;
                break L7;
              } else {
                break L7;
              }
            }
            if (null == ((db) this).field_b) {
              break L0;
            } else {
              param1.field_b = ((db) this).field_b;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("db.K(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param5 + ')');
        }
    }

    final db a(int param0, boolean param1) {
        if (param1) {
            ((db) this).field_i = -34;
            ((db) this).field_i = param0;
            return (db) this;
        }
        ((db) this).field_i = param0;
        return (db) this;
    }

    final db a(int param0, int param1) {
        if (param0 != -1) {
            ((db) this).field_e = 114;
            ((db) this).field_e = param1;
            return (db) this;
        }
        ((db) this).field_e = param1;
        return (db) this;
    }

    final db a(boolean param0, int param1) {
        ((db) this).field_h = param1;
        if (param0) {
            db discarded$0 = ((db) this).a(-120, false);
            return (db) this;
        }
        return (db) this;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = stellarshard.field_B;
        ii.field_F = null;
        ck.field_db = false;
        var1 = -66 % ((74 - param0) / 34);
        if (!gk.field_a) {
          var2 = ag.field_c;
          if (0 < var2) {
            if (var2 == 1) {
              ii.field_F = lj.field_C;
              ii.field_F = ei.a(new CharSequence[3], (byte) 127);
              ei.field_G.o(3);
              int discarded$4 = -21923;
              qh.b();
              return;
            } else {
              ii.field_F = h.a(be.field_e, 0, new String[1]);
              ii.field_F = ei.a(new CharSequence[3], (byte) 127);
              ei.field_G.o(3);
              int discarded$5 = -21923;
              qh.b();
              return;
            }
          } else {
            ei.field_G.o(3);
            int discarded$6 = -21923;
            qh.b();
            return;
          }
        } else {
          ei.field_G.h((byte) 52);
          return;
        }
    }

    final void a(db param0, boolean param1) {
        param0.field_f = ((db) this).field_f;
        param0.field_d = ((db) this).field_d;
        param0.field_b = ((db) this).field_b;
        if (!param1) {
            return;
        }
        try {
            param0.field_j = ((db) this).field_j;
            param0.field_i = ((db) this).field_i;
            param0.field_e = ((db) this).field_e;
            param0.field_h = ((db) this).field_h;
            param0.field_a = ((db) this).field_a;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "db.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static StringBuilder a(int param0, byte param1, char param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            var4_int = param3.length();
            param3.setLength(0);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= 0) {
                stackOut_4_0 = (StringBuilder) param3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                param3.setCharAt(var5, ' ');
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("db.C(").append(0).append(',').append(61).append(',').append(' ').append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final void a(byte param0) {
        if (param0 <= 6) {
          return;
        } else {
          ((db) this).field_h = -1;
          ((db) this).field_e = 0;
          ((db) this).field_b = null;
          ((db) this).field_f = 256;
          ((db) this).field_i = 0;
          ((db) this).field_a = 0;
          ((db) this).field_d = null;
          return;
        }
    }

    final db b(int param0, int param1) {
        if (param0 != -2147483648) {
            ((db) this).field_b = null;
            ((db) this).field_a = param1;
            return (db) this;
        }
        ((db) this).field_a = param1;
        return (db) this;
    }

    db() {
        ((db) this).field_b = null;
        ((db) this).field_j = false;
        ((db) this).field_e = -2;
        ((db) this).field_h = -2;
        ((db) this).field_a = -2147483648;
        ((db) this).field_i = -2147483648;
        ((db) this).field_d = null;
        ((db) this).field_f = -2147483648;
    }

    final void a(int param0, tc param1, rj param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        bd stackIn_18_0 = null;
        String stackIn_18_1 = null;
        bd stackIn_19_0 = null;
        String stackIn_19_1 = null;
        bd stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        bd stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        bd stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        bd stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        bd stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        bd stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        bd stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        int stackIn_26_8 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        bd stackOut_17_0 = null;
        String stackOut_17_1 = null;
        bd stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        bd stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        bd stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        bd stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        bd stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        bd stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        bd stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        bd stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              ed.a(param3 + -6315, param4 - -param2.field_w, param0 + param2.field_k, ((db) this).field_d, param2.field_p, param2.field_t);
              if (((db) this).field_b != null) {
                L2: {
                  var6_int = param4 - -param2.field_w - -((db) this).field_i;
                  if (param1.field_h != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param2.field_p + -((db) this).field_b.field_w) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = param0 - (-param2.field_k - ((db) this).field_a);
                  if (2 != param1.field_h) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-((db) this).field_b.field_w + param2.field_p);
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_d != 1) {
                    break L4;
                  } else {
                    var7 = var7 + (-((db) this).field_b.field_x + param2.field_t) / 2;
                    break L4;
                  }
                }
                L5: {
                  if (2 != param1.field_d) {
                    break L5;
                  } else {
                    var7 = var7 + (-((db) this).field_b.field_x + param2.field_t);
                    break L5;
                  }
                }
                ((db) this).field_b.e(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              if (param3 == 2) {
                break L6;
              } else {
                ((db) this).field_d = null;
                break L6;
              }
            }
            L7: {
              var6_ref = param1.b(param2, 0);
              if (var6_ref == null) {
                break L7;
              } else {
                if (null == param1.field_a) {
                  break L7;
                } else {
                  if (0 <= ((db) this).field_e) {
                    L8: {
                      stackOut_17_0 = param1.field_a;
                      stackOut_17_1 = (String) var6_ref;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (((db) this).field_i == -2147483648) {
                        stackOut_19_0 = (bd) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) (Object) stackIn_19_1;
                        stackOut_19_2 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        break L8;
                      } else {
                        stackOut_18_0 = (bd) (Object) stackIn_18_0;
                        stackOut_18_1 = (String) (Object) stackIn_18_1;
                        stackOut_18_2 = ((db) this).field_i;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_20_0 = (bd) (Object) stackIn_20_0;
                      stackOut_20_1 = (String) (Object) stackIn_20_1;
                      stackOut_20_2 = stackIn_20_2 + (param4 - -param2.field_w) - -param1.field_m;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      if (((db) this).field_a == -2147483648) {
                        stackOut_22_0 = (bd) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        stackIn_23_3 = stackOut_22_3;
                        break L9;
                      } else {
                        stackOut_21_0 = (bd) (Object) stackIn_21_0;
                        stackOut_21_1 = (String) (Object) stackIn_21_1;
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = ((db) this).field_a;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        stackIn_23_3 = stackOut_21_3;
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_23_0 = (bd) (Object) stackIn_23_0;
                      stackOut_23_1 = (String) (Object) stackIn_23_1;
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = stackIn_23_3 + param1.field_c + (param2.field_k + param0);
                      stackOut_23_4 = -param1.field_f + param2.field_p - param1.field_m;
                      stackOut_23_5 = -param1.field_c + (param2.field_t - param1.field_k);
                      stackOut_23_6 = ((db) this).field_e;
                      stackOut_23_7 = ((db) this).field_h;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_25_3 = stackOut_23_3;
                      stackIn_25_4 = stackOut_23_4;
                      stackIn_25_5 = stackOut_23_5;
                      stackIn_25_6 = stackOut_23_6;
                      stackIn_25_7 = stackOut_23_7;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      stackIn_24_3 = stackOut_23_3;
                      stackIn_24_4 = stackOut_23_4;
                      stackIn_24_5 = stackOut_23_5;
                      stackIn_24_6 = stackOut_23_6;
                      stackIn_24_7 = stackOut_23_7;
                      if (((db) this).field_f == -2147483648) {
                        stackOut_25_0 = (bd) (Object) stackIn_25_0;
                        stackOut_25_1 = (String) (Object) stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = stackIn_25_3;
                        stackOut_25_4 = stackIn_25_4;
                        stackOut_25_5 = stackIn_25_5;
                        stackOut_25_6 = stackIn_25_6;
                        stackOut_25_7 = stackIn_25_7;
                        stackOut_25_8 = 256;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        stackIn_26_3 = stackOut_25_3;
                        stackIn_26_4 = stackOut_25_4;
                        stackIn_26_5 = stackOut_25_5;
                        stackIn_26_6 = stackOut_25_6;
                        stackIn_26_7 = stackOut_25_7;
                        stackIn_26_8 = stackOut_25_8;
                        break L10;
                      } else {
                        stackOut_24_0 = (bd) (Object) stackIn_24_0;
                        stackOut_24_1 = (String) (Object) stackIn_24_1;
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = stackIn_24_3;
                        stackOut_24_4 = stackIn_24_4;
                        stackOut_24_5 = stackIn_24_5;
                        stackOut_24_6 = stackIn_24_6;
                        stackOut_24_7 = stackIn_24_7;
                        stackOut_24_8 = ((db) this).field_f;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_26_2 = stackOut_24_2;
                        stackIn_26_3 = stackOut_24_3;
                        stackIn_26_4 = stackOut_24_4;
                        stackIn_26_5 = stackOut_24_5;
                        stackIn_26_6 = stackOut_24_6;
                        stackIn_26_7 = stackOut_24_7;
                        stackIn_26_8 = stackOut_24_8;
                        break L10;
                      }
                    }
                    int discarded$1 = ((bd) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_26_8, param1.field_h, param1.field_d, param1.field_j);
                    break L7;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("db.A(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_c = 0;
    }
}
